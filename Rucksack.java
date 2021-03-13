
/**
 * TODO
 *
 * @author XY
 * @version 0
 */
public class Rucksack
{
    // instance variables - replace the example below with your own
    private List<Gegenstand> liste;
    /**
     * Constructor for objects of class Rucksack
     */
    public Rucksack()
    {
        // initialise instance variables
        liste = new List<Gegenstand>();
    }

    public void gegenstandHinzufuegen(Gegenstand g) {
        liste.insert(g);
        liste.toFirst();
    }
    
}
