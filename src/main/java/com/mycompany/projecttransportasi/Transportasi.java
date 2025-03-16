/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projecttransportasi;

/**
 *
 * @author ASUS
 */
// Kelas abstrak sebagai dasar untuk berbagai jenis transportasi
// Kelas Transportasi sebagai superclass
public class Transportasi {
    
    // ATRIBUT
    String jenis;  // Jenis kendaraan (Mobil, Motor, dll.)
    int tahun;     // Tahun pembuatan kendaraan
    double harga;  // Harga kendaraan dalam rupiah
    
    //Method untuk menampilkan informasi transportasi
    void tampilkanInfo(){
        System.out.println("===INFORMASI TRANSPORTASI===");
        System.out.println("Jenis: " + jenis);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga Mobil: Rp " + harga);
        System.out.println("------------------------------");
    }
    
    public static void main(String[] args) {
        //Membuat object transportasi tanpa input 
        Transportasi mobil1 = new Transportasi();
        mobil1.jenis = "Toyota Supra MK4";
        mobil1.tahun = 1995;
        mobil1.harga = 2000000000;
        
        Transportasi mobil2 = new Transportasi();
        mobil2.jenis = "Nissan GT-R R35";
        mobil2.tahun = 2007;
        mobil2.harga = 450000000;
        
        // Menampilkan informasi setiap mobil
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
        
    }
}
    


