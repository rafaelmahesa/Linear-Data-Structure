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
public class StackDinamisMain {
    public static void main(String[] args) {
        StackDinamis tumpukan = new StackDinamis();
        tumpukan.push(26);
        tumpukan.push(15);
        tumpukan.push(8);
        tumpukan.push(14);
        tumpukan.cetak();
        
        System.out.println("Hapus : " + tumpukan.pop()); 
        tumpukan.cetak();
        System.out.println("Hapus : " + tumpukan.pop());
        tumpukan.cetak();
    }
}
