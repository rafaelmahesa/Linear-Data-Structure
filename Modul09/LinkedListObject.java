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
public class LinkedListObject {
    private ListNodeObject head;
    private int size;

    public LinkedListObject() {
        this.size = 0;
        head = new ListNodeObject();
        head.setNext(head);
        head.setPrev(head);
    }
    private ListNodeObject addBefore(Object elemen, ListNodeObject node) {
        ListNodeObject temp = new ListNodeObject(elemen);
        node.getPrev().setNext(temp);
        temp.setPrev(node.getPrev());
        temp.setNext(node);
        node.setPrev(temp);
        size++;
        return temp;
    }
    public Object remove(ListNodeObject node) {
        ListNodeObject kiri = node.getPrev();
        ListNodeObject kanan = node.getNext();
        kiri.setNext(kanan);
        kanan.setPrev(kiri);
        node.setNext(null);
        node.setPrev(null);
        size--;
        return node.getElemen();
    }
    public void addFirst(Object elemen) {
        addBefore(elemen, head.getNext());
    }
    public void addLast(Object elemen) {
        addBefore(elemen, head);
    }
    public Object removeFirst() {
        Object elemen = remove(head.getNext());
        return elemen;
    }
    public Object removeLast() {
        Object elemen = remove(head.getPrev());
        return elemen;
    }
    public ListNodeObject search(int index) {
        ListNodeObject node = head;
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
        ListNodeObject node = head.getNext();
        while (node != head) {
            Object elemen = node.getElemen();
            str.append(elemen);
            str.append("\n");
            node = node.getNext();
        }
        return str.toString();
    }
}
