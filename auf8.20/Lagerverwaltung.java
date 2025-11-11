// u08_array
// auf8.20

public class Lagerverwaltung
{
   public static void main(String[] args)
   {
                    // ArNr  Monat  aenderung
      int[][] lager = { {4711, 3, +60},
                        {4711, 3, -10},
                        {4711, 3, -30},
                        {4711, 3, +30},
                        
                        {4711, 5, -20},
                        {4711, 5, -10},
                        {4711, 5, +40},
                        
                        {4711, 7, -20},
                        {4711, 7, +40},
                        {4711, 7, -60},
                        {4711, 7, +50},
                        {4711, 7, -10},    // 60
                        
                        {4712, 3, +70},
                        {4712, 3, -10},
                        
                        {4712, 4, -30},
                        {4712, 4, -10},
                        {4712, 4, +40},
                        {4712, 4, -50},
                        
                        {4712, 6, -10},    // 0
                        
                        {4713, 2, +30},
                        {4713, 2, +20},
                        
                        {4713, 5, -20},
                        {4713, 5, +40},
                        {4713, 5, -30}  }; // 40
      
      //-------------------------------------------------------
      // Hier folgt der Code zur Loesung der Aufgabe:
      int artikelNr = 0;      

      System.out.println("Artikel-Nr: ");
      for(int i = 0; i < lager.length; i++)
      {
         if(artikelNr != lager[i][0]) 
         {
            artikelNr = lager[i][0];
            System.out.println();
            System.out.println("Artikel-Nr: " + artikelNr);
         }

         if(lager[i][2] >= 0)
         {
            System.out.println ("Bestand-Aenderung +" + lager[i][2]);
         }
         else
         {
            System.out.println ("Bestand-Aenderung " + lager[i][2]);
         }
      }
   }
}