public class Zoo {
    public static void main(String[] args) {
        Hewan[] daftarHewan = new Hewan[4];

        daftarHewan[0] = new Kucing("Mimi", 2);
        daftarHewan[1] = new Anjing("Bobby", 3);
        daftarHewan[2] = new Kucing("Oyen", 1);
        daftarHewan[3] = new Anjing("Blacky", 4);

        for (Hewan h : daftarHewan) {
            h.bersuara();
            if (h instanceof Peliharaan) {
                ((Peliharaan) h).interaksi();
            }
            System.out.println();
        }
    }
}