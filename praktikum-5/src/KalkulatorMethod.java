import java.util.Scanner;

public class KalkulatorMethod {
    // Method tambah 2 angka
    static double tambah(double a, double b) {
        return a + b;
    }

    // Method overloading tambah 3 angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Method pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method Perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Method Pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    // Method Perpangkatan
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    //Method akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    // Method mencari hasil terbesar dari riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }
        return maksimum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] riwayatHasil = new double[100];
        int jumlahRiwayat = 0;
        int pilihan;

        do {
            System.out.println("");
            System.out.println("===== KALKULATOR METHOD =====");
            System.out.println("1. Tambah 2 angka");
            System.out.println("2. Tambah 3 angka");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi: ");

            pilihan = sc.nextInt();

            double hasil = 0;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double a = sc.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    double b = sc.nextDouble();

                    hasil = tambah(a, b);
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double x = sc.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    double y = sc.nextDouble();

                    System.out.print("Masukkan angka ketiga: ");
                    double z = sc.nextDouble();

                    hasil = tambah(x, y, z);
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = sc.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = sc.nextDouble();

                    hasil = kurang(a, b);
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    a = sc.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = sc.nextDouble();

                    hasil = kali(a, b);
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    a = sc.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = sc.nextDouble();

                    if (b == 0) {
                        System.out.println("Tidak dapat membagi dengan nol!");
                        continue;
                    }

                    hasil = bagi(a, b);
                    break;

                case 6:
                    System.out.print("Masukkan bilangan: ");
                    a = sc.nextDouble();

                    System.out.print("Masukkan pangkat: ");
                    b = sc.nextDouble();

                    hasil = pangkat(a, b);
                    break;

                case 7:
                    System.out.print("Masukkan bilanga: ");
                    a = sc.nextDouble();

                    if (a < 0) {
                        System.out.println("Bilangan tidak boleh negatif!");
                        continue;
                    }

                    hasil = akarKuadrat(a);
                    break;

                case 0:
                    System.out.println();
                    System.out.println("Program Selesai!");

                    if (jumlahRiwayat > 0) {
                        double[] riwayatValid = new double[jumlahRiwayat];

                        for (int i = 0; i < jumlahRiwayat; i++) {
                            riwayatValid[i] = riwayatHasil[i];
                        }

                        System.out.println(
                                "Hasil terbesar = " + riwayatKeMaksimum(riwayatValid)
                        );
                    } else {
                        System.out.println("Belum ada perhitungan!");
                    }

                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            // Menyimpan hasil perhitungan ke array
            if (pilihan >= 1 && pilihan <= 7) {
                System.out.println("Hasil = " + hasil);
                riwayatHasil[jumlahRiwayat] = hasil;
                jumlahRiwayat++;
            }

        } while (pilihan != 0);
    }

}
