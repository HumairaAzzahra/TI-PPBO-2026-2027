public class PerusahaanDemo {
    public static void main(String[] args) {
        // membuat object Manager, Staff, dan Direktur
        Manager mgr = new Manager("Budi", "M001", 8000000, 2000000);
        Staff stf = new Staff("Andi", "S001", 5000000, 1000000);
        Direktur dir = new Direktur("Humaira", "D001", 15000000, 5000000, 3000000);

        // menampilkan data
        System.out.println("===== DATA MANAGER =====");
        mgr.tampilkanData();
        System.out.println("Tunjangan jabatan: " + mgr.getTunjanganJabatan());

        System.out.println();
        System.out.println("===== DATA STAFF =====");
        stf.tampilkanData();
        System.out.println("Tunjangan kinerja: " + stf.getTunjanganKinerja());

        System.out.println();
        System.out.println("===== DATA DIREKTUR =====");
        dir.tampilkanData();
        System.out.println("Tunjangan jabatan: " + dir.getTunjanganJabatan());
        System.out.println("Tunjangan saham: " + dir.getTunjanganSaham());
    }
}
