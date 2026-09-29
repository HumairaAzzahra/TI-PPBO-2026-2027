import java.util.Scanner;

public class PengolahanNilaiKelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];

        // input nilai mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        /* menghitung nilai rata-rata, tertinggi,
        terendah, dan jumlah lulus
         */
        int total = 0;
        int nilaitertinggi = nilai[0];
        int nilaiterendah = nilai[0];
        int jumlahlulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];
            if (nilai[i] > nilaitertinggi) {
                nilaitertinggi = nilai[i];
            }

            if (nilai[i] < nilaiterendah) {
                nilaiterendah = nilai[i];
            }

            if (nilai[i] >= 70) {
                jumlahlulus++;
            }
        }

        double ratarata = (double) total / n;
        int jumlahtidaklulus = n - jumlahlulus;

        // sorting ascending menggunakan bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // hasil (output)
        System.out.println();
        System.out.println("========================================");
        System.out.println("        HASIL PENGOLAHAN NILAI ");
        System.out.println("========================================");

        System.out.println("Jumlah mahasiswa       : " + n);
        System.out.println("Total nilai            : " + total);
        System.out.printf("Rata-rata kelas        : %.2f%n", ratarata);
        System.out.println("Nilai tertinggi        : " + nilaitertinggi);
        System.out.println("Nilai terendah         : " + nilaiterendah);
        System.out.println("Jumlah mahasiswa lulus : " + jumlahlulus);
        System.out.println("Jumlah tidak lulus     : " + jumlahtidaklulus);

        System.out.println();
        System.out.println("Nilai setelah diurutkan:");

        for (int i = 0; i < n; i++){
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }

        System.out.println("========================================");
    }
}
