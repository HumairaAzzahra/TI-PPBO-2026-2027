public class Pinguin extends Hewan implements BisaBerenang{
    public Pinguin(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + ": Honk-honk!");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " berenang di laut dan perairan pesisir");
    }
}
