public class BukuClass {
    public static void main(String[] args) {
        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hinata", 2005);

        System.out.println("Data buku sebelum diubah:");
        b1.tampilkanData();

        // mengubah judul dan pengarang
        b1.setJudul("Buku");
        b1.setPengarang("Tere Liye");

        System.out.println();
        System.out.println("Data buku setelah diubah:");
        b1.tampilkanData();
    }
}
