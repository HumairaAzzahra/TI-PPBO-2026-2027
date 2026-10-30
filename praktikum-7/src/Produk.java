public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        if (harga >= 0) {
            this.harga = harga;
        } else {
            this.harga = 0;
            System.out.println("Harga ditolak! Harga tidak boleh bernilai negatif.");
        }

        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
            System.out.println("Stok ditolak! Stok tidak boleh bernilai negatif");
        }
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga ditolak! Harga tidak boleh bernilai negatif.");
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambahkan.");
        } else {
            System.out.println("Stok ditolak! Jumalah yang ditambahkan harus lebih dari 0!");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Stok ditolak! Jumlah yang dikurangi harus lebih dari 0!");
        } else if (jumlah > stok) {
            System.out.println("Stok ditolak! Stok tidak mencukupi!");
        } else {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi.");
        }
    }

    public void tampilkanData() {
        System.out.println("Kode produk: " + getKodeProduk());
        System.out.println("Nama produk: " + getNamaProduk());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());
    }
}
