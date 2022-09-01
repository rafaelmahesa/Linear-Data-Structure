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
public class ListNode {
    private int elemen;
    private ListNode next, prev;
    
    public ListNode(){
        
    }
    public ListNode(int elemen){
        this.elemen = elemen;
    }
    public ListNode(int elemen, ListNode next, ListNode prev){
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }
    
    public void setElemen(int elemen){
        this.elemen = elemen;
    }
    public void setNext(ListNode next){
        this.next = next;
    }
    public void setPrev(ListNode prev){
        this.prev = prev;
    }
    
    public int getElemen(){
        return elemen;
    }
    public ListNode getNext(){
        return next;
    }
    public ListNode getPrev(){
        return prev;
    }
}
