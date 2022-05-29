

/**
 * Klasse ErweitertesAuto, die von der Superklasse EinfachesAuto ableitet.
 */
public class ErweitertesAuto extends EinfachesAuto {

	private String  standort ;
	private String fahrgestellnummer ;

	/**
  * Konstruktor für die Klasse ErweitertesAuto
  * @param standort
  *            Standort des Autos
  * @param fahrgestellnummer
  *            Fahrgestellnummer des Autos
  */

	public ErweitertesAuto (String besitzer, String autotyp, String farbe,
         int erstzulassung, int leistung, int kmStand ,  String standort ,String fahrgestellnummer) {

		super (besitzer, autotyp, farbe, erstzulassung, leistung, kmStand);
		this.standort = standort;
		this.fahrgestellnummer =  fahrgestellnummer;
	}

	/**
  * Die Methode  setzeNeuesZiel(String ziel, int entfernung) beschreibt die naechste Fahrt: wohin das Auto fährt,
  * und wie weit das neue Ziel ist..
  * @param ziel
  * @param entfernung
  */
		public void setzeNeuesZiel(String ziel, int entfernung) {
			System.out.println ( "Auto fährt von " +  standort + " nach " + ziel);
			System.out.println ( "Die Entfernung beträgt " + entfernung + " km ");
		}

		@Override
		public void meldung() {

			System.out.print("Das Auto von" + this.besitzer + "\n" + "Typ:" + this.autotyp +"\n"+ "Farbe:"+ this.farbe +"\n"+
			        "Jahreszahl der Autozulassung:" + this.erstzulassung + "\n"+ "PS-Zahl:" +  this.leistung + "\n"+ "Kilometerstand:"+ this.kmStand +"\n"+
			        "fahrgestellnummer:" + this.fahrgestellnummer+ "\n" ) ;
		    }


		 @Override
		    public String toString () {
		    	return "Das Auto von" + this.besitzer + "\n" + "Typ:" + this.autotyp +"\n"+ "Farbe:"+ this.farbe +"\n"+
		        "Jahreszahl der Autozulassung:" + this.erstzulassung + "\n"+ "PS-Zahl:" +  this.leistung + "\n"+ "Kilometerstand:"+ this.kmStand +"\n"+
		        "fahrgestellnummer:" + this.fahrgestellnummer ;
	    }
		/**
	     * Die Methode schreibeLinie() schreibt eine Linie auf die Konsole
	     */
		public static void schreibeLinie() {
	        System.out.println("----------------------------------------");
		}

}
