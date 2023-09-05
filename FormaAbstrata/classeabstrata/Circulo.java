public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        super.setCor(cor);
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    public double getDiametro() {
        return 2 * raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio= " + raio + ", cor= " + super.getCor() + "]";
    }
}
