public class Agendamento{
	private Data agendamentoD;
	private Time agendamentoT;
	private Contato agendamentoC;
	//contrutor:
	public Agendamento(Data agendamentoDD, Time agendamentoTT, Contato agendamentoCC){
		this.agendamentoD = agendamentoDD;
		this.agendamentoT = agendamentoTT;
		this.agendamentoC = agendamentoCC;
	}
	
	//setters:
	
	public void setData(Data da){
		agendamentoD = da;
	}
	
	public void setTime(Time ti){
		agendamentoT = ti;
	}
	
	public void setContato(Contato co){
		agendamentoC = co;
	}
	
	//getters:
	
	public Data getData(){
		return agendamentoD;
	}
	
	public Contato getContato(){
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
	
	public void agendar(Data outraData, Time outroTime) {
		if(verificarAgendamento(outraData, outroTime)){
			//agendamentoC = contato;
			agendamentoD = outraData;
			agendamentoT = outroTime;
		}else{
			indisponivel();
		}
	}
	
	public boolean verificarAgendamento(Data outraData, Time outroTime) { //retorna true se a data e hora do parametro está disponível e false caso contrário.
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