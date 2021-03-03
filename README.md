# _pelajaran-java_

## **Apa itu sebuah permukaan**

Sebagaimana yang telah dipelajari, objek-objek merumuskan interaksinya dengan dunia luar melalui metode-metode yang ditampakkan. Metode-metode membentuk permukaan objek-objek dengan dunia luar; Sebagai contoh tombol-tombol yang ada di bagian depan televisi adalah permukaan antara anda dengan perkabelan listrik di bagian lainnya di dalam bungkus plastik. Anda menekan tombol "daya" untuk menyalakan dan mematikan televisi.

Dalam bentuknya yang umum, sebuah permukaan ialah sekumpulan metode yang saling terkait yang tubuhnya kosong. Kelakuan sebuah sepeda, jika dirumuskan sebagai sebuah permukaan, mungkin muncul sebagai berikut:

```java
interface Sepeda{
    // perputaran roda per menit
    void ubahAyunan(int nilaiBaru);

    void ubahGerigi(int nilaiBaru);

    void pacukanlah(int penambahan);

    void lambatkanlah(int pengurangan);
}
```

Untuk menerapkan permukaan ini, nama dari kelas anda akan berubah (menjadi merek tertentu dari sebuah sepeda, sebagai contoh, SepedaACME), dan anda akan gunakan katakunci `implements` pada saat deklarasi kelas:

```java
class SepedaACME implements Sepeda{
    int ayunan = 0;
    int kecepatan =0;
    int gerigi = 1;

    // Kompilator akan mewajibkan metode itu
    // ubahAyunan, ubahGerigi, pacukanlah, dan lambatkanlah
    // keseluruhannya untuk diterapkan. Kompilasi akan gagal jika semua
    // metode-metode ini hilang dari kelas ini

    void ubahAyunan(int nilaiBaru){
        ayunan = nilaiBaru;
    }
    void ubahGerigi(int nilaiBaru){
        gerigi = nilaiBaru;
    }
    void pacukanlah(int penambahan){
        kecepatan = kecepatan + penambahan;
    }
    void lambatkanlah(int pengurangan){
        kecepatan = kecepatan - pengurangan;
    }
    void cetakKeadaan(){
        System.out.println("ayunan: " + ayunan + " kecepatan: " + kecepatan + " gerigi: " + gerigi );
    }
}
```

Menerapkan sebuah permukaan mengizinkan sebuah kelas untuk menjadi lebih formil berkenaan dengan kelakuan yang menjadi janji untuk disediakan. Permukaan-permukaan membentuk sebuah kontrak antara si kelas dengan dunia luar, dan kontrak ini dipaksakan pada waktu bina oleh si kompilator. Jika kelas anda mengaku akan menerapkan sebuah permukaan, semua metode yang dirumuskan oleh permukaan tersebut wajib muncul di dalam kode sumber sebelum si kelas dikompilasikan dengan sukses.

> ## **catatan**: Untuk sesungguhnya mengkompilasikan kelas `SepedaACME`, anda akan memerlukan untuk menambahkan si katakunci `public` di bagian depan dari metode-metode permukaan terterapkan. Anda akan mempelajari alasan-alasan berkenaan dengan hal tersebut di dala pelajaran-pelajaran dengan judul **Kelas-kelas dan Objek-objek** dan **Permukaan dan Pewarisan**.
