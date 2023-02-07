package EjercicioCompra;

public class Pago implements IPago{

    private double cantidad;
    private TPago tipo;

    public Pago(double cantidad, TPago tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    @Override
    public double calcularImporte() {
        return cantidad * 1 + (tipo.getPorcentaje()/100);
    }

    @Override
    public double calcularIncremento() {
        return this.cantidad * tipo.getPorcentaje() / 100;
    }

    @Override
    public TPago getTipoPago() {
        return tipo ;
    }
}
