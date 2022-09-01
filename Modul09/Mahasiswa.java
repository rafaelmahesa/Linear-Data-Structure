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
public class Mahasiswa {
    private String nama;
    private int nim;
    private String prodi;
    private String alamat;

    Mahasiswa(){
        
    }
    Mahasiswa(String nama, int nim, String prodi, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(int nim){
        this.nim = nim;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }
    public int getNim(){
        return nim;
    }
    public String getProdi(){
        return prodi;
    }
    public String getAlamat(){
        return alamat;
    }
    @Override
    public String toString(){
        return  +nim+" "+nama+" "+prodi+" "+alamat;
    }
}
