public class Quadrado extends Retangulo {
    private double lado;

    public Quadrado(double lado, String cor) {
        super(lado, lado, cor);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado de lado " + lado + " e cor " + getCor();
    }
}
