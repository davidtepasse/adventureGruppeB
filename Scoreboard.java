
/**
 * Beschreiben Sie hier die Klasse Scoreboard.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Scoreboard
{
    private List<Held> scoreboard;
    
    public Scoreboard()
    {
        scoreboard = new List<Held>();
    }
    
    public void fuegeHeldhinzu(Held held)
    {
        scoreboard.append(held);
        
    }
}   
