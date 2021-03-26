
class Truhe {
    Material material;
    
    Truhe (Schluessel schluessel, String materialname, int materialbonus) {
        material = new Material(materialname, materialbonus);   
        
    }
    
    /*public void oeffnen (Schluessel schluessel, String materialname, int materialbonus) {
        material = new Material(materialname, materialbonus);   
        
    }
    */
    public Material getMaterial () {
        return material;
    }
}