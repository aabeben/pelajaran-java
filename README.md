# _pelajaran-java_

## **Apa Itu Pewarisan?**

Objek-objek yang beraneka ragam seringnya memiliki sebuah jumlah persamaan tertentu antara satu dengan yang lainnya. Sebagai contoh sepeda-sepeda gunung, sepeda-sepeda jalanan, dan sepeda-sepeda bonceng, semuanya itu memiliki persamaan karakter-karakter daripada sepeda-sepeda (kecepatan terkini, ayunan pedal terkini, gerigi terkini). Namun demikian masing-masing merumuskan fitur-fitur tambahan yang membuat mereka berbeda: sepeda boncengan memiliki dua bangku dan dua pasang pegangan, sepeda jalan memiliki pegangan jatuh; beberapa sepeda gunung memiliki tambahan cincin rantai, yang memungkinkan rasio gigi yang rendah.

Pemrograman berbasis objek mengizinkan kelas-kelas untuk mewariskan hal keadaan dan kelakuan umumnya digunakan dari kelas-kelas lainnya. Pada contoh ini, `Sepeda` sekarang menjadi super kelas dari `SepedaGunung`, `SepedaJalanan`, `SepedaBonceng`.

Sintaks untuk membuat sebuah subkelas ialah sederhana. Pada permulaan dari deklarasi kelas, gunakan katakunci `extends` diikuti oleh nama kelas yang diwarisi daripadanya.

```
class SepedaGunung extends Sepeda{
    // Bidang-bidang dan metode-metode baru
    // Yang merumuskan sebuah Sepeda Gunung terletak di sini.
}
```

Ini memberikan semua bidang-bidan dan metode-metode seperti halnya `Sepeda`, tetapi mengizinkan kodenya untuk fokus secara ekslusif pada fitur-fitur yang membuatnya jadi unik. Ini membuat kode untuk subkelas-subkelas mudah untuk dibaca.

Namun demikian, anda harus berhati-hati dalam hal mendokumentasikan secara benar hal dan kelakuan yang masing-masing superkelas rumuskan, dikarenakan kode-kode tersebut tidak akan muncul di dalam berkas sumber dari masing-masing subkelas.
