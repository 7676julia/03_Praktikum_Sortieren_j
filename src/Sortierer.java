import java.util.ArrayList;
import java.util.List;

public abstract class Sortierer {
   
    protected List<Integer> liste = new ArrayList<>();
    protected long vorSortierung;
    protected long nachSortierung;
       
    public Sortierer (List<Integer> liste) {
        //Objetreferenz (this.liste) zeigt auf Kopie der Liste die übergeben wurde
        this.liste = new ArrayList<>(liste);
    }

    //abstrakte Methode, weil alle Sortierer diese Methode implementieren müssen
    protected abstract List<Integer> sortieren (List<Integer> liste);

    //Version 2 der Methode sortieren
    public List<Integer> sortieren() {
        return sortieren(liste);
    }

    //Methode zum Messen der Zeit ? (steht nicht in Blatt) -> noch mit der drunter zusammen packen
        public void messen() {
        vorSortierung = System.currentTimeMillis();
        sortieren();
        nachSortierung = System.currentTimeMillis();
    }
    
    //Berechnung der Zeitdauer
    public long getOperations() {
        
        return nachSortierung - vorSortierung;
    }
    
}
