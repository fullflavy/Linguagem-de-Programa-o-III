public class Contato4{
	private String nome, email, telefone;
	private int dia, mes, ano, tempo;
	private final int diaAtual = 31, mesAtual = 12, anoAtual = 2022;          
	
  public Contato4(String nome, String email, String telefone, int dia, int mes, int ano){  //completo
    this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
  }

  public Contato4(){
    this("Ana", "ana@gmail.com", "8876-9023", 8, 12, 2002);
  }

  public Contato4(String nome, String email, String telefone){ 
    this(nome, email, telefone, 8, 12, 2002);
  }

  public Contato4(String nome, String telefone){ //basicao
    this(nome, "ana@gmail.com", telefone);
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
		System.out.printf("\nNome: %s.\nE-mail: %s.\nTelefone: %s.\nData de nascimento: %02d/%02d/%d.\n", nome, email, telefone, dia, mes, ano);
	}
	
	public int cacularIdade(){
		tempo = anoAtual - ano;
		
		if(diaAtual > dia && mesAtual > mes){
			return tempo;
		}
		return (tempo - 1);	
	}
}
