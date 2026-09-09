/*
Nama Program: KalkulatorBangunDatar
Deskripsi   : Program untuk menghitung luas dan keliling
              persegi panjang dan juga lingkaran. Serta menentukan apakah
              luas persegi panjang lebih dari 100.
Bahasa      : Java
*/

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Meminta inputan panjang persegi panjang
        System.out.println("Masukkan Panjang persegi panjang: ");
        double panjang = sc.nextDouble();

        //Meminta inputan lebar persegi panjang
        System.out.println("Masukkan lebar persegi panjang: ");
        double lebar = sc.nextDouble();

        //Menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        //Menampilkan hasil perhitungan persegi panjang
        System.out.println();
        System.out.println("Persegi panjang");
        System.out.println("Luas: " + luasPersegiPanjang);
        System.out.println("Keliling: " + kelilingPersegiPanjang);

        //Menentukan apakah luas persegi panjang > 100
        boolean luasBesar = luasPersegiPanjang > 100;
        //Menampilkan hasil
        System.out.println("Luas lebih dari 100: " + luasBesar);

        //Meminta inputan jari - jari lingkaran
        System.out.println();
        System.out.println("Masukkan jari-jari lingkaran:");
        double jarijari = sc.nextDouble();

        //Menghitung luas dan keliling lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jarijari * jarijari;
        double kelilingLingkaran = 2 * Math.PI * jarijari;

        //Menampilkan hasil perhitungan lingkaran
        System.out.println();
        System.out.println("Lingkaran");
        System.out.println("Luas: " + luasLingkaran);
        System.out.println("Keliling: " + kelilingLingkaran);

    }
}
