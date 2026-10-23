public class TokoDemo {
    public static void main(String[] args) {
        // membuat array berisi 5 objek produk
        Produk[] daftarProduk = new Produk[5];
        daftarProduk[0] = new Produk("P001", "Laptop", 7500000, 10);
        daftarProduk[1] = new Produk("P002", "Mouse", 150000, 20);
        daftarProduk[2] = new Produk("P003", "Keyboard", 350000, 15);
        daftarProduk[3] = new Produk("P004", "Monitor", 2200000, 8);
        daftarProduk[4] = new Produk("P005", "Flashdisk", 85000, 30);

        // menampilkan seluruh data produk
        System.out.println("==============================");
        System.out.println("     DAFTAR PRODUK TOKO");
        System.out.println("==============================");

        for (int i = 0; i < daftarProduk.length; i++) {
            daftarProduk[i].tampilkanData();
        }

        //simulasi pembelian pertama
        System.out.println();
        System.out.println("==============================");
        System.out.println("     SIMULASI PEMBELIAN");
        System.out.println("==============================");

        int jumlahBeli1 = 2;

        System.out.println("Produk: Laptop");
        System.out.println("Jumlah beli: " + jumlahBeli1);
        System.out.printf("Total harga: Rp %,.2f%n", daftarProduk[0].hitungTotalHarga(jumlahBeli1));

        daftarProduk[0].kurangiStok(jumlahBeli1);

        // simulasi pembelian kedua
        // jumlah pembelian melebihi stok yang tersedia
        System.out.println();
        System.out.println("==============================");
        System.out.println("     SIMULASI PEMBELIAN");
        System.out.println("==============================");

        int jumlahBeli2 = 25;

        System.out.println("Produk: Mouse");
        System.out.println("Jumlah beli: " + jumlahBeli2);
        System.out.printf("Total harga: Rp %,.2f%n", daftarProduk[1].hitungTotalHarga(jumlahBeli2));

        daftarProduk[1].kurangiStok(jumlahBeli2);

        // mencari produk dengan harga termahal
        System.out.println();
        System.out.println("==============================");
        System.out.println("      PRODUK TERMAHAL");
        System.out.println("==============================");

        Produk produkTermahal = daftarProduk[0];

        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].hitungTotalHarga(1) >
            produkTermahal.hitungTotalHarga(1)) {
                produkTermahal = daftarProduk[i];
            }
        }

        produkTermahal.tampilkanData();

        System.out.println("==============================");
        System.out.println("     PROGRAM SELESAI");
        System.out.println("==============================");

    }
}
