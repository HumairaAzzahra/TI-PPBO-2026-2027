public class Mobil extends Kendaraan{
    private int jumlahPintu;

    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan Maks: " + kecepatanMaks);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
