public class Manager extends Pegawai {
    private double tunjanganJabatan;

    // constructor Manager
    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok); // panggil constructor Pegawai
        this.tunjanganJabatan = tunjanganJabatan;
    }

    // getter untuk tunjangan jabatan
    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    // method untuk menampilkan ringkasan manager
    public void tampilkanRingkasan() {
        System.out.println("Manager: " + nama);
        System.out.println("Tunjangan jabatan: " + tunjanganJabatan);
    }
}

