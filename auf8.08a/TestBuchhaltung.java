// u08_arrays
// auf8.08a

// Handelskammerpruefung Fachinformatiker
// Sommer 2011 Kernpruefung G2 Handlungsschritt 5

public class TestBuchhaltung
{
   public static void main(String[] args)
   {
      Kursteilnehmer[] kursteilnehmer = new Kursteilnehmer[20];
      
      kursteilnehmer[0] = new Kursteilnehmer("201105", 480.00, 5001, 20, "Anders, Max"    );
      kursteilnehmer[1] = new Kursteilnehmer("201105", 480.00, 4005,  0, "Meier, Paul"    );
      kursteilnehmer[2] = new Kursteilnehmer("201105", 480.00, 4005,  0, "Mueller, Anna"  );
      kursteilnehmer[3] = new Kursteilnehmer("201105", 480.00, 3100,  0, "Mueller, Klaus" );
      kursteilnehmer[4] = new Kursteilnehmer("201105", 980.00, 1200, 20, "Schneider, Hans");
      kursteilnehmer[5] = new Kursteilnehmer("201105", 980.00, 3100,  0, "Zuse, Maria"    );
      kursteilnehmer[6] = new Kursteilnehmer("201105", 980.00, 4005,  0, "Lippmann, Jan"  );
      kursteilnehmer[7] = new Kursteilnehmer("201105", 480.00, 5001, 20, "Mirkan, Arin"   );
      kursteilnehmer[8] = new Kursteilnehmer("201105", 480.00, 5001, 20, "Leila, Abu"     );
      kursteilnehmer[9] = new Kursteilnehmer("201105", 480.00, 5001, 20, "Polat, Can"     );
      kursteilnehmer[10]= new Kursteilnehmer("201105", 480.00, 5001, 20, "Kendal, Biharin");
      kursteilnehmer[11]= new Kursteilnehmer("201105", 480.00, 5001,  0, "Jochim, Kevin"  );
      kursteilnehmer[12]= new Kursteilnehmer("201105", 480.00, 5001,  0, "Cudi, Zozan"    );
      kursteilnehmer[13]= new Kursteilnehmer("201105", 480.00, 5001,  0, "Levi, Shirley"  );
      kursteilnehmer[14]= new Kursteilnehmer("201105", 480.00, 5001,  0, "Savage, William");
      kursteilnehmer[15]= new Kursteilnehmer("201105", 480.00, 5001,  0, "Helsten, Gunter");
      
      Buchhaltung buchhaltung    = new Buchhaltung();
      buchhaltung.kursteilnehmer = kursteilnehmer;
      
      double betrag1;
      double betrag2;
      double betrag3;
      double betrag4;
      
      betrag1 = buchhaltung.rechnungsbetrag_ermittlung(1200,16);
      betrag2 = buchhaltung.rechnungsbetrag_ermittlung(3100,16);
      betrag3 = buchhaltung.rechnungsbetrag_ermittlung(4005,16);
      betrag4 = buchhaltung.rechnungsbetrag_ermittlung(5001,16);
      
      System.out.println("Kunde 1200:  Soll = 784.0   Ist = " + betrag1);
      System.out.println("Kunde 3100:  Soll = 1460.0  Ist = " + betrag2);
      System.out.println("Kunde 4005:  Soll = 1881.8  Ist = " + betrag3);
      System.out.println("Kunde 5001:  Soll = 4104.0  Ist = " + betrag4);
   }
}