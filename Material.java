/**
 * Material der Waffe
 *
 * @author dt
 * @version 1.0
 */
public class Material {
    
    private String name;
    
    private int materialBonus;
    
    /**
     * Erstellt ein neues Material
     * 
     * @param name Name des Materials
     * @param materialBonus der Bonus den das Material verleiht
     */
    public Material(String name, int materialBonus) {
        this.name = name;
        this.materialBonus = materialBonus;
    }
    
    // GETTER UND SETTER
    
    public String getName() {
        return name;
    }
    
    public int getMaterialBonus() {
        return materialBonus;
    }
}