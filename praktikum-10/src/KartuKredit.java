public class KartuKredit extends MetodePembayaran implements BisaCashback{
    // constructor untuk memberikan nama metode pembayaran
    public KartuKredit() {
        super("Kartu Kredit");
    }

    // implementasi biaya admin sebesar 2% dari jumlah belanja
    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return jumlah * 0.02;
    }

    // implementasi cashback sebesar 1% dari jumlah belanja
    @Override
    public double hitungCashback(double jumlah) {
        return jumlah * 0.01;
    }
}
