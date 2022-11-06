/*Lista 03: Usando como base classe Data implementada na lista anterior adicione os seguintes métodos:
• Inclua o construtor da classe

• boolean isPrevious(Data outraData): retorna verdadeiro se a data, que passamos por parâmetro, é anterior a data do objeto;

• int howManyDays(Data outraData): retorna a quantidade de dias até a data enviada como parâmetros, se a data for anterior o valor retornado deve ser negativo;

• String dayOfWeek(): retorna o dia da semana representado pela data.*/

public class Date3{
	private int day, month, year;
	
	Date3 outraData = new Date3();
	
	public Date3(int day, int month, int year){  //construtor da classe.
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDate(int initDay, int initMonth, int initYear){
		if(dateVerification(initDay, initMonth, initYear)){
			day = initDay;
			month = initMonth;
			year = initYear;
		}else{
			System.out.printf("Invalid Date!\n");
			System.exit(-1);
		}
	}
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	private boolean dateVerification(int initDay, int initMonth, int initYear){   //verifica se a data é valida.
		if(initMonth >= 1 && initMonth <= 12){
			if(((initMonth == 2)&& (initDay >= 1) && (initDay <= 29) && isBissexto(initYear))){
				return true;
			}else if(((initMonth == 2) && (initDay >= 1) && (initDay <= 28))){
				return true;
			}else if(((initDay >= 1) && (initDay <= 31) && ((initMonth % 2 != 0) || (initMonth == 8)))){
				return true;
			}
			return false;
		}
		return false;
	}
	
	public void printDate(){              //imprime a data.
		System.out.printf("%02d de %02d de %d.\n", day, month, year);
	}
	
	public void printDateExtensive(){    //imprime a data por extenso.
		String m[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.printf("%d de %s de %d.\n", day, m[getMonth() - 1], year);
	}
	
	public boolean isPrevious(Date3 outraData){    //retorna verdadeiro se a data do parametro for menor que a do objeto.
        if(outraData.getYear() < this.year){
            return true;
        }else if(outraData.getYear() > this.year){
            return false;
        }else{
            if(outraData.getMonth() < this.month){
                return true;
            }else if(outraData.getMonth() > this.month){
                return false;
            }else{
                if(outraData.getDay() < this.day){
                    return true;
                }
                return false;
            }
        }
    }
	
	private int howManyDays(Date3 outraData){    //retorna a quatidade de dias, e se a data do parametro for menor, retorna negativo.
		int y = outraData.getYear;
		
		if(!isPrevious(outraData.getDay(), outraData.getMonth(), outraData.getYear())){
			float dY = (float)(outraData.getYear() - this.year) - 1;
            float dM1 = 12.0f - this.month;
            float dM2 = outraData.getMonth() - 1.0f + 1;
            float days = (dY * 365.25f) + ((dM1 + dM2) * 365.25f / 12);
            return (int)day;
		}else{
			float dYears = (float)((outraData.getYear() - this.year) * - 1) - 1;
            float dM1 = 12.0f - outraData.getMonth();
            float dM2 = this.month - 1.0f + 1;
            float days = (dY * 365.25f) + ((dM1 + dM2) * 365.25f / 12);
            return (int)(-days);
		}
	}
	
	public boolean isBissexto(int year){     //retorna verdadeiro se o ano é bissexto.
		if((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
			return true;
		}
		return false;
	}
	
	public String dayOfWeek(Date3 outraData){   //retorna o dia da semana representado pela data.
		int k = 0;
		int d = outraData.getDay();
		int m = outraData.getMonth();
		int y = outraData.getYear();
		String[] d = {"Sábado", "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
		
		if(m == 1){
			k = d + 2 * 13 + ((3 * (13 + 1))/5) + y + y/4 - y/100 + y/400 + 2;
		}else if(m == 2){
			k = d + 2 * 14 + ((3 * (14 + 1))/5) + y + y/4 - y/100 + y/400 + 2;
		}else{
			k = d + 2*m + ((3 * (m + 1))/5) + y + y/4 - y/100 + y/400 + 2;
		}
		k = k%7;
		
		return d[k]; 
	}
}