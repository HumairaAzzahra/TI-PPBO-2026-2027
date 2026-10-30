public class WaktuDemo {
    public static void main(String[] args) {
        Waktu w1 = new Waktu(10, 30, 45);

        System.out.println("Waktu awal:");
        w1.tampilkanWaktu();

        System.out.println("Mengubah waktu dengan nilai valid:");
        w1.setJam(15);
        w1.setMenit(40);
        w1.setDetik(50);
        w1.tampilkanWaktu();

        System.out.println();
        System.out.println("Mengubah waktu dengan nilai tidak valid:");
        w1.setJam(25);
        w1.setMenit(70);
        w1.setDetik(80);

        System.out.println();
        System.out.println("Waktu setelah validasi:");
        w1.tampilkanWaktu();
    }
}
