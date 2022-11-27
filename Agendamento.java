public class Agendamento{
	Date3 agendamentoD = new Date3(0,0, 0);
	Time agendamentoT = new Time(0, 0 , 0);
	Contato3 agendamentoC = new Contato3("a", "a", "a", 0, 0, 0);
    private int status;

	//contrutor:
	public Agendamento(Date3 agendamentoDD, Time agendamentoTT, Contato3 agendamentoCC){
		this.agendamentoD = agendamentoDD;
		this.agendamentoT = agendamentoTT;
		this.agendamentoC = agendamentoCC;
	}
	
	//setters:
	public void setData(Date3 da){
		agendamentoD = da;
	}
	
	public void setTime(Time ti){
		agendamentoT = ti;
	}
	
	public void setContato(Contato3 co){
		agendamentoC = co;
	}
	
	public void setStatus(int s){
		this.status = s;
	}

	public int getStatus(){
		return status;
	}

	//getters data:
	public int getDay(){
		return agendamentoD.getDay();
	}
	
	public int getMonth(){
		return agendamentoD.getMonth();
	}
	
	public int getYear(){
		return agendamentoD.getYear();
	}
	
	//getters contato:
	public String getNome(){
		return agendamentoC.getNome();
	}
	
	public String getEmail(){
		return agendamentoC.getEmail();
	}
	
	public String getTelefone(){
		return agendamentoC.getTelefone();
	}
	
	public int getDia(){
		return agendamentoC.getDia();
	}
	
	public int getMes(){
		return agendamentoC.getMes();
	}
	
	public int getAno(){
		return agendamentoC.getAno();
	}
	
	//getters time:
	public int getMinute(){
        return agendamentoT.getMinute();
    }

    public int getSecond(){
        return agendamentoT.getSecond();
    }

    public int getHour(){
        return agendamentoT.getHour();
    }
	
	//metodos:
	public void indisponivel(){
		System.out.println("\n========== Agendamento Indisponível! ===============");

	}
	
	public void agendar(Date3 outraData, Time outroTime, Contato3 outroContato) {
		if(verificarAgendamento(outraData, outroTime)){
			agendamentoD = outraData;
			agendamentoT = outroTime;
			agendamentoC = outroContato;
			status = 1;
		}else{
			status = 0;
			indisponivel();
		}
	}
	
	public boolean verificarAgendamento(Date3 outraData, Time outroTime) { //retorna true se a data e hora do parametro está disponível e false caso contrário.
		if(agendamentoD == outraData && agendamentoT == outroTime ){
			return false;
		} else{
			return true;
		}
	}
	
	public void mostraAgendamento() {
		if(status == 1){
			System.out.println("\n=============== AGENDAMENTO ==============");
			agendamentoD.printDate();
			agendamentoT.printTime();
			agendamentoC.imprimirContato();
			System.out.println("\n==========================================\n");
			System.exit(-1);
		}
	}
}