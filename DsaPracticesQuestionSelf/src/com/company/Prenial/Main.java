package com.company.Prenial;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        reversename("My name is Nafish");
    }

    public static void reversename(String str){
        String ans = " ";
        for (int i = 0; i <str.length()  ; i++) {
            ans += str.charAt(i);
            ans = ans.toLowerCase(Locale.ROOT);
        }
        System.out.println(ans);
    }
}
