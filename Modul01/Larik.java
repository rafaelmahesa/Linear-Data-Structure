/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul01;

/**
 *
 * @author Rafael Mahesa
 */
public class Larik {
    public static void cetak(Mahasiswa[] mahasiswa){
        for(Mahasiswa mahasiswa1 : mahasiswa) System.out.println(mahasiswa1.getNim());
    }
}
