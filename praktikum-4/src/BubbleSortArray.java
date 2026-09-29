import java.util.Scanner;

public class BubbleSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = sc.nextInt();
        int[] angka = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array sebelum diurutkan:");

        for (int i =0; i < jumlah; i++) {
            System.out.print(angka[i] + " ");
        }

        // bubble sort
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - 1; j++) {
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array setelah diurutkan:");

        for (int i = 0; i < jumlah; i++) {
            System.out.print(angka[i] + " ");
        }

    }
}
