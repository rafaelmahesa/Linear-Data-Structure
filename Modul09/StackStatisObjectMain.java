/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul09;

/**
 *
 * @author Rafael Mahesa
 */
public class StackStatisObjectMain {
    public static void main(String[] args) {
        StackStatisObject tumpukan = new StackStatisObject(7);
        tumpukan.push(new Mahasiswa("Andi", 26, "Informatika", "Jogja"));
        tumpukan.push(new Mahasiswa("Bobi", 15,  "Informatika", "Klaten"));
        tumpukan.push(new Mahasiswa("Caca", 8, "Informatika", "Magelang"));
        tumpukan.push(new Mahasiswa("Dea", 14, "Informatika", "Semarang"));
        tumpukan.push(new Mahasiswa("Eko", 17, "Informatika", "Solo"));
        tumpukan.cetak();
        
        System.out.println();
        System.out.println("Hapus : " + tumpukan.pop()); 
        System.out.println();
        tumpukan.cetak();
        System.out.println();
        System.out.println("Hapus : " + tumpukan.pop());
        System.out.println();
        tumpukan.cetak();
        System.out.println();
        System.out.println("Hapus : " + tumpukan.pop()); 
        System.out.println();
        tumpukan.cetak();
    }
}
