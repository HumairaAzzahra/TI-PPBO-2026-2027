public abstract class MetodePembayaran {
    // atribut untuk menyimpan nama metode pembayaran
    protected String namaMetode;

    // constructor untuk mengisi nama metode
    public MetodePembayaran(String namaMetode) {
        this.namaMetode = namaMetode;
    }

    // abstract method
    public abstract double hitungBiayaAdmin(double jumlah);

    // metod untuk menampilkan informasi proses pembayaran
    public void prosesPembayaran(double jumlah) {
        // menghitung biaya admin
        double admin = hitungBiayaAdmin(jumlah);

        // menghitung total pembayaran sebelum cashback
        double total = jumlah + admin;

        //menampilkan informasi pembayaran
            System.out.println("Metode Pembayaran: " + namaMetode);
            System.out.println("Jumlah Belanja: Rp" + jumlah);
            System.out.println("Biaya Admin: Rp" + admin);
            System.out.println("Total Pembayaran: Rp" + total);
    }

}
