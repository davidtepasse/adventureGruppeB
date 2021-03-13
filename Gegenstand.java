
/**
 * Oberklasse für alle Gegenstände
 *
 * @author dt
 * @version 0.1
 */
public abstract class Gegenstand
{
    // instance variables - replace the example below with your own
    private String name;
    private Material beschaffenheit;
    private int gewicht;

    /**
     * Constructor for objects of class Gegenstand
     */
    public Gegenstand(String name, Material beschaffenheit, int gewicht)
    {
        // initialise instance variables
        this.name = name;
        this.beschaffenheit = beschaffenheit;
        this.gewicht = gewicht;
    }
    
    /**
     * zum testen
     */
    public Gegenstand()
    {
        // initialise instance variables
        this.name = "test";
        this.beschaffenheit = new Material("Holz", 100);
        this.gewicht = 5;
    }

    /** 
     * getter und setter
     */
    public int getGewicht() {
        return gewicht;
    }
    
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
    
    public Material getBeschaffenheit() {
        return beschaffenheit;
    }
    
    public void setBeschaffenheit(Material beschaffenheit) {
        this.beschaffenheit = beschaffenheit;
    }
    
     public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
 
}
