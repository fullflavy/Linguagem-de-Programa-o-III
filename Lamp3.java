class Lamp3{
  private int lampStatus = 0;

  public Lamp3(int lampStatus){
    this.lampStatus = lampStatus;
  }

  private boolean verLampStatus(int lampStatus){  //se a lampada esta acesa retorna verdadeiro senao falso.
    if(lampStatus == 1){
      return true;
    }else{
      return false;
    }
  }

  private void error(){
    System.out.println("Error!!");
    System.exit(-1);
  }
  
  public int ligthUp() {
    if(verLampStatus(lampStatus)){  //trata se a lampada ja esta acesa.
      error();
    }else{
      lampStatus = 1;
    }
    return lampStatus;
  }

  public int toSwitchOff() {
    if(!verLampStatus(lampStatus)){ //trata se a lampada ja esta apagada.
      error();
    }else{
      lampStatus = 0;
    }
    return lampStatus;
  }

  public void printLampStatus(){
    if(verLampStatus(lampStatus)){
      System.out.println("\nThe lamp is on.\n");
    }else{
      System.out.println("\nThe lamp is off.\n");
    }
  }
}
