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
        //i = 1, da mit i-1 verglichen wird
        for (int i = 1; i < kopierteListe.size(); i++) {
            //speichern von wert an stelle i (1)
            int temp = kopierteListe.get(i);
            int j = i;
            //ist der wert links von i größer als der wert von i = temp?
            while (j > 0 && kopierteListe.get(j - 1) > temp) {
                //wenn ja, dann wird der wert von j-1 an die stelle j kopiert
                kopierteListe.set(j, kopierteListe.get(j - 1));
                //j wird verringert um den nächsten wert zu überprüfen
                j--;
            }
            kopierteListe.set(j, temp);
        }
        return kopierteListe;
    }
}
