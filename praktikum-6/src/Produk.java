public class Produk {
    // atribut produk
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // constructor dengan parameter menggunakan this
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // menghitung total harga pembelian
    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // mengurangi stok jika jumlah mencukupi
    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Pembelian Berhasil!");
            System.out.println("Sisa stok: " +  stok);
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    // menampilkan seluruh data produk
    public void tampilkanData() {
        System.out.println("------------------------");
        System.out.println("Kode produk: " + kodeProduk);
        System.out.println("Nama produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}
