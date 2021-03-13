/**
 * Oberklasse für alle Spieler und Monster
 * (alles das was die beiden gemeinsam haben..)
 * @version 1.0
 * @author dt
 */
abstract class Karacter
{
    // instance variables - replace the example below with your own
    protected String name;
    protected int lebenspunkte;
    protected int kampfkraft;
    /**
     * Constructor for objects of class Character
     */
    public Karacter(String name, int leben, int kampf)
    {
        // initialise instance variables
        this.name = name;
        this.lebenspunkte = leben;
        this.kampfkraft = kampf;
    }

    /** 
     * getter und setter
     */
    public int getLebenspunkte() {
        return lebenspunkte;
    }
    
    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
    
    public int getKampfKraft() {
        return kampfkraft;
    }
    
    public void setKampfkraft(int kampfkraft) {
        this.kampfkraft = kampfkraft;
    }
    
     public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
