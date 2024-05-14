import java.util.List;

public class insertSortierer extends Sortierer{
    //Konstruktor
    public insertSortierer(List<Integer> liste) {
        super(liste);
    }
    protected List<Integer> sortieren(List<Integer> liste) {
        return liste;
    }
}
