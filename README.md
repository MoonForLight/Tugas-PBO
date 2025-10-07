# Tugas-PBO

## Struktur
- `Hewan` (**abstract class**) berisi atribut `nama`, `umur`, dan method abstrak `bersuara()`.
- `Kucing` dan `Anjing` **mewarisi** `Hewan` dan **mengimplementasi** `Peliharaan` (**interface**) dengan method `interaksi()`.
- Di `Zoo.main`, dibuat **Array of Object** (`Hewan[]`) berisi objek `Kucing` dan `Anjing` lalu dipanggil `bersuara()` ⇒ **Polymorphism**.

## Poin OOP
- **Inheritance**: `Kucing` dan `Anjing` mewarisi `Hewan`.
- **Abstract Class**: `Hewan` memiliki method abstrak `bersuara()`.
- **Interface**: `Peliharaan` dengan `interaksi()` diimplementasikan oleh `Kucing` dan `Anjing`.
- **Polymorphism**: Pemanggilan `bersuara()` pada elemen `Hewan[]` menghasilkan perilaku berbeda sesuai tipe objek nyata.
- **Array of Object**: `Hewan[] daftarHewan` menampung berbagai objek turunan.