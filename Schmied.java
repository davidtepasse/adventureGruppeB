
/**
 * Beschreiben Sie hier die Klasse Schmied.
 * 
 * @author dt
 * @version 0.1
 */
public class Schmied extends Karacter
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Korb lager;

    /**
     * Konstruktor für Objekte der Klasse Schmied
     * 
     * pLager wird jetzt übergeben, damit der schmied auf die Aufträge im Korb zugreifen kann
     */
    public Schmied(Korb pLager)
    {
        // Instanzvariable initialisieren
        super("Hauer",100,1);
        lager = pLager;
    }

    //das erste Objekt in Auftrag wird als temp gespeichert, repariert und dann in lager die oberste, die als temp gespeichert wurde, gelöscht
    public void reparieren() {
        Auftrag temp = lager.naechstenAuftragAusgeben();
        //Fehlermeldung einbauen: kein Auftrag verfügbar (sonst NullpointerExeption)
        temp.getWaffe().setZustand(temp.getWaffe().getZustand()+10);
        lager.loescheOberstenAuftrag();
    }
}
