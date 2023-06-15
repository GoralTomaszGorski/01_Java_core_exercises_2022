import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Ania");
        names.add("Kaisa");
        names.add("Ania");
        names.add("Romek");
        names.add("Tomek");
        names.add("Danuta");
        names.add("OLa");
        names.add("Ola");

        int setSize = names.size();
        System.out.println("Number of names: "+setSize);
        boolean isTrueAnia = names.contains("Ania");
        System.out.println("There is Ania in this set: "+isTrueAnia);
        for (String name: names) {
            System.out.println(name);
        }


    }
}
