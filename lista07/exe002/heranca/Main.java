public class Main{
    public static void main(String[] args){
        Ponto3D p = new Ponto3D(1, 1, 1);
        Ponto3D p1 = new Ponto3D(1, 2, 3);

        System.out.println(p.toString());
        System.out.println(p.distancia(p1));
    }
}
