// u08_array
// auf8.2

public class GehaltsBuchhaltung
{
   public static void main (String[] args)
   {
      int gehalt[] ={1200, 4000, 1000, 700 ,1100};
      
      for(int i = 0 ; i < gehalt.length ; i++)
      {
         System.out.println(gehalt[i]);
      }

      int sum = 0;

      for(int i = 0 ; i < gehalt.length ; i++)
      {
         sum += gehalt[i];
      }
      System.out.println("Die Gesamte der Gehälter: " + sum);
   }
}
