import java.util.ArrayList;
import java.util.List;

public class quickSortierer extends Sortierer{
    //Konstruktor
    public quickSortierer(List<Integer> liste) {
        super(liste);
    }
    
    protected List<Integer> sortieren(List<Integer> liste) {
        List<Integer> ersteListe = new ArrayList<>();
        List<Integer> zweiteListe = new ArrayList<>();
        List<Integer> sortierteListe = new ArrayList<>();

        //wenn die Liste leer ist oder nur ein Element enthält, wird sie direkt zurückgegeben
        if (liste.size() <=1){
            return liste;
        }
        else {
            int pivot = liste.get(0);
            liste.remove(0);
            for (int i=0; i<liste.size();i++){
                //wenn das Element kleiner oder gleich dem Pivot ist, wird es in die erste Liste eingefügt
                if (liste.get(i) <= pivot){
                    ersteListe.add(liste.get(i));
                }
                //wenn das Element größer als der Pivot ist, wird es in die zweite Liste eingefügt
                else {
                    zweiteListe.add(liste.get(i));
                }
            }
            sortierteListe.addAll(sortieren(ersteListe));
            sortierteListe.add(pivot);
            sortierteListe.addAll(sortieren(zweiteListe));
        }
        return sortierteListe;
    }
}
