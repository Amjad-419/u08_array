// u08_array
// auf8.3

public class GehaltsBuchhaltung3
{
   public static void main (String[] args)
   {
      int gehalt[] ={1200, 4000, 1000, 700 ,1100};
      
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
