package com.company.SlidingWindowTechnique;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
//        int result [] = firstNegative(arr,3);
//        System.out.println(Arrays.toString(result));
//        firstNegativeNumberOfEverySubArray(arr, 3);
//        firstNegativeNumberOfEverySubArray(arr, 3);
 //       System.out.println(slidingWindowTechniqueOfmaxSum(arr,3));

//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            int sum1 = 0;
//            for (int j = 0; j<2;j++){
//                sum = sum + arr[i]+arr[j];
//                sum1 = sum1 + arr[i+j];
//            }
//            System.out.println(sum);
//            System.out.println(sum1);
//
//        }

        int arr[] = {2,4,5,2,6,8,9,1};
        System.out.println(slidingMaxSum(arr,3));
        System.out.println(slidingMinSum(arr,3));
//        System.out.println(slidingWindowBruteForceTechnique(arr,3));
//        System.out.println(maxSubArray(arr,3));
//        System.out.println(bruteForceMethodOfMaximumArray(arr,3));

//        int arr[] = {2,5,1,8,2,9,1};
//        System.out.println(slidingWindowBruteForceTechnique(arr,2));
        //       System.out.println(maxSumOfSubArray(arr,arr.length,3));
    }

    // find the largest number of subArray of size 3
    public static int slidingWindowBruteForceTechnique(int arr[], int k) {
        int size = arr.length;
        int max = -1;
        for (int i = 0; i < size; i++) {
            max = arr[i];
            for (int j = i + 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
        }
        return max;
    }

    public static int bruteForceMethodOfMaximumArray(int arr[], int key) {
        int size = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < size - key + 1; i++) {
            int currentSum = 0;
            for (int j = 0; j < key; j++) {
                currentSum = currentSum + arr[i + j];
            }
            if (currentSum >= maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;

    }

    public static int slidingWindowTechniqueOfmaxSum(int arr[], int key) {
        int windowSum = 0;
        for (int i = 0; i < key; i++) {
            windowSum = windowSum + arr[i];
        }
        int maxSum = windowSum;
        for (int i = key; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - key];
        }
        if (windowSum >= maxSum) {
            maxSum = windowSum;
        }
        return maxSum;
    }
    public static int[] firstNegative(int arr[], int key){
        int size = arr.length;
        int tempArray[] = new int[size-key+1];
        int k = 0;
        for (int i = 0; i < key; i++) {
            if (arr[i] < 0) {
                tempArray[k] = arr[i];
                k++;
            }
        }
        int finalArray[] = new int[size-key+1];
        int c = 0;
        finalArray [c] = tempArray[k-k];
        c++;
        k++;
        for (int i = key; i < size; i++) {
            if(arr[i]<0){
                tempArray[k] = arr[i] - arr[i-key];
            }
        }
        return finalArray;

    }

    public static int[] firstNegativeNumberOfEverySubArray(int arr[], int key) {
//            int size = arr.length;
//            int newArray[] = new int[arr.length-key+1];
//            int  k = 0;
//            for (int i = 0; i < key ; i++) {
//                if (arr[i] < 0) {
//                    newArray[k] = arr[i];
//                    k++;
//                }
//            }
//            int currentArray = newArray[k];
//                for (int i = key; i < size-key+1 ; i++) {
//                   if(arr[i]<0){
//                       newArray[k] = arr[i]-arr[i-key];
//                       k++;
//                   }
//                }
//                return currentArray;
//
//            }
        int size = arr.length;
        int i = 0;
        int j = 0;
        int firstArray[] = new int[size - key + 1];
        int k = 0;
        while (j < size) {
            int array[] = new int[size];
            int c = 0;
            if (j - i  < key) {
                if (arr[j] < 0) {
                    array[c] = arr[j];
                    c++;
                }
                j++;
               firstArray[k] = array[c];
               k++;
            } else if ((j - i  == key)) {
                if (arr[j] < 0) {
                    array[c] = arr[j];
                    c++;
                }
                array[c] = arr[j] - arr[key - j];
                j++;
                i++;
            }
        }
        return firstArray;
    }

    public static int slidingMaxSum(int arr[] , int k){
        int i = 0;
        int j = 0;
        int sum = 0 ;
        int ans = Integer.MIN_VALUE ;
        while (j<arr.length){
            sum += arr[j];
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                ans = Math.max(ans , sum);
                sum = sum- arr[i];
                i++;
                j++;
            }
        }
        return ans;
    }

    public static int slidingMinSum(int arr[] , int k){
        int i = 0;
        int j = 0;
        int sum = 0 ;
        int ans = Integer.MAX_VALUE ;
        while (j<arr.length){
            sum += arr[j];
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                ans = Math.min(ans , sum);
                sum = sum- arr[i];
                i++;
                j++;
            }
        }
        return ans;
    }
}





