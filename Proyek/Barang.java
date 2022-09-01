/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyek;

import java.time.LocalDate;

/**
 *
 * @author Rafael Mahesa
 */
public class Barang {
    private String nama;
    private LocalDate kadaluarsa;

    public Barang() {
    }
    public Barang(String nama, LocalDate kadaluarsa) {
        this.nama = nama;
        this.kadaluarsa = kadaluarsa;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKadaluarsa(LocalDate kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }
    
    public String getNama() {
        return nama;
    }
    public LocalDate getKadaluarsa() {
        return kadaluarsa;
    }
    
    @Override
    public String toString() {
        return nama + " " + kadaluarsa;
    }
}
