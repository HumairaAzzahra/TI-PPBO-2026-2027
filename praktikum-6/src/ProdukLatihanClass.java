public class ProdukLatihanClass {
    public static void main(String[] args) {
        ProdukLatihan p1 = new ProdukLatihan("wireless Mouse", 150000);
        ProdukLatihan p2 = new ProdukLatihan("Keyboard", 500000);
        ProdukLatihan p3 = new ProdukLatihan("HeadPhone", 180000);

        double batasHarga = 400000;

        System.out.println(p1.namaProduk + " Mahal? " + p1.isMahal(batasHarga));
        System.out.println(p2.namaProduk + " Mahal? " + p2.isMahal(batasHarga));
        System.out.println(p3.namaProduk + " Mahal? " + p3.isMahal(batasHarga));
    }
}
