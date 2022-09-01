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
public class MahasiswaMain {
    public static void main(String[] args){
        int[] NimMahasiswa={75, 76, 77, 78, 79};
        Mahasiswa[] mahasiswa1=new Mahasiswa[5];
        
        for(int i=0; i<mahasiswa1.length; i++){
            mahasiswa1[i]=new Mahasiswa();
            mahasiswa1[i].setNim(NimMahasiswa[i]);
        }
        Larik.cetak(mahasiswa1);
    }
}
