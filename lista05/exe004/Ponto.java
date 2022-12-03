public class Ponto {
    // Distância entre dois pontos
    public static double distancia(Ponto2D a, Ponto2D b){
        return a.distancia(b);
    }

    public static double distancia(Ponto2D a){
        return a.distancia();
    }

    //Quadrante
    public static int quadrante(Ponto2D a){
        return a.quadrante();
    }
}
