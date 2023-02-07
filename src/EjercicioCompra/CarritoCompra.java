package EjercicioCompra;

public class CarritoCompra {

    private IPago[] pago;

    public CarritoCompra(IPago[] pago) {
        super();
        this.pago = pago;
    }

    public double calcularTotal(){
        double total = 0;
        for(IPago p : pago){
            total += p.calcularImporte();
        }

        return total;
    }

    public int contarTipoPago(TPago tipoPago){
        int total = 0;
        for(IPago p : pago){
            if(p.getTipoPago() == tipoPago){
                total++;
            }
        }
        return total;
    }

    public int calcularTotalIncremento(){
        int total = 0;
        for(IPago p : pago){
            total += p.calcularIncremento();
        }
        return total;
    }

    public static void main(String[] args) {
        IPago[] pago = {
                new Efectivo(34.6),
                new Efectivo(99.2),
                new Visa(23),
                new PayPal(67.34)
        };

        CarritoCompra carrito = new CarritoCompra(pago);
        System.out.println(carrito.calcularTotal());
        System.out.println(carrito.contarTipoPago(TPago.TARJETA));
        System.out.println(carrito.calcularTotalIncremento());
    }

}
