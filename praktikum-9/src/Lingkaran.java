public class Lingkaran extends BangunDatar{
    // atribut untuk menyimpan jari-jari lingkaran
    private double radius;

    // constructor untuk mengisi nama bangun dan nilai radius
    public Lingkaran(String namaBangun, double radius) {
        super(namaBangun);
        this.radius = radius;
    }

    // override method hitung luas menggunakan rumus luas lingkaran
    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    // override method hitung keliling menggunakan rumus keliling lingkaran
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}
