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
public class LinkedList {
    private ListNode head;
    private int size;

    public LinkedList() {
        this.size = 0;
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
    }
    private ListNode addBefore(int elemen, ListNode node) {
        ListNode temp = new ListNode(elemen);
        node.getPrev().setNext(temp);
        temp.setPrev(node.getPrev());
        temp.setNext(node);
        node.setPrev(temp);
        size++;
        return temp;
    }
    public int remove(ListNode node) {
        ListNode kiri = node.getPrev();
        ListNode kanan = node.getNext();
        kiri.setNext(kanan);
        kanan.setPrev(kiri);
        node.setNext(null);
        node.setPrev(null);
        size--;
        return node.getElemen();
    }
    public void addFirst(int elemen) {
        addBefore(elemen, head.getNext());
    }
    public void addLast(int elemen) {
        addBefore(elemen, head);
    }
    public int removeFirst() {
        int elemen = remove(head.getNext());
        return elemen;
    }
    public int removeLast() {
        int elemen = remove(head.getPrev());
        return elemen;
    }
    public ListNode search(int index) {
        ListNode node = head;
        node = node.getNext();
        int i = 0;
        while (node != head) {
            if (i == index) {
                return node;
            }
            node = node.getNext();
            i++;
        }
        return null;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        ListNode node = head.getNext();
        while (node != head) {
            int elemen = node.getElemen();
            str.append(elemen);
            str.append(" ");
            node = node.getNext();
        }
        return str.toString();
    }
}
