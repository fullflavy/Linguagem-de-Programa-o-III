public class Main{
    public static void main(String[] args){
        Ponto2D p = new Ponto2D(1, 2);
        Ponto2D p1 = new Ponto2D(2, 2);

        System.out.println(p.toString());
        System.out.println(p.distancia(p1));
    }
}
