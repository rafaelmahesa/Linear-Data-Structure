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
public class QueueStatisMain {
    public static void main(String[]args){
        QueueStatis antrian = new QueueStatis(7);
        antrian.enqueue(26);
        antrian.enqueue(15);
        antrian.enqueue(8);
        antrian.enqueue(14);
        antrian.cetak();
        
        System.out.println();
        System.out.println("Dequeue : " + antrian.dequeue()); 
        antrian.cetak();
        System.out.println();
        System.out.println("Dequeue : " + antrian.dequeue());
        antrian.cetak();
    }
}
