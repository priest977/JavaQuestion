package com.company.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int arr[] = {2,3,5,2,9,7,1};
        maxSumElement(arr,3);
    }
//
//    public static int countFrequenciesOfElement(int arr[]){
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i <arr.length ; i++) {
//            if(hashMap.containsKey(arr[i])){
//                hashMap.put(arr[i],hashMap.get(arr[i])+1);
//            }else{
//                hashMap.put(arr[i],1);
//            }
//        }
//        int maxKey = arr[0];
//        for(Integer key : hashMap.keySet()){
//            int
//        }



    public static void maxSumElement(int arr[], int key){
//        int start = 0;
//        int start1 = 0;
//        int maxSum = 0;
//        int sum = 0;
//        while (start<arr.length){
//            if(start1<key){
//                sum += arr[start1];
//                start1++;
//            }
//            else if(start1==key){
//                maxSum = sum;
//                sum = sum-arr[start];
//                start++;
//                start1++;
//            }
//        }
//        System.out.println(maxSum);
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < key; j++) {
                sum = sum +arr[j];
            }
            maxSum = sum;
            sum = sum-arr[i];
        }
        System.out.println(maxSum);
    }
}

