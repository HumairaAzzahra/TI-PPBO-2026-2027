public class ProdukDemo {
    public static void main(String[] args) {
        Produk p1 = new Produk("P001", "Laptop", 7500000, 10);

        System.out.println("DATA PRODUK AWAL");
        p1.tampilkanData();

        System.out.println();
        System.out.println("MENGUBAH HARGA PRODUK");
        p1.setHarga(8000000);
        System.out.println("Harga baru: " + p1.getHarga());

        System.out.println();
        System.out.println("MENGUBAH HARGA PRODUK DENGAN NILAI YANG TIDAK VALID");
        p1.setHarga(-5000);
        System.out.println("Harga sekarang: " + p1.getHarga());

        System.out.println();
        System.out.println("MENAMBAH STOK PRODUK");
        p1.tambahStok(5);
        System.out.println("Stok sekarang: " + p1.getStok());

        System.out.println();
        System.out.println("MENGURANGI STOK PRODUK");
        p1.kurangiStok(3);
        System.out.println("Stok sekarang: " + p1.getStok());

        System.out.println();
        System.out.println("MENGUJI STOK TIDAK MENCUKUPI");
        p1.kurangiStok(20);
        System.out.println("Stok sekarang: " + p1.getStok());

        System.out.println();
        System.out.println("DATA PRODUK AKHIR");
        p1.tampilkanData();
    }
}
