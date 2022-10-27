import java.util.Random;

public class Main {
  public static void main(String[] args) {
     Random gerador = new Random ();

    int jogadas[] = new int[2];//guardar os valores dos dois dados
    int dado, jogador, ponto;//jogador é a soma dos dois dados

     System.out.println("\n=============== CRAPS ================");
     dado = gerador.nextInt(6) + 1;
     jogadas[0]  = dado;
     dado = gerador.nextInt(6) + 1;
     jogadas[1] = dado;
     jogador = jogadas[0] + jogadas[1];

    if (jogador == 7 || jogador == 11){
      System.out.printf("\nDado 1: %d, Dado 2: %d.\nPonto: %d", jogadas[0], jogadas[1], jogador);
   
      System.out.println("\nVoce ganhou!"); 
    } else if (jogador == 2 || jogador == 3 || jogador == 12){
      System.out.printf("\nDado 1: %d, Dado 2: %d.\nPonto: %d", jogadas[0], jogadas[1], jogador);
      System.out.println("\nVoce perdeu!");
   }
    else {
      
       System.out.printf("\nDado 1: %d, Dado 2: %d.\nPonto: %d", jogadas[0], jogadas[1], jogador);
      ponto = jogador;
       System.out.println("\n\nIniciando estagio 2...");
      
      for (int i = 1;;i++){
        
        dado = gerador.nextInt(6) + 1;
        jogadas[0]  = dado;
        dado = gerador.nextInt(6) + 1;
        jogadas[1] = dado;
        jogador = jogadas[0] + jogadas[1];

         System.out.printf("\nJogada: %d\nDado 1: %d, Dado 2: %d.\nPonto: %d\n", i, jogadas[0], jogadas[1], jogador);
        
        if(jogador == 7){
         System.out.println("Voce perdeu!");
          return;
        }
        
        if (jogador == ponto){
         System.out.println("Voce ganhou!");
          return;
        }
      }
    }  
  }
}
