package Parcial;

public class Reserva {
    private static int contadorId = 2000;
    private final String idReserva;
    private final Habitacion[] habitaciones;
    private int cantidadActual;

    public Reserva() {
        this.idReserva = "#" + (++contadorId);
        this.habitaciones = new Habitacion[5];
        this.cantidadActual = 0;
    }

    public boolean agregarHabitacion(Habitacion h) {
        if (cantidadActual >= 5) {
            System.out.println("No se pueden agregar más de 5 habitaciones por reserva");
            return false;
        }

        for (int i = 0; i < cantidadActual; i++) {
            if (habitaciones[i].esIgual(h)) {
                System.out.println("La habitación " + h.getNumero() + " ya está registrada en la reserva.");
                return false;
            }
        }

        habitaciones[cantidadActual] = h;
        cantidadActual++;
        return true;
    }

    public double calcularTotalReserva() {
        double total = 0;
        for (int i = 0; i < cantidadActual; i++) {
            total += habitaciones[i].calcularTotal();
        }
        return total;
    }

    public void mostrarResumen() {
        System.out.println("Reserva " + idReserva);
        System.out.printf("Habitación", "Tipo", "Tarifa base", "Noches", "Ajustes", "Total");
        

        for (int i = 0; i < cantidadActual; i++) {
            Habitacion h = habitaciones[i];
            System.out.printf(
                    h.getTipo() + " " + h.getNumero(),
                    h.getTipo(),
                    h.getTarifaBase(),
                    h.getNoches(),
                    h.getAjusteTexto(),
                    h.calcularTotal());
        }

        System.out.println("Total reserva: " + calcularTotalReserva());
    }
}
