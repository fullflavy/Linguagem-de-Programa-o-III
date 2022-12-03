public class DataTime{
    private Data data;
    private Time time;

    public DataTime(int dia, int mes, int ano, int hour, int minute, int second){
        data = new Data(dia, mes, ano);
        time = new Time(hour, minute, second);
    }

    public int getDia(){
        return data.getDia();
    }

    public int getMes(){
        return data.getMes();
    }

    public int getAno(){
        return data.getAno();
    }

    public int getHour(){
        return time.getHour();
    }

    public int getMinute(){
        return time.getMinute();
    }

    public int getSecond(){
        return time.getSecond();
    }

    public String toString(){
        return data.toStringLong() + ", " + time.toString();
    }

    public boolean isEqual(DataTime outroObjeto){
        if((outroObjeto.getDia() == getDia()) && (outroObjeto.getMes() == getMes()) && (outroObjeto.getAno() == getAno())){
            if((outroObjeto.getHour() == getHour())  && (outroObjeto.getMinute() == getMinute()) && (outroObjeto.getSecond() == getSecond())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean isGreather(DataTime outroObjeto){
        if(!data.isPrevious(outroObjeto.getDia(), outroObjeto.getMes(), outroObjeto.getAno())){
            if(outroObjeto.getHour() > time.getHour()){
                return true;
            }else if(outroObjeto.getHour() < time.getHour()){
                return false;
            }else{
                if(outroObjeto.getMinute() > time.getMinute()){
                    return true;
                }else if(outroObjeto.getMinute() < time.getMinute()){
                    return false;
                }else{
                    if(outroObjeto.getSecond() > time.getSecond()){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }else{
            return false;
        }
    }

    public boolean isLower(DataTime outroObjeto){
        if(!(isGreather(outroObjeto))){
            return true;
        }else{
            return false;
        }
    }
}