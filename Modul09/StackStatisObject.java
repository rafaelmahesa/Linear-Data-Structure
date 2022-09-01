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
public class StackStatisObject {
    Object elemen[];
    int front, size;
    
    StackStatisObject() {
        front = -1;
        elemen = new Object [100];
        size = 0;
    }
    StackStatisObject(int ukuran) {
        front = -1;
        elemen = new Object [ukuran];
        size = 0;
    }
    public boolean push(Object tambah) {
        front = front + 1;
        elemen[front] = tambah;
        size++;
        return true;
    }
    public Object pop() {
        Object temp = elemen[front];
        front = front - 1;
        size--;
        return temp;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        if(size == 0) return true;
        else return false;
    }
    public void cetak(){
        for(int i = 0; i < size; i++) System.out.println(" "+elemen[i]);
    }
}
