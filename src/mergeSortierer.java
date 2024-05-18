import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class mergeSortierer extends Sortierer{

    //Konstruktor
    public mergeSortierer(List<Integer> liste) {
        //super: Methode der Oberklasse wird aufgerufen
        super(liste);
    }

    protected List<Integer> sortieren(List<Integer> liste) {
        List<Integer>kopierteListe = new ArrayList<>(liste);
        List<Integer> ersteHaelfte = new ArrayList<>();
        List<Integer> zweiteHaelfte = new ArrayList<>();
       
        if (kopierteListe.size() <= 1){
            return kopierteListe;
        }
        else {
            int mitte = kopierteListe.size()/2;
            ersteHaelfte = kopierteListe.subList(0, mitte);
            zweiteHaelfte = kopierteListe.subList(mitte, kopierteListe.size());
        }
        ersteHaelfte = sortieren(ersteHaelfte);
        zweiteHaelfte = sortieren(zweiteHaelfte);
        List<Integer> combinedList = combine(ersteHaelfte, zweiteHaelfte);
        return combinedList;
    }
    
    public List<Integer> combine (List<Integer> a, List<Integer> b) {
        List<Integer> combinedliste = new ArrayList<>();
        ListIterator<Integer> iteratorA = a.listIterator();
        ListIterator<Integer> iteratorB = b.listIterator();
        while (iteratorA.hasNext() && iteratorB.hasNext()){
            int elementA = iteratorA.next();
            int elementB = iteratorB.next();
            if(elementA < elementB){
                combinedliste.add(elementA);
                //iteratorB.previous() um das nicht eingefügt Element nicht zu überspringen
                iteratorB.previous();
            }
            else {
                combinedliste.add(elementB);
                //iteratorA.previous() um das nicht eingefügt Element nicht zu überspringen
                iteratorA.previous();
            }
        }
        while (iteratorA.hasNext()) {
            combinedliste.add(iteratorA.next());
        }
        while (iteratorB.hasNext()) {
            combinedliste.add(iteratorB.next());
        }
        return combinedliste;
    }

}