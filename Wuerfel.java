/**
 * Klasse Würfel - für die Kampfregel
 * @version 1.0
 * @author dt
 * 
 */ 
public class Wuerfel {

    private int anzahlSeiten;

    /**
     * Erstellt einen neuen Wuerfel
     * 
     * @param anzahlSeiten die Anzahl der Seiten des Wuerfels
     */
    public Wuerfel(int anzahlSeiten) {
        this.anzahlSeiten = anzahlSeiten;
    }

    /**
     * Laesst den Wuerfel wuerfeln
     * 
     * @return die Zahl die gewuerfelt wurde
     */
    public int wuerfeln() {
        return (int) (Math.random() * anzahlSeiten + 1);
    }

}
