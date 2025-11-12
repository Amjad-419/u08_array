// u08_array
// auf8.20

public class Lagerverwaltung2
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
       String monate[] = {"Januer", "Februar", "Maerz",
                          "April" , "Mai"    , "Juni" ,
                          "Juli","August"   ,"Septemper",
                          "Oktoper", "Novemoper","Dezemper",};

      int        artikelNr  = 0;      
      int        total      = 0;
      int        monatssaldo= 0;

      final int   ARNR      = 0;
      final int   MOANT     = 1;
      final int 	AENDERUNG = 2;
      
      for(int i = 0; i < lager.length; i++)
      {
         // auesserer Gruppenkopf
         if(artikelNr != lager[i][ARNR]) 
         {
            artikelNr = lager[i][ARNR];
            System.out.println("Artikel-Nr: " + artikelNr);
         }
         
         // Innnerer  Gruppenkopf
         if( i == 0 || lager[i-1][MOANT] != lager[i][MOANT])
         {
            for(int j = 0; j < monate.length; j++)
            {
               if(j == lager[i][MOANT] -1)
               {
                  System.out.println();
                  System.out.println("Monat " + monate[j]);
               }
            }
         }

         // Gruppenrumpf
         if(lager[i][AENDERUNG] >= 0)
         {
            System.out.printf("%-18s %+d%n", "Bestand-Aenderung", lager[i][AENDERUNG]);
         }
         else
         {
            System.out.printf("%-18s %+d%n", "Bestand-Aenderung", lager[i][AENDERUNG]);
         }

         monatssaldo += lager[i][AENDERUNG];
         total       += lager[i][AENDERUNG];

         // Innerer Gruppenfuss
         if(i == lager.length -1 || lager[i][MOANT] != lager[i+1][MOANT])
         {
            if(monatssaldo >= 0)
            {
               System.out.printf("%-13s %+d%n","Monats-Saldo", monatssaldo);  //ist +
            }
            else
            {
               System.out.printf("%-13s %+d%n","Monats-Saldo", monatssaldo);   // ist -
            }

            monatssaldo= 0;
         }

         // Auesserer Gruppenfuss
         if(i == lager.length -1 || artikelNr != lager[i + 1][ARNR])  // i + 1 bedeutet die naechste
         {
            System.out.println();
            System.out.println("Artikel-Bestand:    " + total);
            System.out.println("----------------------");
            total     = 0;                                        // muss noch mal null sein
         }
      }
   }
}