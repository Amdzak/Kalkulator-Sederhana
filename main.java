/**
 *
 * @author Amdzak
 */

package com.main.kalkulatorsederhana;

import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        //PEMBUATAN OBJEK SCCANNER
        Scanner input = new Scanner(System.in);
        
        //TIPE DATA
        int awal,kedua,hasil,masukan;
        char operator;
        
        //INPUT USER
        System.out.println("=== Kalkulator sedernaha ===");
        System.out.print("Masukan bilangan awal : ");
        awal = input.nextInt();
        System.out.print("Masukan simbol operator : ");
        operator = input.next().charAt(0);
        System.out.print("Masukan bilangan kedua : ");
        kedua = input.nextInt();
        
        //PEMILIHAN OPERATOR
        switch(operator){
            case '+':
                hasil = awal + kedua;
                System.out.println(awal + " " + operator + " " + kedua + " = "+ hasil);
                break;
            case '-':
                hasil = awal - kedua;
                System.out.println(awal + " " + operator + " " + kedua + " = "+ hasil);
                break;
            case '*':
                hasil = awal * kedua;
                System.out.println(awal + " " + operator + " " + kedua + " = "+ hasil);
                break;
            case '/':
                hasil = awal / kedua;
                System.out.println(awal + " " + operator + " " + kedua + " = "+ hasil);
                break;
            default : 
                System.out.println("OPERATOR " + operator + " TIDAK DITEMUKAN");
        }
    }
}
