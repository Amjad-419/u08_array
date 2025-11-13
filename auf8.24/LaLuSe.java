// u08_array
// auf8.24

// Handelskammerpruefung Fachinformatiker Anwendungsentwicklung
// Winter 2011 Fachpruefung G1 Handlungsschritt 4

public class LaLuSe
{
   public static Container[]   bay0 = new Container[4];
   public static Container[]   bay1 = new Container[4];
   public static Container[]   bay2 = new Container[4];
   public static Container[][] stauraum = {bay0, bay1, bay2};
   public static int[]         gewichtVonBayNr = {0,  0,  0};
   public static Container[]   containerListe;

   public static void main(String[] args)
   {
      // stauraum mit "virtuellen" Containern vorbelegen
      for(Container[] bay: stauraum)
      {
         for(int i = 0; i < bay.length; i++)
         {
            bay[i] = new Container(0, 0);
         }
      }

      containerListe = new Container[12];
      
      // containerListe mit Testdaten fuellen
      containerListe[ 0] = new Container( 1, 23);
      containerListe[ 1] = new Container( 2, 22);
      containerListe[ 2] = new Container( 3, 11);
      containerListe[ 3] = new Container( 4, 10);
      containerListe[ 4] = new Container( 5,  9);
      containerListe[ 5] = new Container( 6,  9);
      containerListe[ 6] = new Container( 7,  8);
      containerListe[ 7] = new Container( 8,  8);
      containerListe[ 8] = new Container( 9,  8);
      containerListe[ 9] = new Container(10,  7);
      containerListe[10] = new Container(11,  7);
      containerListe[11] = new Container(12,  6);
      
      // stauplanung durchfuehren
      stauplan();
      
      // stauplan ausgeben
      stauplanAusgeben();
   }
   
   //==========================================================
   // Hier wird die Loesung der Aufgabe implementiert:
   
   public static void stauplan()
   {
     // Sondeerfall: Der erste Container muss in bay0 tier0
     // Durch die containerliste iterieren bis die Liste
     // abgeabeitet ist:
     // Leichteste bay suchen, die noch platu hat.
     // Dann muss der naechste Container an diesen Platez gestellt werden.
     // Die naechste frei tier in dieser ba< ermitteln.
     // Dann den aktuellen Container an diesen Platz stellen.
     // Das Gewicht der bay aktualiseieren.

     for(int i = 0; i < containerListe.length; i ++)
     {
        int kleinstesGewicht = Integer.MAX_VALUE;
        int beladeBayNr = 0;

        for(int bayNr = 0; bayNr < gewichtVonBayNr.length; bayNr ++)
        {
           if( gewichtVonBayNr[bayNr] < kleinstesGewicht && stauraum[bayNr][3].gewicht == 0)
           {
              kleinstesGewicht = gewichtVonBayNr[bayNr];
              beladeBayNr = bayNr;
           }
        }

         int beladeTierNr = 0;

        for(int tierNr = 0; tierNr  < stauraum[beladeBayNr].length; tierNr  ++)
        {
           if(stauraum[beladeBayNr][tierNr].gewicht == 0)
           {
              beladeTierNr  = tierNr;
              break;
           }
        }

        stauraum[beladeBayNr][beladeTierNr ] = containerListe[i];
        gewichtVonBayNr[beladeBayNr] += stauraum[beladeBayNr][beladeTierNr].gewicht;
     }
   }

   //==========================================================

   public static void stauplanAusgeben()
   {
      for(int bayNr = 0; bayNr < stauraum.length; bayNr++)
      {
         System.out.println("Bay " + (bayNr + 1));
          
         for(int tierNr = 0                     ;
                 tierNr < stauraum[bayNr].length;
                 tierNr++                        )
         {
            System.out.print  ("   Tier " + (tierNr + 1)     );
            System.out.print  ("   CNr. "                    );
            System.out.print  (stauraum[bayNr][tierNr].nr    );
            System.out.print  ("   "                         );
            System.out.println(stauraum[bayNr][tierNr].gewicht
                                                       + " t");
         }
         
         // Gesamtgewicht der Bay ausgeben
         System.out.print  ("           Beladung ");
         System.out.println(gewichtVonBayNr[bayNr] + " t");
         System.out.println();
      }
   }
}