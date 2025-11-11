// u08_array
// auf8.17

public class Regen9
{
   public static void main (String[] args)
   {
       int rainfall[][][] = { { {0, 3}, {5, 2},  {0, 0}, {10, 0}, {11, 5} },
                              { {2, 3}, {1, 0},  {0, 0}, {0, 0 }, {0, 6 } }, 
                              { {3, 1}, {12, 6}, {1, 2}, {0, 0 }, {0, 2}  } };

       String region[] = {"Nord", "Mitte", "Sued"};
       String tage[]   = {"Mo", "Di", "Mi", "Do", "Fr"};
       String zeit[]   = {"morgens", "abends"};

       final int MORGENS = 0;
       final int ABENDS  = 1;
       int sumMorgens    = 0;
       int sumAbends     = 0;
       int total         = 0;

       System.out.print("Durchschnitt: ");
 
       for(int r = 0 ; r < rainfall.length; r++)
       {
          for(int t = 0; t < rainfall[r].length; t++) 
          {
             sumMorgens += rainfall[r][t][MORGENS];
             sumAbends += rainfall[r][t][ABENDS];
             total++;
          }
       }

       double durchschnitMorgens = (double) sumMorgens / total;
       double durchschnitAbends = (double) sumAbends / total;
             
       System.out.print("   "+ zeit[MORGENS] + "   " + durchschnitMorgens + " mm "+
                               zeit[ABENDS] + "   " + durchschnitAbends +" mm "); 
       System.out.println();   
                      
      // *******************************************************************

       System.out.print("Trokene Tage: ");
       
       for(int r = 0 ; r < rainfall.length; r++)
       {
          int trokeneTage = 0;

          for(int t = 0; t < rainfall[r].length; t++) 
          {
             if( rainfall[r][t][MORGENS] == 0 && rainfall[r][t][ABENDS] == 0)
             {
                trokeneTage++;
             }
          }

          System.out.print("    "+ region[r] + "   " + trokeneTage);
       } 

       System.out.println();
       
       // *******************************************************************
       
       System.out.print("Maximal-Regen: ");
       
       int maxRegen = -1;
       int maxR = 0;
       int maxT = 0;
       int maxZ = 0;
       
       for(int r = 0 ; r < rainfall.length; r++)
       {
          for(int t = 0; t < rainfall[r].length; t++) 
          {
             for(int z = 0; z < rainfall[r][t].length; z++) 
             {
                if( rainfall[r][t][z] > maxRegen)
                {
                   maxRegen = rainfall[r][t][z];
                   maxR = r;
                   maxT = t;
                   maxZ = z;
                }
             }
          }
       } 

       System.out.print("  Region "+ region[maxR] + "  "+ tage[maxT] + "  " +
                                   zeit[maxZ] + "  " + maxRegen+ " mm");
       System.out.println();
   }
}
