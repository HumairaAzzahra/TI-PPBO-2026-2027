public class ArrayBangunDatar {
    public static void main(String[] args) {
        BangunDatar[] daftarBangunDatar = {
                new Lingkaran("Lingkaran", 3),
                new Persegi("Persegi", 10),
                new Lingkaran("Lingkaran", 7),
        };

         double totalLuas = 0;

         for (BangunDatar bd : daftarBangunDatar) {
             double luas = bd.hitungLuas();
             System.out.println("Luas" + bd.nama + ": " + luas);
             totalLuas += luas;
         }

        System.out.println("Total Luas: " + totalLuas);
    }
}
