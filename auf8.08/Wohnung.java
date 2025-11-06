// u08_array
// auf8.08

public class Wohnung
{
   private int     mieterNr;
   private int     flaecheInQm;
   private double  preisProQm;
   private double  nebenkosten;
   private boolean garage;
   
   public Wohnung(int     mieterNr   ,
                  int     flaecheInQm,
                  double  preisProQm ,
                  double  nebenkosten,
                  boolean garage     )
   {
      this.mieterNr    = mieterNr;
      this.flaecheInQm = flaecheInQm;
      this.preisProQm  = preisProQm;
      this.nebenkosten = nebenkosten;
      this.garage      = garage;
   }
   
   public int getMieterNr()
   {
      return this.mieterNr;
   }
   
   public int getFlaecheInQm()
   {
      return this.flaecheInQm;
   }
   
   public double getPreisProQm()
   {
      return this.preisProQm;
   }
   
   public double getNebenkosten()
   {
      return this.nebenkosten;
   }
   
   public boolean getGarage()
   {
      return this.garage;
   }
}