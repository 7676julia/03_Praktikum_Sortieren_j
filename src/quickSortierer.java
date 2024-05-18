import java.util.ArrayList;
import java.util.List;

public class quickSortierer extends Sortierer{
    //Konstruktor
    public quickSortierer(List<Integer> liste) {
        super(liste);
    }
    
    protected List<Integer> sortieren(List<Integer> liste) {
        List<Integer> kopierteListe = new ArrayList<>(liste);
        List<Integer> ersteListe = new ArrayList<>();
        List<Integer> zweiteListe = new ArrayList<>();
        List<Integer> sortierteListe = new ArrayList<>();

        //wenn die Liste leer ist oder nur ein Element enthält, wird sie direkt zurückgegeben
        if (kopierteListe.size() <=1){
            return kopierteListe;
        }
        else {
            int pivot = kopierteListe.get(0);
            kopierteListe.remove(0);
            for (int i=0; i<kopierteListe.size();i++){
                //wenn das Element kleiner oder gleich dem Pivot ist, wird es in die erste Liste eingefügt
                if (kopierteListe.get(i) <= pivot){
                    ersteListe.add(kopierteListe.get(i));
                }
                //wenn das Element größer als der Pivot ist, wird es in die zweite Liste eingefügt
                else {
                    zweiteListe.add(kopierteListe.get(i));
                }
            }
            sortierteListe.addAll(sortieren(ersteListe));
            sortierteListe.add(pivot);
            sortierteListe.addAll(sortieren(zweiteListe));
        }
        return sortierteListe;
    }
}
