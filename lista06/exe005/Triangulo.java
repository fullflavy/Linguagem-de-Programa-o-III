public class Triangulo{
    private Ponto2D a;
    private Ponto2D b;
    private Ponto2D c;

    public Triangulo(Ponto2D a, Ponto2D b, Ponto2D c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private static float distance(Ponto2D a, Ponto2D b){
        double resultado = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));

        return (float)resultado;
    }

    public String imprimeTriangulo(){
        return "AB = " + distance(a, b) + "\nBC = " + distance(b, c) + "\nCA = " + distance(c, a) + "\n";
    }

    public float hipotenusaAux(){
        float x = distance(a, b);
        float y = distance(b, c);
        float z = distance(c, a);

        if(x > y && x > z){
            return x;
        }else if (y > x && y > z){
            return y;
        }else{
            return z;
        }

    }

    public float hipotenusa(float m, float n, float o){
        float resultado = 0;

        if(m == hipotenusaAux()){
            resultado = (n * n) + (o * o);
            return resultado;
        }else if(n == hipotenusaAux()){
            resultado = (m * m) + (o * o);
            return resultado;
        }else{
          resultado = (m * m) + (n * n);
            return resultado;  
        }
    }

    public boolean isTrianguloRetangulo(){
        float x = distance(a, b);
        float y = distance(b, c);
        float z = distance(c, a);

        if(x == hipotenusaAux() && x == hipotenusa(x, y, z)){
            return true;
        }else if(y == hipotenusaAux() && y == hipotenusa(x, y, z)){
            return true;
        }else if(z == hipotenusaAux() && z == hipotenusa(x, y, z)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isTrianguloIsoceles(){
        float x = distance(a, b);
        float y = distance(b, c);
        float z = distance(c, a);

        if((x == y && x != z) || (x == z && x != y) || (z == y && z != x)){
            return true;
        }
        return false;
    }

    public boolean isTrianguloEquilatero(){
        float x = distance(a, b);
        float y = distance(b, c);
        float z = distance(c, a);

        if(x == y && y == z){
            return true;
        }
        return false;
    }
}