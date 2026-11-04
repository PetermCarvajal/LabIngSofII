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

        System.out.println("Salas de la biblioteca:\n\n");
        salas.forEach(System.out::println);

        EstrategiaSeleccionSala porCapacidad = new SeleccionPorCapacidad();
        System.out.println("Para 4 persoans:"+porCapacidad.seleccionar(salas,4).orElse(null)); //Poner 'disponibles' genera error lo correcto es poner salas

        EstrategiaSeleccionSala preferida = new SeleccionSalaPreferida("C");
        System.out.println("Preferida C:"+porCapacidad.seleccionar(salas,4).orElse(null));

        EstrategiaSeleccionSala preferidaNoAdecuada = new SeleccionSalaPreferida("B");
        System.out.println("Preferida B para 7:"+preferidaNoAdecuada.seleccionar(salas,7).orElse(null));
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