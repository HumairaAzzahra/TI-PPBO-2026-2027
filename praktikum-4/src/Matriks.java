import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriks = new int[3][3];
        int total = 0;

        System.out.println("Masukkan elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris " + (i + 1) + ", kolom " + (j + 1) + ": ");
                matriks[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriks:");
        for (int i = 0; i < 3; i++) {
            int jumlahbaris = 0;
            System.out.print("Baris " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + "\t");
                jumlahbaris += matriks[i][j];
                total += matriks[i][j];
            }
            System.out.println(" = Jumlah baris: " + jumlahbaris);
        }
        System.out.println();
        System.out.println("Jumlah seluruh elemen: " + total);
    }
}
