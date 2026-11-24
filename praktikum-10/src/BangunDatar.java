public abstract class BangunDatar {
    // atribut protected agar dapat diakses oleh subclass
    protected String namaBangun;

    // constructor untuk mengisi nama bangun datar
    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    // abstract method: tanpa sisi, wajib diisi subclass
    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    // Method biasa: berisi kode, diwarisi apa adanya
    public void tampilkanInfo() {
        System.out.println("Nama Bangun: " + namaBangun);
        System.out.println("Luas bangun: " + hitungLuas());
        System.out.println("Keliing bangun: " + hitungKeliling());
    }
}
