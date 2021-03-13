
/**
 * Write a description of class Inventar here.
 *
 * @author dt
 * @version 0.1
 */
public class Inventar
{
    // instance variables - replace the example below with your own
    private Waffe[] meineWaffen;
    private int zaehler;
    /**
     * Constructor for objects of class Inventar
     */
    public Inventar()
    {
        // initialise instance variables
        meineWaffen = new Waffe[15];
        zaehler = 0;
        this.fuegeHinzu(new Waffe(new Material("Holz",10), 100, "Holzschwert"));
        this.fuegeHinzu(new Waffe(new Material("Eisen",100), 100, "Eisenschwert"));
        this.fuegeHinzu(new Waffe(new Material("Holz",10), 10, "Knüpel"));
        this.fuegeHinzu(new Waffe(new Material("Titan",1000), 100, "Titanschwert"));
        this.fuegeHinzu(new Waffe(new Material("Holz",10), 1, "Zauberstab"));
        this.fuegeHinzu(new Waffe(new Material("Elektro",1), 10000, "Teaser"));
    }
        
    public void fuegeHinzu(Waffe w){
        meineWaffen[zaehler] = w;
        zaehler++;
    }
    
    public Waffe nehmeAusDemInventar(int i){
        return meineWaffen[i];
    }
    
    public Waffe nehmeAusDemInventar(){
        return meineWaffen[zaehler-1];
    }
    
    // gibt die stärkste Waffe aus dem Inventar zurück
    public Waffe nehmeStaerkste(){
        Waffe staerkste = meineWaffen[0];
        for(int i = 1; i< zaehler; i++){
            if(meineWaffen[i].getBonus()>staerkste.getBonus())
            staerkste = meineWaffen[i];
        }
        return staerkste;
    }
    
    //Sortiert das Inventar nach der stärke der Waffen
    public void sortiereDasInventar(){
        //nachher ist das Feld aufsteigend sortiert
        Waffe temp;
        for(int i = 0; i< zaehler; i++){
            for(int j = i+1; j< zaehler; j++){
                if(meineWaffen[i].getBonus()<meineWaffen[j].getBonus()) {
                    temp = meineWaffen[i];
                    meineWaffen[i]= meineWaffen[j];
                    meineWaffen[j] = temp;
                }
            }
        }
    }
    
    

}
