public class Kucing extends Hewan implements Peliharaan {
    public Kucing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " berkata: Meong!");
    }

    @Override
    public void interaksi() {
        System.out.println(nama + " suka dielus.");
    }
}