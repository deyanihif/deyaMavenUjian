/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Deyani Hif
 */
public class Soal {
    public int pangkat(int bil, int pangkat){
        int hasil = 0;
        int n = 1;
        while (n <=  pangkat) {
            n++;
            hasil *= bil;
        }
        return hasil;
    }
    
    public int faktorial(int bil){
        int hasil = 1;
        for (int i = 0; i <= bil; i++) {
            hasil *= i;
        }
        return hasil;
    }
    
    public int perkalian(int bilA, int bilB){
        return bilA * bilB;
    }
    
    public void test1_method1(){
        System.out.println("Ini test 1 buat method 1");
    }
    
    public void test2_method1(){
        System.out.println("Udah nyerah");
    }
    
    public void test1_method2(){
        System.out.println("Tapi terus nyoba, sampe waktu abis");
    }
    
    public void test2_method2(){
        System.out.println("Ini kenapa kang jUnit ny, aduh");
    }
    
    public void test1_method3(){
        System.out.println("jUnit gak bisa diimport. ini maven, dey");
    }
    
    public void test2_method3(){
        System.out.println("End of session, not end of life *breathe* *breathhard*");
    }
    
    public static void main(String[] args) {
        
    }
}
