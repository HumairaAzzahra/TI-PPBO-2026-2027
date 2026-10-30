public class RekeningBank {
    // atribut private untuk melindungi data rekening
    private String nomorRekening;
    private String pemilik;
    private double saldo;

    // atribut read-only, hanya diisi melalui constructor
    private String jenisRekening;

    // constructor untuk menginisialisasikan data rekining
    public RekeningBank(String nomor, String pemilik, double saldoAwal, String jenisRekening) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.saldo = (saldoAwal >= 0 ? saldoAwal : 0);
        this.jenisRekening = jenisRekening;
    }

    // getter nama pemilik
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    // gettet jenis rekening (read-only, tanpa setter)
    public String getJenisRekening() {
        return jenisRekening;
    }

    // Method untuk menyetor uang
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0!");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }

    // method untuk menarik uang
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo: " + saldo);
        }
    }

    // method untuk mentransfer uang ke rekening lain
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null) {
            System.out.println("Transfer gagal rekening tujuan tidak valid!");
            return;
        }
        if (jumlah <= 0) {
            System.out.println("Transfer gagal jumlah transfer harus lebih dari 0!");
            return;
        }
        if (jumlah > saldo) {
            System.out.println("Transfer gagal saldo tidak mencukupi!");
            return;
        }

        // memindahkan saldo setelah semua validasi berhasil
        saldo -= jumlah;
        tujuan.saldo += jumlah;

        System.out.println("Transfer berhasil sebesar Rp." + jumlah);
        System.out.println("Pengirim: " + nomorRekening);
        System.out.println("Penerima: " + tujuan.nomorRekening);
    }

    // method untuk mencetak mutasi rekening
    public void cetakMutasi() {
        System.out.println("========================================");
        System.out.println("        LAPORAN MUTASI REKENING         ");
        System.out.println("========================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " +jenisRekening);
        System.out.printf("Saldo Saat Ini  : Rp.%.2f%n", saldo);
    }

}
