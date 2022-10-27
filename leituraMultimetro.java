import java.util.Scanner;

public class Main{
  
    public static void main(String[] args){
       Scanner myobject = new Scanner (System.in);
       float voltage[] = new float[10];
       float deviation[] = new float[10];
       float averange = 0, fDeviation = 0, lDeviation = 0;
       int i;

      System.out.printf("\n");
      
      for (i = 0; i < 10; i++){
        System.out.printf("Enter the %dª voltage: ", i+1);
        voltage[i] = myobject.nextFloat();

        averange = averange + voltage[i]; // soma das leituras
      } 

      averange = averange/10; // media das leituras
      lDeviation = averange * 0.1f; // calcula o desvio limite 
        
      for (i = 0; i < 10; i++){
        deviation[i] = averange - voltage[i]; // desvio individual
        
          if (deviation[i] < 0){
            deviation[i] = deviation[i] * 0.1f;
          }
        
        fDeviation = fDeviation + deviation[i]; // soma dos desvios individuais
      }
      
      fDeviation = fDeviation/10; //desvio padrao

      for (i = 0; i < 10; i++) { //imprime as leituras
        System.out.printf("\nVoltage %d: %.2f", i+1, voltage[i]);
      }
      
      System.out.printf("\n\nAverange value of readings: %.2f", averange);
      System.out.printf("\nFinal deviation: %.2f", fDeviation);

      if (fDeviation > lDeviation){ // verifica se o dispositivo ultrapassa ou nao o limite de 10% do valor medio
        System.out.println("\n\nThe multimeter is having problems!");
       }else {
        System.out.println("\n\nThe multimeter is operational!");
      }
    }
}
