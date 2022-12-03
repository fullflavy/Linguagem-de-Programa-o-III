public class Agendamento{
	private Date3 agendamentoD;
	private Time agendamentoT;
	private Contato3 agendamentoC;
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
	
	//getters:
	
	public Date3 getData(){
		return agendamentoD;
	}
	
	public Contato3 getContato(){
		return agendamentoC;
	}
	
	public Time getTime(){
		return agendamentoT;
	}
	
	//metodos proprios
	
	public void indisponivel(){
		System.out.println("Indisponível!");
		System.exit(-1);
	}
	
	public void agendar(Date3 outraData, Time outroTime) {
		if(verificarAgendamento(outraData, outroTime)){
			//agendamentoC = contato;
			agendamentoD = outraData;
			agendamentoT = outroTime;
		}else{
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
		System.out.println("\n=============== AGENDAMENTO ==============");
		System.out.printf("\nData:"+ agendamentoD + "\nHora:"+ agendamentoT	 + "\nCliente:" + agendamentoC);
		System.exit(-1);
	}
}