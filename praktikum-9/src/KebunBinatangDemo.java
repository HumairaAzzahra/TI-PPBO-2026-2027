public class KebunBinatangDemo {
    public static void main(String[] args) {
        Bebek b = new Bebek("Budi");

        b.bersuara();

        Hewan[] daftarHewan = {
                new Kucing("Milo"),
                new Anjing("Rex"),
                new Kucing("Oyen"),
        };

        for (Hewan h : daftarHewan) {
            h.bersuara(); // versi method sesuai object aslinya
        }
    }
}
