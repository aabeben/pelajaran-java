public class Sepeda {
    int irama = 0;
    int kecepatan = 0;
    int gerigi = 1;

    void ubahIrama(int newValue) {
        irama = newValue;
    }

    void ubahGerigi(int newValue) {
        gerigi = newValue;
    }

    void pacukanlah(int penambah) {
        kecepatan = kecepatan + penambah;
    }

    void lambatkanlah(int pengurang) {
        kecepatan = kecepatan - pengurang;
    }

    void cetakKeadaan() {
        System.out.println("irama: " + irama + " kecepatan: " + kecepatan + " gerigi: " + gerigi);
    }

    public static void main(String[] args) {
        // buat dua buah sepeda.
        Sepeda sepeda1 = new Sepeda();
        Sepeda sepeda2 = new Sepeda();

        // Panggil metode-metode pada objek-objek tersebut.
        sepeda1.ubahIrama(50);
        sepeda1.pacukanlah(10);
        sepeda1.ubahGerigi(2);
        sepeda1.cetakKeadaan();

        sepeda2.ubahIrama(50);
        sepeda2.ubahGerigi(2);
        sepeda2.pacukanlah(40);
        sepeda2.pacukanlah(10);
        sepeda2.ubahGerigi(3);
        sepeda2.cetakKeadaan();
    }
}
