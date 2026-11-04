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
    }/*
    cual es la arquitectura que elgimos para el proyecto, Diagrama de componentes de paquetees y ed despliegue

    Reserva re3serva=new ReservaBuilder()
    .estudiante(new Estudiante("E001", "Laura"))
    .horaInicio(java.time.LocalDate.now().plusDays(7))
    .duracionHoras(2)
    .cantidadPersonas(4)
    .sala(new Sala("B", "Sala B", 4))
    .build();

    System.out.println(reserva);
    */
}