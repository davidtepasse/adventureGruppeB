
/*
 * in dieser klasse werden waffen und das entsprechende Bestechungsgeld gespeichert
 */
class Auftrag {
    Waffe waffe;
    int bestechgeld;
    
    Auftrag (Waffe pWaffe, int pBestechgeld) {
        waffe = pWaffe;
        bestechgeld = pBestechgeld;
    }
    
    //get Methoden
    Waffe getWaffe () {
        return waffe;
    }
    
    int getBestechungsgeld () {
        return bestechgeld;
    }
}