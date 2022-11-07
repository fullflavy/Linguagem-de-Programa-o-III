/*Refatore a classe Ponto2D desenvolvida na lista anterior para atender os seguintes requisitos:
Inclua o construtor da classe
Os pontos são imutáveis uma vez instanciados seus valores não podem ser modificados.*/

public class Ponto2D3{
	private int x, y;
	
	public class Ponto2D3(int x, int y){
		this.x = x;
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
	
	public double distance(Ponto2D z){    //calcula a distancia da origem ao ponto. OBS: nessa função em especifico eu gostaria de saber se há como fazer com o tipo float.
		double distance;
		double x = (double)z.getX(), y = (double)z.getY();                            //só consegui usando double. 

        return Math.sqrt(((x - 0) * (x - 0)) + ((y - 0) * (y - 0)));
	}
}