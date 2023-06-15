import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamColcector {
    public static void main(String[] args) {
        List<String> imiona = Arrays.asList("Tomek", "kotek", "Ada");
        String listaImion = imiona.stream().collect(Collectors.joining(", ", "{", "}"));
        System.out.println(listaImion);

    }
}
