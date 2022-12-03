public class Conversor {
    // Grama para Kilograma
    public static double gramToKilogram(double x){
        return x / 1000;
    }

    // Grama para Libra
    public static double gramToPound(double x){
        return x / 453.6;
    }
    
    // Grama para Onça
    public static double gramToOunce(double x){
        return x / 28.35;
    }

    // Kilograma -para Grama
    public static double kilogramToGram(double x){
        return x * 1000;
    }

    // Kilograma para Libra
    public static double kilogramToPound(double x){
        return x * 2.205;
    }
    
    // Kilograma -para Onça
    public static double kilogramToOunce(double x){
        return x * 35.274;
    }

    // Libra para Grama
    public static double poundToGram(double x){
        return x * 453.6;
    }

    // Libra para Kilograma
    public static double poundToKilogram(double x){
        return x / 2.205;
    }
    
    // Libra para Onça
    public static double poundToOunce(double x){
        return x * 16;
    }

    // Onça para Grama
    public static double ounceToGram(double x){
        return x * 28.35;
    }

    // Onça para Kilograma
    public static double ounceToKilogram(double x){
        return x / 35.274;
    }

    // Onça para Libra
    public static double ounceToPound(double x){
        return x / 16;
    }
}
