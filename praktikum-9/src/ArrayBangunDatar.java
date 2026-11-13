public class ArrayBangunDatar {
    public static void main(String[] args) {
        // membuat array bertipe bangundatar yang berisi objek dari beberapa subclass
        BangunDatar[] daftarBangunDatar = {
                new Lingkaran("Lingkaran", 3),
                new Persegi("Persegi", 10),
                new Lingkaran("Lingkaran", 7),
                new PersegiPanjang("Persegi Panjang", 10, 15),
                new PersegiPanjang("Persegi Panjang", 7, 15),
        };

        // variabel untuk menyimpan total luas seluruh bangun datar
        double totalLuas = 0;
        // menyimpan objek dengan luas terbesar
        BangunDatar bangunTerbesar = daftarBangunDatar [0];

        System.out.println("======== INFORMASI BANGUN DATAR ========");

        // melakukan perulangan untuk setiap objek dalam array
         for (BangunDatar bd : daftarBangunDatar) {
             // menampilkan infromasi
             bd.tampilkanInfo();
             // menghitung total luas seluruh bangun datar
             totalLuas += bd.hitungLuas();

             // membandingkan luas untuk mencari luas bangun terbesar
             if (bd.hitungLuas() > bangunTerbesar.hitungLuas()) {
                 bangunTerbesar = bd;
             }

             System.out.println("========================");
         }

         // menampikan total seluruh bangun datar
        System.out.println("Total Luas: " + totalLuas);
        System.out.println();
        // menampilkan informasi bangun datar dengan luas terbesar
        System.out.println("Bangun Dengan Luas Terbesar");
        bangunTerbesar.tampilkanInfo();
    }

}
