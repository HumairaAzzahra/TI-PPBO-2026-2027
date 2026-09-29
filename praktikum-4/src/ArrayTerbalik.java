import java.util.Scanner;

public class ArrayTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angka = new int[10];

        System.out.println("Masukkan 10 bilangan:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array dalam urutan terbalik:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(angka[i] + " ");
        }
    }
}
