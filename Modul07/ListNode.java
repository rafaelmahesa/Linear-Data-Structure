/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul07;

/**
 *
 * @author Rafael Mahesa
 */
public class ListNode {
    private int data;
    private ListNode next;
    
    ListNode(int data){
        this.data=data;
    }
    ListNode(int data, ListNode next){
        this.data=data;
        this.next=next;
    }
    public void setData(int data){
        this.data=data;
    }
    public int getData(){
        return data;
    }
    public void setNext(ListNode next){
        this.next=next;
    }
    public ListNode getNext(){
        return next;
    }
}