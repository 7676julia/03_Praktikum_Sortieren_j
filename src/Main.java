import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //Array Liste erstellen
        ArrayList<Integer> ArrayListe = new ArrayList<>();
        
    
        //Elemente hinzufügen
        for (int i = 0; i < 500; i++) {
            //zufällige Jahreszahl
            int jahreszahl = (int) (Math.random() * 113) + 1900;
            ArrayListe.add(i, jahreszahl);
        }

        Ausgabe.list(ArrayListe);
        Ausgabe.InsertSort();
        Sortierer insertSortiererObjekt = new insertSortierer(ArrayListe);
        insertSortiererObjekt.sortieren(ArrayListe);
        //sortierte Liste ausgeben
        Ausgabe.list(ArrayListe);    
        Ausgabe.zeit(insertSortiererObjekt.getOperations());



    }
    
    
}
