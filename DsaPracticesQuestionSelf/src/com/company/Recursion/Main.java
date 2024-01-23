package com.company.Recursion;

public class Main {
    public static void main(String[] args) {
//        printNumber1toN(5);
//        printNumberNto1(5);
        towerOfHannoi(2,'A','B','C');

    }
// Post Order Incrinment
    public static void printNumber1toN(int n){
        if(n==0) return;
        printNumber1toN(n-1);
        System.out.println(n);
    }
    // Pre Order
    public static void printNumberNto1(int n){
        if(n==0) return;
        System.out.println(n);
        printNumberNto1(n-1);
    }

//    public static String printSubsetofString(String str, char a, char b){
//        String output = " ";
//        printSubsetofString(str,)
//    }

    public static void towerOfHannoi(int n , char s, char d, char h ){
        if(n==0) return;
        towerOfHannoi(n-1,s,h,d);
        System.out.println(n + " : " + s + " -> " + d);
        towerOfHannoi(n-1,h,d,s);
    }

}
