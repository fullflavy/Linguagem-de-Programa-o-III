public class Fliperama{
	public static void main (String[] agrs){
		Date3 []data = new Date3[2];
		Contato3 []contato = new Contato3[2];
		Time []time = new Time[2];
		
		data[0] = new Date3(19, 11, 2022);
		contato[0] = new Contato3("Breno", "breno@gmail.com", "(73)98809-9878", 2, 9, 2000);
		time[0] = new Time(7, 30, 0);
		
		
		data[1] = new Date3(18, 11, 2022);
		contato[1] = new Contato3("Breno", "breno@gmail.com", "(73)98809-9878", 2, 9, 2000);
		time[1] = new Time(7, 30, 0);
		
		Agendamento random = new Agendamento(data[0], time[0], contato[0]);
		random.agendar(data[1], time[1]);
		random.mostraAgendamento();
	}
}