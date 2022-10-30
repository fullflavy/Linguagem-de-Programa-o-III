public class Date{
	private int day, month, year;
	
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
	
	private boolean dateVerification(int initDay, int initMonth, int initYear){
		if(initMonth >= 1 && initMonth <= 12){
			if(((initMonth == 2)&& (initDay >= 1) && (initDay <= 29) && (initYear % 4 == 0) && (initYear % 100 == 0) && (initYear % 400 == 0))){
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
	
	public void initializeDate(){
		day = getDay();
		month = getMonth();
		year = getYear();
	}
	
	public void printDate(){
		System.out.printf("%02d de %02d de %d.\n", day, month, year);
	}
	
	public void printDateExtensive(){
		String m[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.printf("%d de %s de %d.\n", day, m[getMonth() - 1], year);
	}
}