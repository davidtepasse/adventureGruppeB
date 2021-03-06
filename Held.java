/**
 * Klasse Held, erbt von Character
 * @version 1.0
 * @author dt
 */
class Held extends Karacter {
    private int vermoegen;
    private Inventar meinInventar;
    private int angriffswert;
    private boolean privat;
    private Rucksack meinRucksack;
    private int level;
    private int erfahrungspunkte;
    private int kills,punkte;
    
    public Held(String name, int vermoegen, int leben, int kampf, boolean privat, Scoreboard score) {
        super(name, leben, kampf);
        meinInventar = new Inventar();
        this.vermoegen = vermoegen;
        this.privat = privat;
        meinRucksack = new Rucksack();
        level = 0;
        erfahrungspunkte = 0;
        kills = 0;
        punkte = 0;
        score.fuegeHeldhinzu(this);
    }

    //zum testen
    public Held(boolean privat) {
        super("test", 100, 100);
        meinInventar = new Inventar();
        this.vermoegen = 100;
        this.privat = privat;
        meinRucksack = new Rucksack();
        
    }
    
    /**
     * Der Held greift ein Monster an.
     * 
     * @param g das Monster das angegriffen werden soll
     * @param r die Kampfregel die den Kapf berechnet
     */
      public void angreifen(Monster g, Kampfregel r) {
          r.kampf(this, g);
          if (lebenspunkte <= 0) {
              System.out.println("Du bist tot!");
          }
          setErfahrungspunkte(10);
          kills++;
          vermoegen += 30;
      }

    public void angriffswertBerechnen() {
        angriffswert = lebenspunkte + meinInventar.nehmeAusDemInventar().getBonus();
    }
    
    public int getAngriffswert() {
        this.angriffswertBerechnen();
        return angriffswert;
    }
      
    
    /**
     * nimmt eine Waffe und fügt sie dem inventar hinzu
     */
    public void waffeAufnehmen(Waffe waffe) {
        meinInventar.fuegeHinzu(waffe);

    }

    /**
     * Nachher: waffe hat den wert null!
     */
    public void waffeAblegen() {
        //???
    }
    
    public boolean getPrivat(){
        return privat;
    }
    
    private void setErfahrungspunkte(int erfahrungspunkte){
        this.erfahrungspunkte += erfahrungspunkte;
        while (erfahrungspunkte >= (level*100)){
            erfahrungspunkte -= (level*100);
            level++;
        }
    }
    
    void berechnePunkte(){
        punkte = kills * 10 + level * 10; 
    }
  
    // public void speicherntoScoreboard()
    // {
        
    // }
}