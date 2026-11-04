package biblioteca;

public class Confirmada implements EstadoReserva {
    public String nombre() { return "Confirmada";}

    public void confirmar(Reserva reserva){
        throw new IllegalStateException("La reservaya está confirmada.");
    }

    public void cancelar (Reserva reserva){
        reserva.cambiarEstado(new Cancelada());
    }

    public void finalizar(Reserva reserva){
        reserva.cambiarEstado(new Finalizada());
    }
}
