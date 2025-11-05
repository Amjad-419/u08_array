// u08_array
// auf8.7

public class Statistik
{
   public double durchschnitt(int[] messreihe, int anzahl)
   {
      int sum = 0;
      for(int i = 0; i < anzahl; i++)
      {
         sum +=  messreihe[i];
      }
      return (double) sum / anzahl;
   }

   public int minimum(int[] messreihe, int anzahl)
   {
      int minWert = messreihe[0];
      for(int i = 0 ; i < anzahl ; i++)
      {
         if(messreihe[i] < minWert )
         {
            minWert = messreihe[i];
         }
      }
      return minWert;
   }
   
   public int maximum(int[] messreihe, int anzahl)
   {
      int maxWert = messreihe[0];
      for(int i = 0 ; i < anzahl; i++)
      {
         if(messreihe[i] > maxWert )
         {
            maxWert = messreihe[i];
         }
      }
      return maxWert;
   }

   
}
