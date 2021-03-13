/**
 * Die Wartebank zum verwalten der Helden
 *
 * @author dt
 * @version 0.1
 */
public class Wartebank
{
    //deklaration der Warteschlange
    private privatQueue warteschlange;

    /**
     * Konstruktor für Objekte der Klasse Heiler
     */
    public Wartebank()
    {
        //initialisierung / erzeugung der Warteschlange
        warteschlange = new privatQueue();
    }

    /**
     * nimmt einen Helden in die Warteschlange auf
     */
    public void heldAufnehmen(Held krankerWurm) {
        //TODO
        warteschlange.enqueue(krankerWurm);
    }
    
    /**
     * schickt den vordersten Helden zum Heiler
     */
    public Held heldVorlassen() {
        Held temp = warteschlange.front();
        warteschlange.dequeue();
        return temp;
    }
    
    /**
     * gibt die Anzahl aller Wartenden an
     */
    public int gibAnzahlAnWartenden() {
        //TODO //schwierig!
        Queue<Held> temp = new Queue<Held>();
        int zaehler = 0;
        
        while (!warteschlange.isEmpty()){
            temp.enqueue(warteschlange.front());
            zaehler++;
            warteschlange.dequeue();
        }
        
        //neu!!!
        while (!temp.isEmpty()){
            warteschlange.enqueue(temp.front());
            temp.dequeue();
        }

        return zaehler;
    }
    
    /**
     * prüft, ob leer
     */
    public boolean istLeer() {
        //TODO
        return warteschlange.isEmpty();
    }
    
    /**
     * gibt den Namen des vordersten Helden zurück
     */
    public String nameDesNaechsten() {
        //TODO
        return warteschlange.front().getName();
    }
    
    
}
