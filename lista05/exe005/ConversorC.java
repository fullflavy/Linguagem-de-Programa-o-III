public class ConversorC {
    public static void main(String[] args) {
        double gram = 300; // 250 gramas
        double kilo = 50; // 5 kilos
        double pound = 40; // 10 libras
        double ounce = 5; // 12 onças

        System.out.println("\nDe Grama para: " + gram);
        System.out.println("Kilograma: " + Conversor.gramToKilogram(gram));
        System.out.println("Libra: " + Conversor.gramToPound(gram));
        System.out.println("Onça: " + Conversor.gramToOunce(gram));
 
        System.out.println("\nDe Kg para: " + kilo);
        System.out.println("Grama: " + Conversor.kilogramToGram(kilo));
        System.out.println("Libra: " + Conversor.kilogramToPound(kilo));
        System.out.println("Onça: " + Conversor.kilogramToOunce(kilo));

        System.out.println("\nDe Libra para: " + pound);
        System.out.println("Grama: " + Conversor.poundToGram(pound));
        System.out.println("Kilograma: " + Conversor.poundToKilogram(pound));
        System.out.println("Onça: " + Conversor.poundToOunce(pound));

        System.out.println("\nDe Onça para: " + ounce);
        System.out.println("Grama: " + Conversor.ounceToGram(ounce));
        System.out.println("Kilograma: " + Conversor.ounceToKilogram(ounce));
        System.out.println("Libra: " + Conversor.ounceToPound(ounce));

    }
}
