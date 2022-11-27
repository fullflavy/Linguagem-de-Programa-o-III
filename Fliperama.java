public class Fliperama{
	public static void main (String[] agrs){
		Date3 []data = new Date3[2];
		Contato3 []contato = new Contato3[3];
		Time []time = new Time[3];
		
		data[0] = new Date3(19, 11, 2022); //esses primeiros dados são inválidos como base pela ln15.
		contato[0] = new Contato3("Breno", "breno@gmail.com", "(73)98809-9878", 2, 9, 2000);
		time[0] = new Time(9, 38, 0);

		data[1] = new Date3(18, 11, 2022);
		contato[1] = new Contato3("Carla Monteiro", "carla@gmail.com", "(73)98809-9999", 23, 11, 2000);
		time[1] = new Time(7, 30, 0);
		
		Agendamento randomica = new Agendamento(data[0], time[0], contato[0]);

		randomica.agendar(data[0], time[0], contato[0]);
		randomica.mostraAgendamento();

		randomica.agendar(data[1], time[1], contato[1]);
		randomica.mostraAgendamento();
	}	
}