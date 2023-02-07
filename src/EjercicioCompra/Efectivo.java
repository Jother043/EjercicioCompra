package EjercicioCompra;

public class Efectivo extends Pago implements IPago{

    public Efectivo(double cantidad) {
        super(cantidad, TPago.EFECTIVO);
    }

}
