package com.company.HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
       int a [] = {1,2,3,4,5};
       int b [] = {2,3,4,8,9,1};
       printCommonElement(a,b);
    }

    public static void printCommonElement(int [] a, int [] b){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hashSet.add(a[i]);
        }
        for (int i = 0; i <b.length ; i++) {
            if(hashSet.contains(b[i]))
                System.out.print(b[i] + " ");
        }
    }
}
