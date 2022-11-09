public class LampThreeStatus {
  private int lampStatus = 0;
  private final int on = 1, off = 0, half = 2;

  private int verLamptatus(int lampStatus){  //se a lampada esta acesa retorna 1, apagada retorna 0 e meia luz retorna 2.
    if(lampStatus == 1){
      return on;
    }else if(lampStatus == 0){
      return off;
    }else{
      return half;
    }
  }

  private void error(){
    System.out.println("Error!!");
    System.exit(-1);
  }
  
  public int ligthUp() {
    if(verLamptatus(lampStatus) == on){  //trata se a lampada ja esta acesa.
      error();
    }else{
      lampStatus = 1;
    }
    return lampStatus;
  }

  public int toSwitchOff() {
    if(verLamptatus(lampStatus) == off){ //trata se a lampada ja esta apagada.
      error();
    }else{
      lampStatus = 0;
    }
    return lampStatus;
  }

  public int halfLight(){
     if(verLamptatus(lampStatus) == half){ //trata se a lampada ja esta meia luz.
      error();
    }else{
      lampStatus = 2;
    }
    return lampStatus;
  }

  public void printLampStatus(){
    if(verLamptatus(lampStatus) == on){
      System.out.println("\nThe lamp is on.\n");
    }else if(verLamptatus(lampStatus) == off){
      System.out.println("\nThe lamp is off.\n");
    }else{
      System.out.println("\nThe lamp is in the mood half ligth.\n");
    }
  }
}
