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
public class QueueDinamis {
    LinkedList antrian;
    
    QueueDinamis(){
        antrian = new LinkedList();
    }
    public void enqueue(int data){
        antrian.addLast(data);
    }
    public int dequeue(){
        return antrian.removeFirst();
    }
    public int size(){
        return antrian.size();
    }
    public boolean isEmpty(){
        return antrian.isEmpty();
    }    
    public void cetak(){
        System.out.println(antrian.toString());
    }
}
