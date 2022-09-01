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
public class ListNodeObject {
    private Object elemen;
    private ListNodeObject next, prev;
    
    public ListNodeObject(){
        
    }
    public ListNodeObject(Object elemen){
        this.elemen = elemen;
    }
    public ListNodeObject(Object elemen, ListNodeObject next, ListNodeObject prev){
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }
    
    public void setElemen(Object elemen){
        this.elemen = elemen;
    }
    public void setNext(ListNodeObject next){
        this.next = next;
    }
    public void setPrev(ListNodeObject prev){
        this.prev = prev;
    }
    
    public Object getElemen(){
        return elemen;
    }
    public ListNodeObject getNext(){
        return next;
    }
    public ListNodeObject getPrev(){
        return prev;
    }
}
