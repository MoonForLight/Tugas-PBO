public abstract class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() { return nama; }
    public int getUmur() { return umur; }

    abstract void bersuara();
}