// u08_arrays
// auf8.08a

public class Buchhaltung
{
   public Kursteilnehmer[] kursteilnehmer;
   
   // Folgende Felder stehen zur Verfügung:
   // kursteilnehmer[i].kundennummer
   // kursteilnehmer[i].kursgebuehrEUR
   // kursteilnehmer[i].fruehbucherrabatt
   
   public double rechnungsbetrag_ermittlung(int kundennummer, int anzahl)
   {
      double rechnungsbetrag = 0.0;
      int teilnehmerProFirma = 0;
      
      for (int i = 0; i < anzahl; i++)
      {
         if (kursteilnehmer[i].kundennummer == kundennummer)
         {
            teilnehmerProFirma++;
            
            double gebuehr = kursteilnehmer[i].kursgebuehrEUR;
            double rabatt = kursteilnehmer[i].fruehbucherrabatt;
            double betragNachFruehbucher = gebuehr - (gebuehr * rabatt / 100.0);
            
            rechnungsbetrag += betragNachFruehbucher;
         }
      }
      
      if (teilnehmerProFirma >= 5)
      {
         rechnungsbetrag = rechnungsbetrag * 0.92; //  8%
      }
      else if (teilnehmerProFirma >= 3)
      {
         rechnungsbetrag = rechnungsbetrag * 0.95; //  5%
      }
      
      return rechnungsbetrag;
   }
}
