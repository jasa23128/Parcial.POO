package Parcial;

    public class EnOferta extends Habitacion {
        private double porcentajeDescuento;

        public EnOferta(String numero, double tarifaBase, int noches, double porcentajeDescuento) throws ExcepcionReserva {
            super(numero, tarifaBase, noches);
            if (porcentajeDescuento < 0) {
                throw new ExcepcionReserva("El descuento no puede ser negativo");
            }
            this.porcentajeDescuento = porcentajeDescuento;
        }

        @Override
        public double calcularTotal() {
            double subtotal = getTarifaBase() * getNoches();
            return subtotal * (1 - porcentajeDescuento / 100.0);
        }

        @Override
        public String getTipo() { return "Oferta"; }

        @Override
        public String getAjusteTexto() {
            return porcentajeDescuento > 0 ? (int)porcentajeDescuento + "% descuento" : "Sin descuento";
        }
    }
}
