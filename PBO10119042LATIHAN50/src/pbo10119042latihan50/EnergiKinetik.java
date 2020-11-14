/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan50;

/**
 *
 * @author 
 * Nama     :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi: Program ini berisi program untuk MENGHITUNG ENERGI KINETIK
 */
public class EnergiKinetik {
    private double massa, kecepatan;
    
    public double getMassa() {
        return this.massa / 1000;
    }
    
    public void setMassa(double massa) {
        this.massa = massa;
    }
    
    public double getKecepatan() {
        return this.kecepatan;
    }
    
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik(double massa, double kecepatan) {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
    
    public double hitungUsaha(double kecepatanAwal) {
        return 0.5 * massa * (Math.pow(kecepatan, 2) - Math.pow(kecepatanAwal, 2));
    }
    
}
