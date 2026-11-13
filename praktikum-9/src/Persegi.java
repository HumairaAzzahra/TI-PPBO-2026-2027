public class Persegi extends BangunDatar{
    // atribut untuk menyimpan sisi persegi
    private double sisi;

    // constructor untuk mengisi nama bangun dan nilai sisi
    public Persegi(String namaBangun, double sisi) {
        super(namaBangun);
        this.sisi = sisi;
    }

    // override method hitung luas menggunakan rumus luas persegi
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    // override method hitung keliling menggunakan rumus keliling persegi
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
