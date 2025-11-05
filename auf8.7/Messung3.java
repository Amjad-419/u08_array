// u08_array
// auf8.7

import java.util.*;

public class Messung3
{
   public static void main (String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      Statistik rechner = new Statistik();
      
      int messWerte[] = new int[10];
      int anzahl = 0;
      
      // Die Messwerte eingeben
      for(int i = 0 ; i < messWerte.length ; i++)
      {
         System.out.printf("Bitte geben Sie den " + (i + 1) + ".Messwert ein: ");
         String eingabe = scanner.nextLine();
         
         if(eingabe.isEmpty())
         {
            break;
         }
         
         messWerte[i]= Integer.parseInt(eingabe);
         anzahl++;
      }
      
      // Den durchschnittswert berchnen
      System.out.println("*********************************");
      double durchschnittswert =rechner.durchschnitt(messWerte, anzahl);
      System.out.printf("%-23s %-1.2f%n","Durchschnittswert:", durchschnittswert);
      
      // Kleinste wert
      int minWert = rechner.minimum(messWerte,anzahl);
      System.out.printf("%-23s %-3d%n","Die kleinste Messwert:", minWert);

      
      // Groesste wert
      int maxWert = rechner.maximum(messWerte,anzahl);
      System.out.printf("%-23s %-3d%n","Die Größte Messwert:", maxWert);
   }
}
