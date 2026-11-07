public class Pegawai {
    protected String nama;
    protected String nip;
    protected double gajiPokok;

    // constructor dengan validasi gaji pokok
    public Pegawai(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;

        if (gajiPokok < 0) {
            System.out.println("Peringatan: Gaji pokok tidak boleh negatif!");
            this.gajiPokok = 0;
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    // method untuk menampilkan data pegawai
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.printf("Gaji Pokok: %.0f%n", gajiPokok);
    }
}
