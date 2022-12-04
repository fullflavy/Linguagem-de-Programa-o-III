public class Main{
    public static void main(String[] args){
        Ponto2D p = new Ponto2D(3.0f, 4.0f);

        Ponto3D ponto3D = new Ponto3D(p, getZ());

        System.out.println(ponto3D.toString());
    }
}
