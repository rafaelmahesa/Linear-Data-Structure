/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul02;

/**
 *
 * @author Rafael Mahesa
 */
import java.util.Scanner;
public class Pangkat {
    static int pangkat(int x, int y){
        if(y != 0) return (x*pangkat(x, y-1));
        else return 1;
    }
    public static void main(String[] args){
        int x, y;
        Scanner key = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai x: ");
        x = key.nextInt();
        System.out.print("Masukkan Nilai y: ");
        y = key.nextInt();
        System.out.println(x+" dipangkatkan "+y+" = "+pangkat(x,y));
    }
}
