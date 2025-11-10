// u08_array
// auf8.15

public class Regen7
{
   public static void main (String[] args)
   {
       int rainfall[][][] = { { {0, 3}, {5, 2},  {0, 0}, {10, 0}, {11, 5} },
                              { {2, 3}, {1, 0},  {0, 0}, {0, 0 }, {0, 6 } }, 
                              { {3, 1}, {12, 6}, {1, 2}, {0, 0 }, {0, 2}  } };

       String region[] = {"Nord", "Mitte", "Sued"};
       String tage[]   = {"Mo", "Di", "Mi", "Do", "Fr"};
       
       System.out.print("Summe (mm): ");
       for(int r = 0 ; r < rainfall.length; r++)
       {
          int sum =0;
          for(int t = 0; t < rainfall[r].length; t++) 
          {
             for(int z = 0; z < rainfall[r][t].length; z++) 
             {
                sum += rainfall[r][t][z];
             }
          }

          System.out.print("   "+ region[r] + "  " + sum);
       } 

       System.out.println();

       //+++++++++++++++++++++++++++++++++

       System.out.print("Summe (mm):    ");
       for(int t = 0; t < rainfall[0].length; t++) 
       {
          int sum =0;

          for(int r = 0; r < rainfall.length; r++) 
          {
             for(int z = 0; z < rainfall[r][t].length; z++) 
             {
                sum += rainfall[r][t][z];
             }
          }

          System.out.print(tage[t]+ " " +sum + "      ");
       }

       System.out.println();
   }
}
