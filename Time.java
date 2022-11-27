public class Time{
    private int hora, min, seg;

    public Time(int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    //getters:
    public int getHour(){
        return this.hora;
    }

    public int getMinute(){
        return this.min;
    }

    public int getSecond(){
        return this.seg;
    }

    public boolean isAm(){
        if((this.hora < 12) && (this.hora > 0)){
            return true;
        }
        return false;
    }

    public int cron(Time outraHora){
        int hour = mode(outraHora.getHour() - this.hora);
        int minute = mode(outraHora.getMinute() - this.min);
        int second = mode(outraHora.getSecond() - this.seg);

        return (hour * 3600) + (minute * 60) + (second);
    }

    private int mode(int n){
        if(n < 0){
            return (-1) * n;
        }
        return n;
    }

    public void addSeconds(int secs){
        if(secs < 0){
            System.out.printf("Invalid!\n");
            System.exit(-1);
        }
        this.seg = this.seg + secs;
        if(this.seg >= 60){
            this.min = this.min + this.seg / 60;
            this.seg = this.seg % 60;
            if(this.min >= 60){
                this.hora = this.hora + this.min / 60;
                this.min = this.min % 60;
                if(this.hora >= 24){
                    this.hora = this.hora % 24;
                }
            }
        }
    }

    private boolean validateTime(int hora, int min, int seg){
        return validateHour(hora) && validateMinOrSec(min) && validateMinOrSec(seg);
    }

    private boolean validateHour(int hora){
        if((hora>0) && (hora<25))
            return true;
        else
            return false;
    }

    private boolean validateMinOrSec(int p){
        if((p>0) && (p<61))
            return true;
        else
            return false;
    }

    public void setTime(int hora, int min, int seg){
        if (validateTime(hora, min, seg)) {
            this.hora = hora;
            this.min = min;
            this.seg = seg;
        }
        else{
            this.hora = 0;
            this.min = 0;
            this.seg = 0;
        }
    }

    public void printTime(){
        System.out.printf("Horário: %02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}