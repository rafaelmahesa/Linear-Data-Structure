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
public class StackDinamisObject {
    LinkedListObject tumpukan;
    
    StackDinamisObject(){
        tumpukan = new LinkedListObject();
    }
    public void push(Object elemen){
        tumpukan.addFirst(elemen);
    }
    public Object pop(){
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
