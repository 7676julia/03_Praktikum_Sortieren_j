import java.util.List;

public class Ausgabe {
    public static void list (List<Integer> liste) {
        for (int i = 0; i < liste.size(); i++) {
            System.out.print(liste.get(i));
            //wenn Ahnzhal der Einträge ein Vielfaches von 30 ist, dann wird ein Zeilenumbruch gemacht
            if (i % 30==0) {
                System.out.println();
            }
        }
        //Zeilenumbruch am Ende
        System.out.println();
    }
    
    //Info über die Sortiermethode
    public static void bubbleSort () {
        System.out.println("Sortiert mit BubbleSort.");
    }
    public static void mergeSort () {
        System.out.println("Sortiert mit MergeSort.");
    }
    public static void quickSort () {
        System.out.println("Sortiert mit QuickSort.");
    }
    public static void InsertSort () {
        System.out.println("Sortiert mit InsertSort.");
    }

    //Info über die Zeitdauer
    public static void zeit (long zeit) {
        System.out.println("Benötigte Rechenzeit: " + zeit + "s");
    }
}
