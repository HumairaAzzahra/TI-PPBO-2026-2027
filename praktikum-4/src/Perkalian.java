import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = sc.nextInt();

        System.out.println("Tabel perkalian " + angka + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }
}
