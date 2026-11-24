import java.util.Scanner;

public class SistemPembayaranDemo {
    public static void main(String[] args) {
        // membuat objek Scanner untuk membaca nominal belanja
        Scanner sc = new Scanner(System.in);

        // meminta pengguna memasukkan nominal belanja
        System.out.print("Masukkan nominal belanja: Rp.");
        double jumlah = sc.nextDouble();

        // membuat array bertipe metode pembayaran
        MetodePembayaran[] daftarPembayaran = {
                new Tunai(),
                new KartuKredit(),
                new EWallet(),
                new KartuKredit(),
        };

        // menyimpan total bersih paling kecil
        double totalTerendah = Double.MAX_VALUE;

        // menyimpan nama metode pembayaran paling hemat
        String MetodeTerbaik = "";

        System.out.println();
        System.out.println("========== HASIL PEMBAYARAN ==========");

        // membuat perulangan untuk memproses setiap metode pembayaran
        for (MetodePembayaran mp : daftarPembayaran) {
            // menampilkan Informasi proses pembayaran
            mp.prosesPembayaran(jumlah);

            // nilai awal cashback adalah nol
            double cashback = 0;

            // memeriksa apakah objek mengimplementasi BisaCashback
            if (mp instanceof BisaCashback) {
                // mengubah referensi menjadi tipe BisaCashback
                BisaCashback promo = (BisaCashback) mp;

                // menghitung cashback
                cashback = promo.hitungCashback(jumlah);

                // menampilkan jumlah cashback
                System.out.println("Cashback  : Rp." + cashback);
            } else {
                // menampilkan nol jika tidak mendapatkan cashback
                System.out.println("Cashback  : Rp." + cashback);
            }

            // menghitung total bersih setelah dikurangi cashback
            double totalBersih = jumlah + mp.hitungBiayaAdmin(jumlah) - cashback;

            // menampilkan total bersih pembayaran
            System.out.println("Total Bersih : Rp." +totalBersih);
            System.out.println("-----------------------");

            // memeriksa apakah total bersih lebih kecil dari sebelumnya
            if (totalBersih < totalTerendah) {
                // memperbarui total bersih paling kecil
                totalTerendah = totalBersih;

                // menyimpan nama metode pembayaran yang paling hemat
                MetodeTerbaik = mp.namaMetode;
            }
        }

        // menampilkan metode pembayaran dengan total bersih terendah
        System.out.println();
        System.out.println("========== METODE PALING HEMAT ==========");
        System.out.println("Metode Pembayaran: " + MetodeTerbaik);
        System.out.println("Total Bersih: Rp." + totalTerendah);
    }
}
