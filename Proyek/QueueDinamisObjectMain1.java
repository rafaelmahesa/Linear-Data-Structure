/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyek;

import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Mahesa
 */
public class QueueDinamisObjectMain1 {
    public static void main(String[] args) {
        int n=0;
        Scanner input = new Scanner(System.in);
        QueueDinamisObject antrian = new QueueDinamisObject();
        while(n<4){
            n = Integer.parseInt(JOptionPane.showInputDialog("Menu Inventaris\n 1. Barang Masuk\n 2. Barang Keluar\n 3. Urutan Barang\n 4. Keluar\n Masukkan: "));
            switch(n){
                case 1:{
                    String nama = JOptionPane.showInputDialog("Nama Barang: ");
                    int tahun = Integer.parseInt(JOptionPane.showInputDialog("Tahun Kadaluarsa Barang: "));
                    int bulan = Integer.parseInt(JOptionPane.showInputDialog("Bulan Kadaluarsa Barang: "));
                    int hari = Integer.parseInt(JOptionPane.showInputDialog("Hari Kadaluarsa Barang: "));
                    antrian.enqueue(new Barang(nama, LocalDate.of(tahun, bulan, hari)));
                    JOptionPane.showMessageDialog(null, nama+" telah disimpan");
                    break;
                }
                case 2:{
                    JOptionPane.showMessageDialog(null, "Barang Keluar : " + antrian.dequeue());
                    break;
                }
                case 3:{
                    System.out.println();
                    antrian.cetak();
                    break;
                }
                case 4:{
                    System.out.println("Terima Kasih");
                    System.exit(0);
                }
            }
        }
    }
}