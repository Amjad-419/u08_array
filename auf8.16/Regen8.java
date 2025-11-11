// u08_array
// auf8.16

public class Regen8
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

          double durchschnitt = (double) sum / rainfall[tag].length;
          System.out.print("   "+ region[r] + "  " + durchschnitt);
       } 

       System.out.println();
   }
}
