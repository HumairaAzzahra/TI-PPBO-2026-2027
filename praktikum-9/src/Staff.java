public class Staff extends Pegawai{
    private double tunjanganKinerja;

    // constructor Staff
    public Staff(String nama, String nip, double gajiPokok, double tunjanganKinerja) {
        super(nama, nip, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

    // getter untuk tunjangan kinerja
    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }

    // Pada Staff.java:
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganKinerja;
    }

    // method untuk menampilkan ringkasan Staff
    public void tampilkanRingkasan() {
        System.out.println("Staff: " + nama);
        System.out.println("Tunjangan kinerja: " + tunjanganKinerja);
    }
}
