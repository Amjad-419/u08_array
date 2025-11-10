// u08_array
// auf8.10

public class Regen2
{
   public static void main (String[] args)
   {

       int rainfall[][] = {{3, 7 , 0, 10, 6}, 
                           {5, 1 , 0, 0 , 6},
                           {4, 18, 3, 0 , 2} };
      int sum = 0;
      for(int region = 0 ; region < rainfall.length; region++)
      {
         for(int tag = 0; tag < rainfall[0].length; tag++) 
         {
            sum += rainfall[region][tag];
         }
      }
      System.out.println(sum);
   }
}
