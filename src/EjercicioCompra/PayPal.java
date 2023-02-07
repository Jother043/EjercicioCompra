package EjercicioCompra;

public class PayPal extends Pago implements IPago {

    public PayPal(double cantidad) {
        super(cantidad, TPago.ONLINE);
    }
}
