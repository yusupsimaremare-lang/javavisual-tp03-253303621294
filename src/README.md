# Character Manager — TP3 (Java Visual SIH-6406)

Proyek ini adalah fondasi model class untuk aplikasi Character Manager berbasis Java 17. Berisi enum CharacterType dan class Character dengan dua constructor, validasi pada setter, serta fitur tambahan mana dan isAlive(). Class ini akan menjadi dasar GUI pada sprint berikutnya.

## Output Terminal

![Output terminal](docs/output.png)

## Struktur Folder

```text
javavisual-tp03-253303621294/
├── .gitignore
├── README.md
├── docs/
│   └── output.png
└── src/
    ├── Main.java
    └── com/
        └── unpri/
            └── charactermanager/
                └── model/
                    ├── Character.java
                    └── CharacterType.java
```

## Identitas

- **Nama:** Yusup Simbur M.Aritonang
- **NIM:** 253303621294
- **Analisis Bagian D (Google Docs):** [Buka dokumen](https://docs.google.com/document/d/12jpQKsBpTNQYiyN0xItB5gu7oqW-SOBU/edit?usp=sharing)



# Character Manager — TP3 (Java Visual SIH-6406)

Proyek ini adalah fondasi model class untuk aplikasi Character Manager berbasis Java 17. Berisi enum CharacterType dan class Character dengan dua constructor, validasi pada setter, serta fitur tambahan mana dan isAlive(). Class ini akan menjadi dasar GUI pada sprint berikutnya.

## Output Terminal

![Output terminal](docs/output.png)

## Struktur Folder

```text
javavisual-tp03-253303621294/
├── .gitignore
├── README.md
├── docs/
│   ├── output.png
│   └── tp5-output.png
└── src/
    ├── Main.java
    └── com/
        └── unpri/
            └── charactermanager/
                └── model/
                    ├── Character.java
                    ├── CharacterManager.java
                    └── CharacterType.java
```

## TP5 — Character Manager Sprint #2

Pada sprint ini ditambahkan class `CharacterManager` yang mengelola kumpulan karakter dalam sebuah `ArrayList`. Fitur yang dibuat: `equals()` berdasarkan nama (dan `hashCode()` yang sepasang), penolakan nama duplikat, pencarian dan penghapusan karakter, `getAverageLevel()`, `findByType()`, serta `findStrongest()`. Atribut `static totalCharacterCreated` mencatat jumlah object `Character` yang pernah dibuat.

### Output CRUD dan Eksperimen Reference

![Output TP5](docs/tp5-output.png)

### Fitur Bagian C: findStrongest()

[TULIS SENDIRI 2–3 kalimat. Poin yang bisa Anda bahas: kenapa method ini berguna untuk menemukan karakter dengan attackPower tertinggi, kenapa mengembalikan satu object Character dan bukan ArrayList asli (supaya Encapsulation terjaga), dan bagaimana kasus manager kosong ditangani (mengembalikan null).]

### Analisis Desain TP5

[Link Google Docs Bagian D TP5]

## Identitas

- **Nama:** Yusup Simbur M.Aritonang
- **NIM:** 253303621294
- **Analisis TP3 (Google Docs):** [Buka dokumen](https://docs.google.com/document/d/12jpQKsBpTNQYiyN0xItB5gu7oqW-SOBU/edit?usp=sharing)