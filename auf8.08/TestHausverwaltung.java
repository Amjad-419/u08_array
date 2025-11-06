// u08_array
// auf8.08

public class TestHausverwaltung
{
   public static void main(String[] args)
   {
      Wohnung[] wohnungen = new Wohnung[5];
      
      wohnungen[0] = new Wohnung(4711, 100, 15, 450, true ); // 2000
      wohnungen[1] = new Wohnung(4712,  80, 10, 200, false); // 1000
      wohnungen[2] = new Wohnung(4711, 200, 18, 400, false); // 4000
      wohnungen[3] = new Wohnung(4712,  80, 30, 550, true ); // 3000
      wohnungen[4] = new Wohnung(4711, 100, 15, 500, false); // 2000
      
      Hausverwaltung verwaltung = new Hausverwaltung();
      verwaltung.setWohnungen(wohnungen);
      
      double miete1 = verwaltung.gesamtmiete(4711);
      double miete2 = verwaltung.gesamtmiete(4712);
      
      boolean test1 = (miete1 == 8000.0);
      boolean test2 = (miete2 == 4000.0);
      
      System.out.println(test1);
      System.out.println(test2);
   }
}