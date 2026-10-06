import java.util.Scanner;

public class Latihan4 {
    static int cariNilaiMinimum(int[] data) {
        int minimun = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < minimun) {
                minimun = data[i];
            }
        }
        return minimun;
    }

    static int cariNilaiMaksimum(int[] data) {
        int maksimum = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > maksimum) {
                maksimum = data[i];
            }
        }
        return maksimum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai ujian: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.println("Nilai minimum: " + cariNilaiMinimum(nilai));
        System.out.println("Nilai Maksimum: " + cariNilaiMaksimum(nilai));
    }
}
