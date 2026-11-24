public class Tunai extends MetodePembayaran{
    // constructor untuk memberikan nama metode pembayaran
    public Tunai() {
        super("Tunai");
    }

    // Implementasi perhitungan biaya admin
    @Override
    public double hitungBiayaAdmin(double jumlah) {
        // pembayaran tunai tidak dikenakan biaya admin
        return 0;
    }
}
