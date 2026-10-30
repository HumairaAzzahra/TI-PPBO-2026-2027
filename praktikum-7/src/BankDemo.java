public class BankDemo {
    public static void main(String[] args) {
        // membuat dua objek rekening bank
        RekeningBank rek1 = new RekeningBank("001", "Budi", 100000, "Tabungan");
        RekeningBank rek2 = new RekeningBank("002", "Anita", 200000, "Giro");

        // menguji setor pada kedua rekening
        System.out.println("=== Transaksi Setor ===");
        rek1.setor(50000);
        rek2.setor(100000);

        // menguji penarikan pada kedua rekening
        System.out.println();
        System.out.println("=== Transaksi Penarikan");
        rek1.tarik(30000);
        rek2.tarik(50000);

        // menguji transfer yang berhasil
        System.out.println();
        System.out.println("=== Transfer Berhasil ===");
        rek1.transferKe(rek2, 20000);

        // menguji transfer yang gagal karena saldo tidak cukup
        System.out.println();
        System.out.println("=== Transfer Gagal ===");
        rek1.transferKe(rek2, 500000);

        // menguji transfer dengan jumlah tidak valid
        System.out.println();
        System.out.println("=== Transfer Tidak Valid ===");
        rek2.transferKe(rek1, -10000);

        // menampilkan laporan mutasi akhir rekening Budi dan Anita
        System.out.println();
        rek1.cetakMutasi();

        System.out.println();
        rek2.cetakMutasi();
    }
}
