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
public class PBO10119042LATIHAN50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik energiKinetik = new EnergiKinetik();
        
        energiKinetik.setMassa(145.0);
        energiKinetik.setKecepatan(25.0);
        double massa = energiKinetik.getMassa();
        double kecepatan = energiKinetik.getKecepatan();
        System.out.println("Sebuah bola baseball dengan massa " + massa + " g dilempar dengan kecepatan " + kecepatan + " m/s");
        System.out.println("a.\t Berapakah energi kinetiknya ? " + energiKinetik.hitungEnergiKinetik(massa, kecepatan));
        System.out.println("b.\t Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan ini, jika dimulai dari keadaan diam? " + energiKinetik.hitungUsaha(0));
        System.out.println("Alasan : Karena energi kinetik awal adalah nol, maka usaha total yang dilakukan sama dengan energi kinetik akhir, yaitu 45 joule.");
    }
    
    
}
