import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // meminta inputan suhu celsius dari user
        System.out.println("Masukkan suhu Celsius: ");
        double celsius = sc.nextDouble();

        // melakukan konversi suhu dari celsius ke fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Suhu Fahrenheit: " + fahrenheit);
    }
}
