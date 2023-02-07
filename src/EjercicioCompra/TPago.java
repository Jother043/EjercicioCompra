package EjercicioCompra;

public enum TPago {

    EFECTIVO(0),TARJETA(5),ONLINE(3);

    private double porcentaje;

    TPago(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}
