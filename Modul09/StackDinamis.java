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
public class StackDinamis {
    LinkedList tumpukan;
    
    StackDinamis(){
        tumpukan = new LinkedList();
    }
    public void push(int elemen){
        tumpukan.addFirst(elemen);
    }
    public int pop(){
        return tumpukan.removeFirst();
    }
    public int size() {
        return tumpukan.size();
    }
    public boolean isEmpty() {
        return tumpukan.isEmpty();
    }
    public void cetak(){
        System.out.println(tumpukan.toString());
    }
}
