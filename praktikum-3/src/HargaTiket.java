import java.util.Scanner;

public class HargaTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU TIKET BIOSKOP ===");
        System.out.println("1. Regular");
        System.out.println("2. Premium");

        System.out.print("Pilihan jenis tiket: ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        int harga = 0;

        switch (pilihan) {
            case 1:
                if (mahasiswa && umur < 25) {
                    harga = 25000;
                    System.out.println("Mendapat harga khusus mahasiswa.");
                } else {
                    harga = 30000;
                    System.out.println("Mendapat harga tiket regular.");
                }
                break;

            case 2:
                if (mahasiswa && umur < 25) {
                    harga = 30000;
                    System.out.println("Mendapat harga khusus mahasiswa");
                } else {
                    harga = 60000;
                    System.out.println("Mendapat harga tiket premium.");
                }
                break;

            default:
                System.out.println("Pilihan tiket tidak valid!");
        }

        if(harga > 0) {
            System.out.println("Harga tiket: Rp" + harga);
        }

    }
}
