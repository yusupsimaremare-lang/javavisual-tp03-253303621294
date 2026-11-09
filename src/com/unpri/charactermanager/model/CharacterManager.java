package com.unpri.charactermanager.model;

import java.util.ArrayList;

/**
 * Mengelola koleksi Character: tambah, cari, hapus, dan statistik dasar.
 * Menerapkan Composition: CharacterManager "has-a" ArrayList<Character>.
 */
public class CharacterManager {

    private ArrayList<Character> characterList;

    public CharacterManager() {
        this.characterList = new ArrayList<>();
    }

    public boolean addCharacter(Character character) {
        if (findByName(character.getName()) != null) {
            System.out.println("❌ Gagal: karakter dengan nama '" + character.getName() + "' sudah ada!");
            return false;
        }
        characterList.add(character);
        System.out.println("✅ Karakter '" + character.getName() + "' berhasil ditambahkan.");
        return true;
    }

    public Character findByName(String name) {
        for (Character c : characterList) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public boolean removeCharacter(String name) {
        Character target = findByName(name);
        if (target == null) {
            System.out.println("❌ Gagal hapus: karakter '" + name + "' tidak ditemukan.");
            return false;
        }
        characterList.remove(target);
        System.out.println("🗑️ Karakter '" + name + "' berhasil dihapus.");
        return true;
    }

    public int getTotalCharacters() {
        return characterList.size();
    }

    /** Mengembalikan SALINAN list (defensive copy), bukan list asli. */
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characterList);
    }

    // ===== Bagian B: Mini-Challenge =====

    public double getAverageLevel() {
        if (characterList.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (Character c : characterList) {
            total += c.getLevel();
        }
        return (double) total / characterList.size();
    }

    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> hasil = new ArrayList<>();
        for (Character c : characterList) {
            if (c.getType() == type) {
                hasil.add(c);
            }
        }
        return hasil;
    }

    // ===== Bagian C: fitur analitik =====

    /**
     * Mencari karakter dengan attackPower tertinggi di dalam manager.
     * Jika ada beberapa karakter dengan nilai sama, yang pertama ditambahkan yang dikembalikan.
     *
     * @return Character dengan attackPower tertinggi, atau null jika manager kosong
     */
    public Character findStrongest() {
        if (characterList.isEmpty()) {
            return null;
        }
        Character strongest = characterList.get(0);
        for (Character c : characterList) {
            if (c.getAttackPower() > strongest.getAttackPower()) {
                strongest = c;
            }
        }
        return strongest;
    }
}