public class Circulo{
	private float x, y, r;
	private final float PI = 3.1415f;
	
	Circulo ponto = new Circulo();
	
	public Circulo(float x, float y, float r){
		setXYR(x, y, r);
	}
	
	public void setXYR(float x, float y, float r){
		if(validaCirculo(float x, float y, float r)){
			this.x = x;
			this.y = y;
			this.r = r;
		}else{
			System.out.println("Error!");
            System.exit(-1);
		}
	}
	
	public float getX(){
		return this.x;
	}
	
	public float getY(){
		return this.y;
	}
	
	public float getR(){
		return this.r;
	}
	
	public void validaCirculo(float x, float y, float r){
		if((x < 0) || (y < 0) || (r < 0)){
            return false;
        }
        return true;
	}
	
	public void imprimirCirculo(){
		System.out.printf("x: %f\ny: %f\nr: %f.\n", this.x, this.y, this.r);
	}
	
	private boolean isInnerPoint(Ponto2D newPonto){   //retorna verdadeiro se o ponto enviado como parâmetro eh interno ao círculo.
		double dist = Math.sqrt((newPonto.getX() - this.x) * (newPonto.getX() - this.x) + (newPonto.getY() - this.y) * (newPonto.getY() - this.y));

        if(dist < r){
            return true;
        }else{
            return false;
        }
	}
	
	public float area(){     //retorna a área do círculo.
		return (PI * this.r * this.r);
	}
	
	public float perimeter(){     //retorna o perímetro do círculo.
		return (PI * this.r * 2);
	}
	
	private boolean isBiggerThan(Circulo circulo){  //retorna verdadeiro se a área do objeto for maior que a área do círculo enviado como parâmetro.
		if (area() < area(circulo.getR())){
			return true;
		}
		return false;
	}
}
