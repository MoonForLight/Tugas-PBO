public class Anjing extends Hewan implements Peliharaan {
    public Anjing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " berkata: Guk guk!");
    }

    @Override
    public void interaksi() {
        System.out.println(nama + " suka bermain bola.");
    }
}