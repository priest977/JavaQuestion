package com.company.String;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Nafish");
        String str1 = "nan";
//        oddCharacter(str1);
//        reverseString(str1);
 //       isPalidromeOrNot(str1);
        isPalindromeOrNotWhileLoop(str1);
    }

    // Find odd Character in String

    public static void oddCharacter(String str){
        String odd = "";
        for (int i = 0; i <str.length() ; i++) {
            if(i%2!=0)
             odd = odd+str.charAt(i);
        }
        System.out.println(odd +   "  Odd  ");
    }
    // Find Reverse of String
    public static void reverseString(String str){
        String res = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            res =  res+str.charAt(i);
        }
        System.out.println(res);
    }
    // By using For Loop
    public static void isPalidromeOrNot(String str){
        String temp = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            temp += str.charAt(i);
        }
        if(temp.equals(str)){
            System.out.println(str + " Is Palindrome ");
        }else {
            System.out.println(str + " Is Not Palindrome ");
        }
    }

    // By using While loop

    public static void isPalindromeOrNotWhileLoop(String str){
        int l = 0;
        int r = str.length()-1;
        String temp = "";
        while ((l<r)){
            temp += str.charAt(l);
            l++;
            r--;
        }
        if(temp.equals(str))
            System.out.println(str + " Is Palindrome");
        else
            System.out.println(str +  " Is Not Palindrome ");
    }

}
