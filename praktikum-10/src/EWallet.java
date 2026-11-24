public class EWallet extends MetodePembayaran implements BisaCashback{
    // constructor untuk memberikan nama
    public EWallet() {
        super("E-Wallet");
    }

    // implemetasi biaya admin tetap sebesar Rp.1.000
    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 1000;
    }

    // menghitung cashback sebesar 5% dari jumlah belanja
    @Override
    public double hitungCashback(double jumlah) {
        double cashback = jumlah * 0.05;

        // membatasi cashback maksimal sebesar Rp.20.000
        if (cashback > 20000) {
            cashback = 20000;
        }

        return cashback;
    }
}
