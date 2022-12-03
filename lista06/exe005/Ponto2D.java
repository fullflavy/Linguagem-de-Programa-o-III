public class Ponto2D{
	private int x;
    private int y;
	
	public Ponto2D(int x, int y){
		setX();
        setY();
	}
	
    public void setX(){
        this.x = x;
    }

    public void setY(){
		this.y = y;
    }

	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void printPonto(int x, int y){
		System.out.printf("Ponto (%d, %d)", x, y);
	}
	
	private boolean isEixoX(int x, int y){
		if(x > 0 && y == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	private boolean isEixoY(int x, int y){
		if(y > 0 && x == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	private boolean isEixos(int x, int y){      //retorna verdadeiro caso a coordenada seja o ponto origem (0, 0). 
		if(x == 0 && y == 0){
			return true;
		}
		else{ 
			return false;
		}
	}
	
	public int quadrante(int x, int y){
		int quadrante;
		
		if((isEixoX(x, y)) || (isEixoY(x, y)) || (isEixos(x, y))){
			quadrante = 0;
			return quadrante;
		}else{
			if(x > 0 && y > 0){
				quadrante = 1;
				return quadrante;
			}
			if(x > 0 && y < 0){
				quadrante = 4;
				return quadrante;
			}
			if(x < 0 && y > 0){
				quadrante = 2;
				return quadrante;
			}
			if(x < 0 && y < 0){
				quadrante = 3;
				return quadrante;
			}
		}
		return (-1);
	}
	
	public double distancia(Ponto z){    //calcula a distancia da origem ao ponto. 
		double distance;
		double x = (double)z.getX(), y = (double)z.getY();                            

        return Math.sqrt(((x - 0) * (x - 0)) + ((y - 0) * (y - 0)));
	}

    // Distância entre dois pontos
    public double distance(Ponto a){
        double resultado = Math.sqrt(((this.x - a.getX()) * (this.x - a.getX())) + ((this.y - a.getY()) * (this.y - a.getY())));

		return (float)resultado;
    }
}