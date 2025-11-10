// u08_arrays
// auf8.08a

// Handelskammerpruefung Fachinformatiker
// Sommer 2011 Kernpruefung G2 Handlungsschritt 5

public class Kursteilnehmer
{
   public String kursnummer;
   public double kursgebuehrEUR;
   public int    kundennummer;
   public int    fruehbucherrabatt;
   public String teilnehmer;
   
   public Kursteilnehmer(String kursNr,
                         double gebuehrEUR,
                         int    kdNrAuftraggeber,
                         int    rabatt,
                         String namen)
   {
      kursnummer        = kursNr;
      kursgebuehrEUR    = gebuehrEUR;
      kundennummer      = kdNrAuftraggeber;
      fruehbucherrabatt = rabatt;
      teilnehmer        = namen;
   }
}