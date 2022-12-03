public class PontoC {
    public static void main(String[] args) {
        Ponto2D xis = new Ponto2D(2, -10);
        Ponto2D ypsolon = new Ponto2D(3, 12);

        System.out.println("Distância entre os pontos x e y: " + Ponto.distancia(xis, ypsolon));
        
        System.out.println("Distância entre o ponto x e a origem: " + Ponto.distancia(xis));
        System.out.println("Distância entre o ponto y e a origem: " + Ponto.distancia(ypsolon));

        System.out.println("Quadrande ponto x: " + Ponto.quadrante(xis));
        System.out.println("Quadrande ponto y: " + Ponto.quadrante(ypsolon));

    }
}
