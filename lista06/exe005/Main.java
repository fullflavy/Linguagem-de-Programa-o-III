public class Main{
    public static void main(String[] args){
        Ponto2D [] p = new Ponto2D[3];
        p[0] = new Ponto2D(1, 2);
        p[1] = new Ponto2D(2, 4);
        p[2] = new Ponto2D(3, 2);

        Triangulo t = new Triangulo(p[0], p[1], p[2]);

        System.out.println(t.imprimeTriangulo());
        System.out.println(t.isTrianguloEquilatero());
        System.out.println(t.isTrianguloIsoceles());
        System.out.println(t.isTrianguloRetangulo());
    }
}