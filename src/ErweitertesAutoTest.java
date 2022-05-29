

public class ErweitertesAutoTest {

	public static void main(String[] args) {

        ErweitertesAuto auto1 = new ErweitertesAuto (" Sabrina Müller", "Volkswagen Lavida", "Blau", 2018 , 110, 8000, "Hamburg ", "WVWZZZ-1JZ3W386752");
        ErweitertesAuto auto2 = new ErweitertesAuto (" Sabrina Müller", "Toyota Camry", "Weiß", 2017, 130, 10000, " Berlin ", " WSS166007-1J-236565" );
        ErweitertesAuto auto3 = new ErweitertesAuto (" Sabrina Müller", "BMW X1", "Rot", 2015, 140, 15000, "Leipzig ", "WDD169007-1J-236589" );
        ErweitertesAuto auto4 = new ErweitertesAuto (" Sabrina Müller", "Mercedes-Benz B-Class", "Schwarz ", 2019, 110, 6000, "Nürnberg", "WVxZ1J-Z3W986743");

        auto1.meldung();
        auto1.setzeNeuesZiel("Berlin ", 282);
        System.out.println( "Alter des Auto: " +auto1.getAlter() + " Jahre");
        ErweitertesAuto.schreibeLinie();

        auto2.meldung();
        auto2.setzeNeuesZiel("Leipzig", 190);
        System.out.println( "Alter des Auto: " +auto2.getAlter() + " Jahre");
        ErweitertesAuto.schreibeLinie();

        auto3.meldung();
        auto3.setzeNeuesZiel("Nürnberg" , 281);
        System.out.println( "Alter des Auto: " +auto3.getAlter() + " Jahre");
        ErweitertesAuto.schreibeLinie();

        auto4.meldung();
        auto4.setzeNeuesZiel("München", 169);
        System.out.println( "Alter des Auto: " +auto4.getAlter() + " Jahre");
        ErweitertesAuto.schreibeLinie();


    }

}


