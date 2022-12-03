public class Main{
    public static void main(String[] args){
        Ponto2D p1 = new Ponto2D(3.0f, 4.0f);
        Ponto2D p2 = new Ponto2D(4.0f, 4.0f);

        SegmentoReta seguimento = new SegmentoReta(p1, p2);

        System.out.println(seguimento.imprimeSegmentoReta());
    }
}