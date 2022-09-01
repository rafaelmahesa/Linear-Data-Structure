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
public class LinkedList {
    private ListNode firstNode, lastNode;
    private String nama;
    
    LinkedList(){
        firstNode = null;
        lastNode = null;
    }
    LinkedList(String nama){
        firstNode = null;
        lastNode = null;
        this.nama=nama;
    }
    public void addFirst(int first){
        if(isEmpty()){
            ListNode baru = new ListNode(first);
            firstNode = baru;
            lastNode = baru;
        }
        else{
            ListNode baru = new ListNode(first);
            baru.setNext(firstNode);
            firstNode = baru;
        }
        
    }
    public void addLast(int last){
        if(isEmpty()){
            ListNode baru = new ListNode(last);
            firstNode = baru;
            lastNode = baru;
        }
        else{
            ListNode baru = new ListNode(last);
            lastNode.setNext(baru);
            lastNode = baru;
        }
    }
    public ListNode removeFirst(){
        if (!isEmpty()) {
            if(firstNode == lastNode){
                ListNode bantu = firstNode;;
                lastNode = firstNode = null;
                return bantu;
            } else{
                ListNode bantu;
                bantu = firstNode;
                firstNode = firstNode.getNext();
                return bantu;
            }
        } else return null;
    }
    public ListNode removeLast(){
        if (!isEmpty()) {
            if (firstNode == lastNode) {
                ListNode bantu = firstNode;
                lastNode = firstNode = null;
                return bantu;
            } else {
                ListNode bantu;
                bantu = firstNode;
                while(bantu.getNext() != lastNode) bantu = bantu.getNext();
                lastNode = bantu;
                bantu = bantu.getNext();
                lastNode.setNext(null);
                return bantu;
            }
        } else return null;
    }
    public boolean isEmpty(){
        if (firstNode == null) return true;
        else return false;
    }
    @Override
    public String toString() {
        return firstNode+", "+lastNode+", "+nama;
    }
    public void printList(){
        ListNode node = firstNode;
        if(node == null) System.out.println("List Kosong");
        else{
            while(node != null){
                System.out.print(node.getData()+", ");
                node = node.getNext();
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        LinkedList list1 = new LinkedList();
        list1.printList();
        System.out.println("Menambahkan data 8");
        list1.addFirst(8);
        list1.printList();
        System.out.println("Menambahkan data 15 di awal senarai");
        list1.addFirst(15);
        list1.printList();
        System.out.println("Menambahkan data 26 di akhir senarai");
        list1.addLast(26);
        list1.printList();
        System.out.println("Menambahkan data 14 di akhir senarai");
        list1.addLast(14);
        list1.printList();
        System.out.println("Menghapus data di posisi akhir senarai");
        list1.removeLast();
        list1.printList();
        System.out.println("Menghapus data di posisi akhir senarai");
        list1.removeLast();
        list1.printList();
        System.out.println("Menghapus data di posisi awal senarai");
        list1.removeFirst();
        list1.printList();
        System.out.println("Menghapus data di posisi awal senarai");
        list1.removeFirst();
        list1.printList();
    }
}