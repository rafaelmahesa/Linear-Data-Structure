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
public class StackStatis {
    int elemen[], front, size;
    
    StackStatis() {
        front = -1;
        elemen = new int [100];
        size = 0;
    }
    StackStatis(int ukuran) {
        front = -1;
        elemen = new int [ukuran];
        size = 0;
    }
    public boolean push(int tambah) {
        front = front + 1;
        elemen[front] = tambah;
        size++;
        return true;
    }
    public int pop() {
        int temp = elemen[front];
        front = front - 1;
        size--;
        return temp;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }
    public void cetak(){
        for (int i = 0; i < size; i++) System.out.print(elemen[i]+" ");
    }
}
