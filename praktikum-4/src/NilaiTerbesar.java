import java.util.Scanner;

public class NilaiTerbesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = sc.nextInt();
        int[] angka = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        int terbesar = angka[0];
        for (int i = 1; i < jumlah; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }
        System.out.println();
        System.out.println("Nilai terbesar: " + terbesar );
    }
}
