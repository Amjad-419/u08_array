// u08_array
// auf8.5

import java.util.*;

public class Messung
{
   public static void main (String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      
      int messWerte[] = new int[10];
      int anzahl = 0;
      
      // Die Messwerte eingeben
      for(int i = 0 ; i < messWerte.length ; i++)
      {
         System.out.println("Bitte geben Sie den Messwert ein: ");
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
      
      double durchschnittswert = (double) sum / anzahl;
      System.out.printf("%-20s %3.2f%n","Durchschnittswert:",durchschnittswert);
   }
}
