import java.util.Scanner;

public class OperatorBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Bilangan Pertama: ");
        int a = sc.nextInt();

        System.out.println("Masukkan Bilangan Kedua: ");
        int b = sc.nextInt();

        // operasi aritmatika
        System.out.println();
        System.out.println("Hasil Operasi Aritmatika: ");
        System.out.println("Penjumlahan: " + (a + b));
        System.out.println("Pengurangan: " + (a - b));
        System.out.println("Perkalian: " + (a * b));
        System.out.println("Pembagian: " + (a / b));
        System.out.println("Sisa Bagi: " + (a % b));

        // perbandingan
        System.out.println();
        System.out.println("Hasil Perbandingan: ");
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " == " + b  + " = " + (a == b));

    }
}
