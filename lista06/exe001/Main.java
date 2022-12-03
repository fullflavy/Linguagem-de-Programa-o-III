public class Main{
    public static void main(String[] args){
        DataTime [] d = new DataTime[2];

		d[0] = new DataTime(8, 12, 2022, 22, 12, 37);
        d[1] = new DataTime(5, 12, 2000, 11, 50, 34);

        System.out.println(d[0].toString());
        System.out.println(d[1].toString());

        System.out.println(d[0].isEqual(d[1]));
        System.out.println(d[0].isGreather(d[1]));
        System.out.println(d[0].isLower(d[1]));
    }
}