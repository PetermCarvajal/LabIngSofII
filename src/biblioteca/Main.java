package biblioteca;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Sala> salas = List.of(
                new Sala("A", "Sala A", 2),
                new Sala("B", "Sala B", 4),
                new Sala("C", "Sala C",6),
                new Sala("D", "Sala D", 8)
        );

        System.out.printf("Salas de la biblioteca:\n\n");
        salas.forEach(System.out::println);
    }
}