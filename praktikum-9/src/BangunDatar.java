public class BangunDatar {
    // atribut protected agar dapat diakses oleh subclass
    protected String namaBangun;

    // constructor untuk mengisi nama bangun datar
    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    // Method untuk menghitung luas dan keliling yang akan di override oleh subclass
    public double hitungLuas() {
        return 0;
    }
    public double hitungKeliling() {
        return 0;
    }

    // Method untuk menampikkan informasi bangun datar
    public void tampilkanInfo() {
        System.out.println("Nama Bangun: " + namaBangun);
        System.out.println("Luas bangun: " + hitungLuas());
        System.out.println("Keliing bangun: " + hitungKeliling());
    }
}
