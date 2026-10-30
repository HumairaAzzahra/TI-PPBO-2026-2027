public class SiswaDemo {
    public static void main(String[] args) {
        Siswa s1 = new Siswa(85);

        System.out.println("Nilai awal: " + s1.getNilai());
        System.out.println("Nilai huruf: " + s1.getNilaiHuruf());

        System.out.println();
        System.out.println("Mengubah nilai menjadi 75:");
        s1.setNilai(75);

        System.out.println("Nilai sekarang: " + s1.getNilai());
        System.out.println("Nilai huruf: " + s1.getNilaiHuruf());

        System.out.println();
        System.out.println("Menambahkan nilai yang tidak valid:");
        s1.setNilai(150);

        System.out.println("Nilai sekarang: " + s1.getNilai());
        System.out.println("Nilai huruf: " + s1.getNilaiHuruf());
    }
}
