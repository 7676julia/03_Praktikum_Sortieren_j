import java.util.ArrayList;
import java.util.List;

public class insertSortierer extends Sortierer{
    //Konstruktor
    public insertSortierer(List<Integer> liste) {

        super(liste);
    }
    protected List<Integer> sortieren(List<Integer> liste) {
        //Liste kopieren
        List<Integer> kopierteListe = new ArrayList<>(liste);
        //Liste sortieren
        for (int i = 1; i < kopierteListe.size(); i++) {
            int temp = kopierteListe.get(i);
            int j = i;
            while (j > 0 && kopierteListe.get(j - 1) > temp) {
                kopierteListe.set(j, kopierteListe.get(j - 1));
                j--;
            }
            kopierteListe.set(j, temp);
        }
        return kopierteListe;
    }
}
