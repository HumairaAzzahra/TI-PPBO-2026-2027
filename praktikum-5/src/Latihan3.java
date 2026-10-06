public class Latihan3 {
    static double konvesiSuhu(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    static double konverSuhu(double celcius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celcius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celcius * 9 / 5) + 32;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Celsius ke Fahrenheit:");
        System.out.println(konvesiSuhu(25));

        System.out.println("Celcius ke Kelvin:");
        System.out.println(konverSuhu(25, "kelvin"));

        System.out.println("Celcius ke Fahrenheit:");
        System.out.println(konverSuhu(25, "Fahrenheit"));
    }
}
