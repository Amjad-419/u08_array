// u08_array
// auf8.13

public class Regen5
{
   public static void main (String[] args)
   {
       int rainfall[][] = {{3, 7 , 0, 10, 16}, 
                           {5, 1 , 0, 0 , 6},
                           {4, 18, 3, 0 , 2} };

       String tage[] = {"Mo", "Di", "Mi", "Do", "Fr"};

       System.out.print("Summe (mm):  ");

       for(int j = 0 ; j < rainfall[0].length; j++)
       {
          int sum = 0;
          for(int i = 0; i < rainfall.length; i++) 
          {
             sum += rainfall[i][j];
          }

          System.out.print(tage[j]+ " " +sum + "   ");
       } 

       System.out.println();
   }
}
