public class ContatoC{
	public static void main(String[]args){
		Contato contato = new Contato();
		
		contato.inicializarContato();
		contato.setNome("Ana");
		contato.setEmail("ana@gmail.com");
		contato.setTelefone("8854-3245");
		contato.setDia(28);
		contato.setMes(2);
		contato.setAno(2000);
		contato.imprimirContato();
	}
}