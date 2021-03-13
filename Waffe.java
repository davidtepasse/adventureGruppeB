/**
 * Klasse Waffe
 * @version 1.0
 * @author dt
 * 
 */
public class Waffe {
    
    private String name;

    private int bonus;

    private Material material;

    private int magie;
    
    private int zustand;
    
    /**
     * Erstellt eine neue Waffe
     * 
     * @param material das Material der Waffe
     * @param magie die Magie der Waffe
     * @param name der Name der Waffe
     */
    public Waffe(Material material, int magie, String name) {
        this.material = material;
        this.magie = magie;
        this.name = name;
        zustand = 100;
        bonusBerechnen();
    }
    
    // schnelle standardwaffe
    public Waffe() {
        this.material = new Material ("holz", 10);
        this.magie = 100;
        this.name = "Knueppel";
        zustand = 100;
        bonusBerechnen();
    }

    /**
     * Berechnet den Bonus der Waffe
     */
    public void bonusBerechnen() {
        bonus = magie + material.getMaterialBonus()*zustand/100;
    }

    // GETTER UND SETTER
    
    public int getBonus() {
        return bonus;
    }
    
    public String getName() {
        return name;
    }

    public int getZustand(){
        return zustand;
    }
    
    public void setZustand(int zustand){
        this.zustand = zustand;
    }
}