package com.company.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        int arr[]=  {1, 3, 9, 7, 5};
//        System.out.println(searchMaxElement(arr));
//        System.out.println(factorial(5));
//
//        double[] myList = {1, 5, 5, 5, 5, 1};
//        double max = myList[0];
//        int indexOfMax = 0;
//        for(int i = 1; i<myList.length; i++) {
//            if(myList[i] > max){
//                max = myList[i];
//                indexOfMax = i;
//            }
//        }
//        System.out.println(indexOfMax);

//        String str = "I live in India";
//        System.out.println(removeCharacterInString(str));
//        countallcharacterinString(str);
//        countVowelinstr(str);
//        int result = countVowel(str);
//        System.out.println(result);

        int arr[] = {21,10,5,13,40};
//        System.out.println(maxAndMinElement(arr));
        reverseArray(arr);
        printArray(arr);

    }



    public static int searchMaxElement(int arr[]){
        int maxElement = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(maxElement<arr[i]){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static int factorial(int n){
        if(n==1) return 1;
        int result = factorial(n-1);
        return n*result;
    }

    public static int countVowel(String str){
        int count = 0;
        str = str.toLowerCase();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void countVowelinstr(String str){
        int count = 0;
        char ch = 'I';
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(ch + " : " + count);
    }

    public static void countallcharacterinString(String str){
        HashMap<Character,Integer > hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(hashMap.containsKey(str.charAt(i))){
                hashMap.put(str.charAt(i),hashMap.getOrDefault(i,1)+1);
            }else {
                hashMap.put(str.charAt(i) , 1);
            }
        }
        // For printing the hasMap
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Remove the character in String
    // String str = " I live In india";
    // Char ch = 'i';
    // We want to remove the character in string

    public static String removeCharacterInString(String str){
        char ch = 'i';
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static int maxAndMinElement(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void reverseArray(int arr[]){
        int l = 0;
        int r = arr.length-1;
        while ((l<=r)){
            swap(arr,l,r);
            l++;
            r--;
        }
    }

    public static void swap(int arr[], int l , int r){
//        int l = 0;
//        int r = arr.length-1;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void printArray(int arr[]){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
