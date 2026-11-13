public class PersegiPanjang extends BangunDatar{
    // atribut untuk menyimpan panjang dan lebar
    private double panjang;
    private double lebar;

    // constructor untuk mengisi nama bangun, panjang, dan lebar
    public PersegiPanjang(String namaBangun, double panjang, double lebar) {
        super(namaBangun);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // override method hitung luas menggunakan rumus luas persegi panjang
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    // override method hitung keliling menggunakan rumus keliling persegi panjang
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
