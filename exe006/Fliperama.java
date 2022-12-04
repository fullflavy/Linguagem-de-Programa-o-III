public class Fliperama{
	public static void main (String[] agrs){
		Data []data = new Data[2];
		Contato []contato = new Contato[2];
		Time []time = new Time[2];
		
		data[0] = new Data(19, 11, 2022);
		contato[0] = new Contato("Breno", "breno@gmail.com", "(73)98809-9878", 2, 9, 2000);
		time[0] = new Time(7, 30, 0);
		
		
		data[1] = new Data(18, 11, 2022);
		contato[1] = new Contato("Breno", "breno@gmail.com", "(73)98809-9878", 2, 9, 2000);
		time[1] = new Time(7, 30, 0);
		
		Agendamento random = new Agendamento(data[0], time[0], contato[0]);
		random.agendar(data[1], time[1]);
		random.mostraAgendamento();
	}
}