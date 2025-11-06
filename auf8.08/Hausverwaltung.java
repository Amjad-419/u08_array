// u08_array
// auf8.08

public class Hausverwaltung
{
   private Wohnung[] wohnung;
   
   public void setWohnungen(Wohnung[] wohnung)
   {
      this.wohnung = wohnung;
   }
   
   // Hier folgt der Code der Funktion "gesamtmiete":
   
   public double gesamtmiete(int mieterNr)
   {
      double sum= 0.0;
      
      for(Wohnung w : wohnung)
      {
         if(w.getMieterNr() == mieterNr)
         {
            double miete = (w.getFlaecheInQm() * w.getPreisProQm()) + w.getNebenkosten();
            if (w.getGarage())
            {
               miete += 50.0;
            }
            sum += miete;
         }
      }
      return sum;
   }
}