public class Main{
    public static void main(String[] args){
        Data [] dat = new Data[2];
        dat[0] = new Data(8, 12, 2002);
        dat[1] = new Data(11, 8, 2000);

        Time [] tim = new Time[2];
        tim[0] = new Time(7, 30, 54);
        tim[1] = new Time(19, 30, 3);

        DataTime [] datTim = new DataTime[2];
        datTim[0] = new DataTime(dat[0], tim[0]);
        datTim[1] = new DataTime(dat[1], tim[1]);

        System.out.println(datTim[0].toString());
        System.out.println(datTim[0].equals(datTim[1]));
        System.out.println(datTim[0].isGreather(datTim[1]));
        System.out.println(datTim[0].isLower(datTim[1]));
    }
}