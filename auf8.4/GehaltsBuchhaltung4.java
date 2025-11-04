// u08_array
// auf8.4

import java.util.*;

public class GehaltsBuchhaltung4
{
   public static void main (String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      int gehalt[] = new int[5];

      System.out.println("Bitte geben Sie den Gehalt: ");
      gehalt[0] = scanner.nextInt();

      System.out.println("Bitte geben Sie den Gehalt: ");
      gehalt[1] = scanner.nextInt();

      System.out.println("Bitte geben Sie den Gehalt: ");
      gehalt[2] = scanner.nextInt();

      System.out.println("Bitte geben Sie den Gehalt: ");
      gehalt[3] = scanner.nextInt();

      System.out.println("Bitte geben Sie den Gehalt: ");
      gehalt[4] = scanner.nextInt();

      // **************** Zweite Lösung *************
      /*
      int gehalt[];

      for(int i = 0 ; i < gehalt.length ; i++)
      {
         System.out.println("Bitte geben Sie den " + (i + 1) + ".Gehalt ein: ");
         gehalt[i] = scanner.nextInt();
      }
      */ 

      for(int i = 0 ; i < gehalt.length ; i++)
      {
         System.out.println(gehalt[i]);
      }

      System.out.println("----------");

      int sum = 0;

      for(int i = 0 ; i < gehalt.length ; i++)
      {
         sum += gehalt[i];
      }
      System.out.println("Die Gesamte der Gehälter:   " + sum);
      System.out.println();

      int  durchschnittlich = sum / gehalt.length;
      System.out.println("Das durchschnittliche Gehalt: " + durchschnittlich);

      int minGehalt = gehalt[0];

      for(int i = 0 ; i < gehalt.length ; i++)
      {
         if(gehalt[i] < minGehalt )
         {
            minGehalt = gehalt[i];
         }
      }

      System.out.println("Die kleinste Gehalt:           " + minGehalt);
   }
}
