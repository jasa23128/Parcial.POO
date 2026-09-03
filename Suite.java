package Parcial;

public class Suite extends Habitacion {
    private double porcentajeRecargo;

    public Suite(String numero, double tarifaBase, int noches, double porcentajeRecargo) throws ExcepcionReserva {
        super(numero, tarifaBase, noches);
        if (porcentajeRecargo < 0) {
            throw new ExcepcionReserva("El porcentaje del recargo no puede ser negativo");
        }
        this.porcentajeRecargo = porcentajeRecargo;
    }

    @Override
    public double calcularTotal() {
        double subtotal = getTarifaBase() * getNoches();
        return subtotal * (1 + porcentajeRecargo / 100.0);
    }

    @Override
    public String getTipo() { return "Suite"; }

    @Override
    public String getAjusteTexto() {
        return "+" + (int)porcentajeRecargo + " recargo";
    }
}
