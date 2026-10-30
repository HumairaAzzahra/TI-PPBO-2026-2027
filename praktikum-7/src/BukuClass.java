public class BukuClass {
    public static void main(String[] args) {
        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hinata", 2005);

        System.out.println("Judul: " + b1.getJudul());
        System.out.println("Pengarang: " + b1.getPengarang());
        System.out.println("Tahun terbit: " + b1.getTahunTerbit());

        System.out.println();
        System.out.println("Data lengkap buku:");
        b1.tampilkanData();
    }
}
