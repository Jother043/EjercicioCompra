package EjercicioCompra;

public interface IPago{
    public double calcularImporte();

    public double calcularIncremento();
    public TPago getTipoPago();
}
