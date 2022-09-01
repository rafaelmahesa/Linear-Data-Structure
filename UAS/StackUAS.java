/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Rafael Mahesa
 */
public class StackUAS {
    LinkedList list;
    
    StackUAS(){
        list = new LinkedList();
    }
    public void tambah(char a){
        list.addLast(a);
    }
    public char ambil(){
        return (char)list.removeLast();
    }
    public int ukuran(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public static void main(String []args){
        Scanner key = new Scanner(System.in);
        StackUAS stack = new StackUAS();
        String kalimat;
        
        System.out.print("Silahkan masukkan kalimat: ");
        kalimat = key.nextLine();
        
        for(int x=0; x<kalimat.length(); x++)
            stack.tambah(kalimat.charAt(x));
        
        for(int x=0; x<kalimat.length(); x++)
            System.out.print(stack.ambil());
    }
}
