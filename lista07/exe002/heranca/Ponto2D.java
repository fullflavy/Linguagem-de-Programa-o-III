public class Ponto2D{
    //atributos:
    private float x;
    private float y;

    //getters:
    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    //construtores:
    public Ponto2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Ponto2D(){
        this(0,0);
    }

    public Ponto2D(Ponto2D outroPonto){
        this(outroPonto.getX(), outroPonto.getY());
    }

    //metodos:
    public boolean inAxisX(){
        if(this.y == 0 && this.x != 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean inAxisY(){
        if(this.x == 0 && this.y != 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean inAxis(){
        if(this.x != 0 && this.y != 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isOrigin(){
        if(this.x == 0 && this.y == 0){
            return true;
        }else{
            return false;
        }
    }

    public double distancia(Ponto2D a){
        double resultado = Math.sqrt(((this.x - a.getX()) * (this.x - a.getX())) + ((this.y - a.getY()) * (this.y - a.getY())));

        return resultado;
    }

    public String toString(){
        String print;
        print = String.format("(%f, %f)", getX(),getY());
        return print;
    }
}