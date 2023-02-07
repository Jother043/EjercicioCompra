package EjercicioCompra;

public class Visa extends Pago implements IPago{

    public Visa(double cantidad) {
        super(cantidad, TPago.TARJETA);
    }
}
