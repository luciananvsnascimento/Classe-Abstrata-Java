public class Teste {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4, 6, "Vermelho");
        System.out.println("Área do Triangulo: " + triangulo.area());
        System.out.println(triangulo.toString());

        Retangulo retangulo = new Retangulo(5, 8, "Azul");
        System.out.println("Área do Retangulo: " + retangulo.area());
        System.out.println(retangulo.toString());

        Circulo circulo = new Circulo(3, "Verde");
        System.out.println("Área do Circulo: " + circulo.area());
        System.out.println("Diâmetro do Circulo: " + circulo.getDiametro());
        System.out.println(circulo.toString());

        Quadrado quadrado = new Quadrado(4, "Amarelo");
        System.out.println(quadrado.toString());
        
    }
}
