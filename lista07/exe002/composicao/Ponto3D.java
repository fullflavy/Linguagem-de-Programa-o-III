//agregacao
public class Ponto3D{
    //atributos:
    private Ponto2D ponto2D;
    private float z;

    //getters:
    public float getX(){
        return this.ponto2D.getX();
    }

    public float getY(){
        return this.ponto2D.getY();
    }

    public float getZ(){
        return z;
    }

    //construtores:
    public Ponto3D(float x, float y, float z){
        ponto2D = new Ponto2D(x, y);
        this.z = z;
    }

    public Ponto3D(){
        this(0, 0, 0);
    }

    public Ponto3D(Ponto2D outroPonto){
        this(outroPonto, outroPonto.this.z);
    }

    public Ponto3D(Ponto2D outroponto){
        this(outroponto, 0);
    }

    //metodos:
    public boolean inAxisX(){
        if((this.getY() == 0) && (this.getX() != 0) && (this.z == 0)){
            return true;
        }else{
            return false;
        }
    }

    public boolean inAxisY(){
        if((this.getX() == 0) && (this.getY() != 0) && (this.z == 0)){
            return true;
        }else{
            return false;
        }
    }

    public boolean inAxisZ(){
        if((this.getX() == 0) && (this.getY() == 0) && (this.z != 0)){
            return true;
        }else{
            return false;
        }
    }

    public boolean inAxis(){
        if((this.getX() != 0) && (this.getY() != 0) && (this.z != 0)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isOrigin(){
        if((this.getX() == 0) && (this.getY() == 0) && (this.z == 0)){
            return true;
        }else{
            return false;
        }
    }

    public double distancia(Ponto3D a){
        double resultado = Math.sqrt(((this.getX() - a.getX()) * (this.getX() - a.getX())) + ((this.getY() - a.getY()) * (this.getY() - a.getY())) + ((this.z - a.getZ()) * (this.z - a.getZ())));

        return resultado;
    }

    public String toString(){
        String print;
        print = String.format("(%f, %f,%f)", ponto2D.getX(),ponto2D.getY(),getZ());
        return print;
    }
}
