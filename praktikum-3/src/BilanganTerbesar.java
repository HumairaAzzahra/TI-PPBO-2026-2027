import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menginput tiga bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int bilangan3 = input.nextInt();

        int terbesar;

        // Melakukan proses perbandingan ketiga bilangan
        if (bilangan1 >= bilangan2 && bilangan1 >= bilangan3) {
            terbesar = bilangan1;
        } else if (bilangan2 >= bilangan1 && bilangan2 >= bilangan3) {
            terbesar = bilangan2;
        } else {
            terbesar = bilangan3;
        }

        System.out.println("Bilangan terbesar adalah: " + terbesar);


    }
}
