package Parcial;

public abstract class Habitacion {
    private String numero;
    private double tarifaBase;
    private int noches;

    public Habitacion(String numero, double tarifaBase, int noches) throws ExcepcionReserva {
        if (noches <= 0) {
            throw new ExcepcionReserva("La cantidad de noches no puede ser negativa");
        }
        if (tarifaBase < 0) {
            throw new ExcepcionReserva("La tarifa no puede ser negativa");
        }
        this.numero = numero;
        this.tarifaBase = tarifaBase;
        this.noches = noches;
    }

    public String getNumero() { return numero; }
    public double getTarifaBase() { return tarifaBase; }
    public int getNoches() { return noches; }

    public abstract double calcularTotal();
    public abstract String getTipo();
    public abstract String getAjusteTexto();

    public boolean esIgual(Habitacion otra) {
        if (otra == null) return false;

        boolean mismoNumero = (this.numero == null && otra.numero == null) ||
                (this.numero != null && this.numero.equals(otra.numero));

        return mismoNumero &&
                this.tarifaBase == otra.tarifaBase &&
                this.noches == otra.noches;
    }
}
