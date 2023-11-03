import java.util.*;

public class Main {
    public static void main(String[] args) {
       List <String> Sarcina1  = new ArrayList<>();
       Sarcina1.add("Ma trezesc");
       Sarcina1.add("Beau cafea");
       Sarcina1.add("Ma imbrac");
       Sarcina1.add("Plec la serviciu");
       System.out.println(Sarcina1);

       Set<String> Sarcina2 = new HashSet<>(Arrays.asList("Ma trezesc","Beau cafea", "Ma imbrac","Plec la serviciu","Plec la serviciu", "Plec la serviciu"));
       System.out.println(Sarcina2);

        Map<String, String> Sarcina3 = new HashMap<>();
        Sarcina3.put("water", "apa");
        Sarcina3.put("cat", "pisica");
        Sarcina3.put("thus", "vasazica");
        System.out.println(Sarcina3);

        }
    }
//1.	Creați o metodă ce va returna lista lucrurilor care trebuie să le faceți astăzi. Afișați lista la ecran.
//        2.	Definiți o metodă care va primi drept argument o listă de valori de tip String și va returna o
//        colecție de valori unice. Lista primită ca argument poate conține valori duplicate. Afișați colecția cu valori unice la ecran.
//
//        3.	Creați un program în care veți simula un dicționar englez-român pentru 10 cuvinte. Afișați cuvintele
//        și traducerile lor corespunzătoare la ecran.
