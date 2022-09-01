/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu07;

import Modul04.*;

/**
 *
 * @author Rafael Mahesa
 */
public class Mahasiswa implements Comparable{
    private String nama;
    private int nim;
    
    Mahasiswa(String nama, int nim){
        this.nama=nama;
        this.nim=nim;
    }
    
    @Override
    public int compareTo(Object o){
        if(nim == ((Mahasiswa)o).getNim()) return 0;
        else if(nim >= ((Mahasiswa)o).getNim()) return 1;
        else return -1;
    }
    
    public String getNama() {
        return nama;
    }    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getNim() {
        return nim;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }
}