
/**
 * Beschreiben Sie hier die Klasse privatWartebank.
 * 
 * @author dt
 * @version 0.1
 */
public class privatQueue
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Queue<Held> pschlange;

    /**
     * Konstruktor für Objekte der Klasse privatWartebank
     */
    public privatQueue()
    {
        // Instanzvariable initialisieren
        pschlange = new Queue<Held>();
    }

    /**
     * hier werden 3 Fälle unterschieden:
     * 1) H ist privat und auch andere private dabei => hinter die anderen privaten einfügen
     * 2) H ist privat und eine anderen privaten => er steht am ende vor allen in der Schlange
     * 3) H ist nicht privat => ganz normal einfügen
     */
    public void enqueue(Held h)
    {
        if (h.getPrivat()){ // ist der überhaupt privat?
            if(pschlange.isEmpty()) pschlange.enqueue(h);
            else {
                if(pschlange.front().getPrivat()){
                    // ist privat und noch andere private dabei => an der richtigen stelle einfügen
                    Queue<Held> temp = new Queue<Held>();
                    // alle privaten in eine Hilfsschlange
                    // erst alle in eine Hilfsschlange
                    while (pschlange.front().getPrivat()){
                        temp.enqueue(pschlange.front());
                        pschlange.dequeue();
                    }
                    //alle privaten sind in der hilfsschlange nun den neuen privaten dran
                    temp.enqueue(h);
                    // und alle anderen auch
                    while (!pschlange.isEmpty()){
                        temp.enqueue(pschlange.front());
                        pschlange.dequeue();
                    }
                    // nun noch zurück in die richtige schlange
                    while (!temp.isEmpty()){
                        pschlange.enqueue(temp.front());
                        temp.dequeue();
                    }
                } else {
                    // ist privat und kein anderer privater => ganz nach vorn
                    Queue<Held> temp = new Queue<Held>();
                    // erst alle in eine Hilfsschlange
                    while (!pschlange.isEmpty()){
                        temp.enqueue(pschlange.front());
                        pschlange.dequeue();
                    }
                    //dann privat rein (ist damit erster!)
                    pschlange.enqueue(h);
                    // und den rest wieder dazu
                    while (!temp.isEmpty()){
                        pschlange.enqueue(temp.front());
                        temp.dequeue();
                    }
                }

            }
        }
        else {
            // ist nicht privat also hinten anstellen
            pschlange.enqueue(h);
        }

    }

    /**
     * wie in der Queue
     */
    public void dequeue()
    {
        pschlange.dequeue();

    }

    /**
     * wie in der Queue
     */
    public boolean isEmpty()
    {
        // tragen Sie hier den Code ein
        return pschlange.isEmpty();
    }

    /**
     * wie in der Queue
     */
    public Held front()
    {
        return pschlange.front();
    }
}
