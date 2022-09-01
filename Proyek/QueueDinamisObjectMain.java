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
public class QueueDinamisObjectMain {
    public static void main(String[] args) {
        QueueDinamisObject antrian = new QueueDinamisObject();
        antrian.enqueue(new Barang("Barang A", LocalDate.of(2022, 2, 24)));
        antrian.enqueue(new Barang("Barang B", LocalDate.of(2022, 4, 12)));
        antrian.enqueue(new Barang("Barang C", LocalDate.of(2021, 12, 10)));
        antrian.enqueue(new Barang("Barang D", LocalDate.of(2023, 6, 5)));
        antrian.cetak();
        
        antrian.search(2);
        System.out.println();
        
        System.out.println("Dequeue : " + antrian.dequeue()); 
        antrian.cetak();
        System.out.println("Dequeue : " + antrian.dequeue());
        antrian.cetak();
        System.out.println("Dequeue : " + antrian.dequeue()); 
        antrian.cetak();
    }
}