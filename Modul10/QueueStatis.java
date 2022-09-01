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
import java.util.NoSuchElementException;
public class QueueStatis {
    int elemen[], front, rear, size;

    QueueStatis() {
        
    }
    QueueStatis(int ukuran) {
        elemen = new int[ukuran];
    }
    public boolean enqueue(int data) {
        if (size < elemen.length) {
            elemen[rear] = data;
            if (rear == elemen.length - 1) {
                rear = 0;
            } else {
                rear++;
            }
            size++;
            return true;
        }
        return false;
    }
    public int dequeue() {
        if (elemen.length != 0) {
            int hapus = elemen[front];
            if (front == elemen.length - 1) {
                front = 0;
            } else {
                front++;
            }
            size--;
            return hapus;
        }
        throw new NoSuchElementException();
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }
    public void cetak() {
        for (int i = front; i < rear; i++) System.out.print(elemen[i]+" ");
    }
}
