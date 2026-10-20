public class ProdukLatihan {
    String namaProduk;
    double harga;

    public ProdukLatihan(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
}
