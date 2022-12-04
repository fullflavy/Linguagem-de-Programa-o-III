public class Ponto3D extends Ponto2D{
    //atributos:
    private float z;

    //getters:
    public float getZ(){
        return z;
    }

    //construtores:
    public Ponto3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public Ponto3D(){
        this(0, 0, 0);
    }

    public Ponto3D(Ponto2D outroPonto){
        this(outroPonto.getX(), outroPonto.getY(), 0);
    }

    public Ponto3D(Ponto3D outroponto){
        this(outroPonto.getX(), outroPonto.getY(), outroponto.getZ());
    }

    //metodos:
    @Override
    public boolean inAxisX(){
        if((this.getY() == 0) && (this.getX() != 0) && (this.z == 0)){
            return true;
        }else{
            return false;
        }
    }

    @Override
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

    @Override
    public boolean inAxis(){
        if((this.getX() != 0) && (this.getY() != 0) && (this.z != 0)){
            return true;
        }else{
            return false;
        }
    }

    @Override
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

    @Override
    public String toString(){
        String print;
        print = String.format("(%f, %f,%f)", getX(), getY(), getZ());
        return print;
    }
}
