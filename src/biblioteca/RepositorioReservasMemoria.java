package biblioteca;

import java.util.*;

public class RepositorioReservasMemoria implements RepositorioReservas {
    private final List<Reserva> reservas = new ArrayList<>();

    @Override
    public void guardar(Reserva reserva){
        reservas.add(reserva);
    }

    public List<Reserva> obtenerTodas(){
        return Collections.unmodifiableList(reservas);
    }
}
