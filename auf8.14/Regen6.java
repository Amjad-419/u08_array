// u08_array
// auf8.14

public class Regen6
{
   public static void main (String[] args)
   {
       int rainfall[][] = {{3, 7 , 0, 10, 16}, 
                           {5, 1 , 0, 0 , 6},
                           {4, 18, 3, 0 , 2} };

       String region[] = {"Nord", "Mitte", "Sued"};

       System.out.print("Summe (mm): ");
       for(int i = 0 ; i < rainfall.length; i++)
       {
          int sum =0;
          for(int j = 0; j < rainfall[0].length; j++) 
          {
             sum += rainfall[i][j];
          }
          double durchschnitt = (double) sum / rainfall[0].length;

          System.out.print("   "+ region[i] + " " + durchschnitt);
       } 

       System.out.println();
   }
}
