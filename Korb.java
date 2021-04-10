
/**
 * Beschreiben Sie hier die Klasse Korb.
 * 
 * @author dt 
 * @version 0.1
 */
public class Korb
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private List<Auftrag> auftragsSpeicher;

    /**
     * Konstruktor für Objekte der Klasse Korb
     */
    public Korb()
    {
        // Instanzvariable initialisieren
        auftragsSpeicher = new List<Auftrag>();
    }

    //das erste objekt wird das aktuelle, das wird dann ausgegeben. ist kein objekt vorhanden, wird null ausgegeben
    public Auftrag naechstenAuftragAusgeben() {
        auftragsSpeicher.toFirst();
        if (auftragsSpeicher.hasAccess()==true) {            
            return auftragsSpeicher.getContent();
        }
        else {
            return null;
        }
    }
    
    //das oberste objekt wird gelöscht
    public void loescheOberstenAuftrag() {
        auftragsSpeicher.toFirst();
        auftragsSpeicher.remove();
    }
    
    //der erste auftrag wird ausgegeben, kein unterschied zur methode naechstenAuftragAusgeben mehr, deshalb eig überflüssig 
    public Auftrag getNaechstenAuftrag() {
        auftragsSpeicher.toFirst();
        return auftragsSpeicher.getContent();
    }

    //auftrag aufnehmen und in der Liste passend einsortieren
    public void auftragAufnehmen(Auftrag meinAuftrag) {
        //1. Fall: Liste leer, der Auftrag wird an Stelle 0 gespeichert
        auftragsSpeicher.toFirst();
        boolean eingefuegt=false;
        if (auftragsSpeicher.hasAccess()==false) {
            auftragsSpeicher.append(meinAuftrag);
        }
        //2. Fall: liste nicht leer, auftrag wird zwischen/vor anderen aufträgen eingefügt
        else {
            while (eingefuegt!=true && auftragsSpeicher.hasAccess()) {
                if (meinAuftrag.getBestechungsgeld() > auftragsSpeicher.getContent().getBestechungsgeld()) {
                    auftragsSpeicher.insert(meinAuftrag);
                    eingefuegt=true;
                }
                auftragsSpeicher.next();
            }
            //3. Fall: auftrag muss am Ende eingefügt werden, das bestechungsgeld ist am kleinsten bzw gleich groß wie das kleinste
            if (eingefuegt!=true) {
                auftragsSpeicher.append(meinAuftrag);
            }
        }
    }

    // die aufträge werden gezählt
    public int anzahlAuftraege() {
        int zaehler = 0;
        auftragsSpeicher.toFirst();
        while (auftragsSpeicher.hasAccess()) {
            zaehler++;
            auftragsSpeicher.next();
        }
        return zaehler;
    }

    //es wird überprüft, ob die Liste leer ist und aufträge vorhanden sind
    public boolean istLeer(){
        return auftragsSpeicher.hasAccess();
    }
}
