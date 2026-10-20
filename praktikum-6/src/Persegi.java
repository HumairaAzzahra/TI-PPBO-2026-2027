public class Persegi {
    double sisi;

    public Persegi(double sisiAwal) {
        sisi = sisiAwal;
    }

    public void tampilkanData() {
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }
}
