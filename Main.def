package Parcial;

public class Main {
    public static void main(String[] args) {

        System.out.println("Normales");
        Reserva r1 = new Reserva();
        try {
            r1.agregarHabitacion(new Suite("301", 300000, 2, 20));
            r1.agregarHabitacion(new EnOferta("208", 100000, 4, 15));
            r1.agregarHabitacion(new Estandar("105", 150000, 3));
            r1.agregarHabitacion(new Suite("402", 280000, 2, 20));
            r1.agregarHabitacion(new EnOferta("110", 90000, 2, 0));
        r1.mostrarResumen();
        } catch (ExcepcionReserva e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("días negativos");
        try {
            Habitacion hInvalida = new Estandar("101", 150000, -2);
        } catch (ExcepcionReserva e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        System.out.println("Precio negativo");
        try {
            Habitacion hInvalida2 = new Suite("102", -50000, 3, 20);
        } catch (ExcepcionReserva e) {
            System.out.println("Excepción capturada: " + e.getMessage() + "\n");
        }

        System.out.println("una noche");
        Reserva r2 = new Reserva();
        try {
            r2.agregarHabitacion(new Estandar("1", 120000, 1));
            r2.agregarHabitacion(new Estandar("2", 100000, 1));
            r2.agregarHabitacion(new Suite("3", 250000, 1, 20));
            r2.agregarHabitacion(new Suite("4", 300000, 1, 20));
            r2.agregarHabitacion(new EnOferta("5", 90000, 1, 15));
            System.out.println();
        } catch (ExcepcionReserva e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("Misma habitación");
        Reserva r3 = new Reserva();
        try {
            Suite s1 = new Suite("300", 300000, 2, 20);
            Suite s2 = new Suite("300", 300000, 2, 20);

            r3.agregarHabitacion(s1);
            r3.agregarHabitacion(s2);
            System.out.println();
            r3.mostrarResumen();
        } catch (ExcepcionReserva e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
