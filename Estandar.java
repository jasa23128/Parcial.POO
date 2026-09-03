package Parcial;

    public class Estandar extends Habitacion {
        public Estandar(String numero, double tarifaBase, int noches) throws ExcepcionReserva {
            super(numero, tarifaBase, noches);
        }

        @Override
        public double calcularTotal() {
            return getTarifaBase() * getNoches();
        }

        @Override
        public String getTipo() { return "Estándar"; }

        @Override
        public String getAjusteTexto() { return "Sin ajuste"; }
    }
}
