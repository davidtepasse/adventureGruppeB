
/**
 * Beschreiben Sie hier die Klasse Korb.
 * 
 * @author dt 
 * @version 0.1
 */
public class Korb
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Stack<Waffe> meinStapel;

    /**
     * Konstruktor für Objekte der Klasse Korb
     */
    public Korb()
    {
        // Instanzvariable initialisieren
        meinStapel = new Stack<Waffe>();
    }

    public Waffe waffeAusgeben() {
        Waffe temp = meinStapel.top();
        meinStapel.pop();
        return temp;
    }
    
    public Waffe getWaffe() {
        return meinStapel.top();
    }
    
    public void waffeAufnehmen(Waffe meineWaffe) {
        meinStapel.push(meineWaffe);
    }
 
    public int anzahlWaffen() {
        Stack<Waffe> temp = new Stack<Waffe>();
        int zaehler = 0;
        while(!meinStapel.isEmpty()){
            temp.push(meinStapel.top());
            meinStapel.pop();
            zaehler++;
        }
        while(!temp.isEmpty()){
            meinStapel.push(temp.top());
            temp.pop();
        }
        return zaehler;
    }
    
    public boolean istLeer(){
        return meinStapel.isEmpty();
    }
}
