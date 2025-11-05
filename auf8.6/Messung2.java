// u08_array
// auf8.6

import java.util.*;

public class Messung2
{
   public static void main (String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      
      int messWerte[] = new int[10];
      int anzahl = 0;
      
      // Die Messwerte eingeben
      for(int i = 0 ; i < messWerte.length ; i++)
      {
         System.out.printf("Bitte geben Sie den Messwert ein: ");
         String eingabe = scanner.nextLine();
         
         if(eingabe.isEmpty())
         {
            break;
         }
         
         messWerte[i] = Integer.parseInt(eingabe);
         anzahl++;
      }
      
      // Den durchschnittswert berchnen
      int sum = 0;
      for(int i = 0; i < anzahl; i++)
      {
         sum +=  messWerte[i];
      }
      
      System.out.println("*********************************");
      double durchschnittswert = (double) sum / anzahl;
      System.out.printf("%-22s %3.2f%n","Durchschnittswert:", durchschnittswert);
      
      // Kleinste wert
      int minWert = messWerte[0];
      for(int i = 0 ; i < anzahl; i++)
      {
         if(messWerte[i] < minWert )
         {
            minWert = messWerte[i];
         }
      }
      System.out.printf("%-22s %3d%n","Die kleinste Messwert:", minWert);
      
      // Groesste wert
      int maxWert = messWerte[0];
      for(int i = 0 ; i < anzahl; i++)
      {
         if(messWerte[i] > maxWert )
         {
            maxWert = messWerte[i];
         }
      }
      System.out.printf("%-22s %3d%n","Die Größte Messwert:", maxWert);
   }
}
