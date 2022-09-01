/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10;

/**
 *
 * @author Rafael Mahesa
 */
public class QueueDinamisObjectMain {
    public static void main(String[] args) {
        QueueDinamisObject antrian = new QueueDinamisObject();
        antrian.enqueue(new Mahasiswa("Andi", 26, "Informatika", "Jogja"));
        antrian.enqueue(new Mahasiswa("Bobi", 15,  "Informatika", "Klaten"));
        antrian.enqueue(new Mahasiswa("Caca", 8, "Informatika", "Magelang"));
        antrian.enqueue(new Mahasiswa("Dea", 14, "Informatika", "Semarang"));
        antrian.enqueue(new Mahasiswa("Eko", 17, "Informatika", "Solo"));
        antrian.cetak();
        
        System.out.println("Dequeue : " + antrian.dequeue()); 
        antrian.cetak();
        System.out.println("Dequeue : " + antrian.dequeue());
        antrian.cetak();
        System.out.println("Dequeue : " + antrian.dequeue()); 
        antrian.cetak();
    }
}
