public class Main{
	public static void main(String[]args){
		Date data = new Date();
		
		data.initializeDate();
		data.setDate(28, 2, 2022);
		data.printDate();
		data.printDateExtensive();
	}
}