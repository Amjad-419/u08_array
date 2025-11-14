// u08_array
// auf8.26

// Handelskammerpruefung Fachinformatiker Anwendungsentwicklung
// Winter 2012 Fachpruefung G1 Handlungsschritt 3

import java.util.*;

/*
 * Mittels Vererbung steht folgendes Array zur Verfuegung:
 * int[][] VKA;
 *
 * Mittels Vererbung stehen folgende Funktionen zur Verfuegung:
 *
 * Order    getOrderData(Integer nr)
 * Agent    getAgentData(Integer nr)
 * Customer getCustomerData(Integer nr)
 * void     printOrderData(Order auftrag)
 * void     printAgentData(Agent vertreter)
 * void     printCustomerData(Customer kunde)
 * void     printSum(String text, Double netto, Double prov)
 * void     printMaxText(Integer vertreterNr, Double netto)
 *
 * Mit "java Start" kann die Anwendung gestartet werden.
 */
public class ReportGenerator extends ReportDaten {
   public void erstelleReport() {
      // Folgende Zeilen demonstrieren die Form der Ausgabe
      // der o.g. Funktionen.
      // Sie koennen nach erfolgreichem Test und vor der
      // eigenen Programmierung geloescht oder
      // herauskommentiert werden:

      /*
      System.out.println("====================");
      System.out.println("Testausgabe");
      System.out.println();
      printSum("Summe           ", 2730.00, 189.90);
      printSum("Vertreter Gesamt", 2730.00, 189.90);
      printMaxText(4711, 2730.00);
      System.out.println();
      System.out.println("Ende der Testausgabe");
      System.out.println("====================");
      System.out.println();
      */

      // =======================================================
      // Hier beginnt der Code zur Loesung der Aufgabe
     
      // Eir erstellen ien for-Syshleife mit mehrern if-Bedingungen
      // fret eine Iteration durch das Array VKA.

      double nettoGesamtUmsatzKunde          = 0;
      double provisionsBetragKunde           = 0;
      double provisionsSatz                  = 0;
      double nettoUmsatzKunde                = 0;
      double nettoGesamtUmsatzVertreter      = 0;
      double provisionsGesamtBetragVertreter = 0;
      double nettoGesamtUmsatz               = 0;
      double provisionsGesamtBetrag          = 0;
      double maxUmsatz                       = 0;
      int    maxUmsatzVertreterNr            = 0;

      for (int i = 0; i < VKA.length; i++)
      {
         // Vertreter-Kopf********************
         if (i == 0 || VKA[i][0] != VKA[i-1][0])
         {
            printAgentData(getAgentData(VKA[i][0]));

            nettoGesamtUmsatzVertreter       = 0;
            provisionsGesamtBetragVertreter  = 0;
         }

         // kunden-kopf***********************
         if (i == 0 || VKA[i][1] != VKA[i-1][1])
         {
            printCustomerData(getCustomerData(VKA[i][1]));
            nettoGesamtUmsatzKunde = 0;
            provisionsBetragKunde  = 0;
         }

         // Rumpf fuer jeden Auftrag***************
         printOrderData(getOrderData(VKA[i][2]));

         nettoGesamtUmsatzKunde += getOrderData(VKA[i][2]).getNetto();
         provisionsSatz          = getOrderData(VKA[i][2]).getProv();
         nettoUmsatzKunde        = getOrderData(VKA[i][2]).getNetto();   
         provisionsBetragKunde  += nettoUmsatzKunde * provisionsSatz / 100;

         // Kunden-fuss******************************
         if (i == VKA.length-1 || VKA[i][1] != VKA[i+1][1])
         {
            printSum("Summe             ", nettoGesamtUmsatzKunde, provisionsBetragKunde);

            nettoGesamtUmsatzVertreter      += nettoGesamtUmsatzKunde;
            provisionsGesamtBetragVertreter += provisionsBetragKunde;
         

         }

         // Vertreter-fuss **************************
         if (i == VKA.length-1 || VKA[i][0] != VKA[i+1][0])
         {
            printSum("Vertreter Gesamt", nettoGesamtUmsatzVertreter, provisionsGesamtBetragVertreter);
            
            nettoGesamtUmsatz      += nettoGesamtUmsatzVertreter;
            provisionsGesamtBetrag += provisionsGesamtBetragVertreter;
 
            if(maxUmsatz < nettoGesamtUmsatzVertreter)
            {
                maxUmsatz            = nettoGesamtUmsatzVertreter;
                maxUmsatzVertreterNr = VKA[i][0];
            }
         }
      }

      // Listen-fuss******************************
      printSum("Summen Gesamt      ", nettoGesamtUmsatz, provisionsGesamtBetrag);
      printMaxText(maxUmsatzVertreterNr, maxUmsatz);

      // Hier endet der Code zur Loesung der Aufgabe
      // =======================================================
   }
}