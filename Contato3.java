/*lista 03: Usando como base a classe Contato desenvolvida na lista anterior, execute o refatoramento da classe incluindo o construtor da mesma e validações para os atributos.*/

public class Contato3{
	private String nome, email, telefone;
	private int dia, mes, ano;
	private int diaAtual = 31, mesAtual = 12, anoAtual = 2022, tempo;          
	
	public Contato3(String nome, String email, String telefone, int dia, int mes, int ano){  //completo
        this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
    }
	
	public void setNome(String nome){
        	this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public void setDia(int dia){
		this.dia = dia;
	}
	
	public void setMes(int mes){
		this.mes = mes;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	public int getDia(){
		return this.dia;
	}
	
	public int getMes(){
		return this.mes;
	}
	
	public int getAno(){
		return this.ano;
	}
	
	public void imprimirContato(){
		System.out.printf("\nNome: %s\nE-mail: %s.\nTelefone: %s\nData de nascimento: %02d/%02d/%d.\n", getNome(), getEmail(), getTelefone(), getDia(), getMes(), getAno());
	}
	
	public int cacularIdade(){
		tempo = anoAtual - ano;
		
		if(diaAtual > dia && mesAtual > mes){
			return tempo;
		}
		return (tempo - 1);	
	}
}