import java.util.Scanner;

public class MenuMakanan {
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mneginputkan beberapa menu makanan
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Mie Aceh");
        System.out.println("4. Soto Ayam");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng.");
                break;
            case 2:
                System.out.println("Anda memilih Mie Ayam.");
                break;
            case 3:
                System.out.println("Anda memilih Mie Aceh.");
                break;
            case 4:
                System.out.println("Anda memilih Soto Ayam.");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

    }
}
