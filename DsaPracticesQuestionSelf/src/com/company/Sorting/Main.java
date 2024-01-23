package com.company.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,5,3,7,6,4};
        findFirstOccurence(arr,7);
//        quickSort(arr,0,arr.length-1);
//        printArray(arr);
//        System.out.println(Arrays.toString(partitionIndexReturnArray(arr,4)));
//        System.out.println(partationIndex(arr,4,0,arr.length-1));
//        System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        int a [] = {1,3,5,7};
//        int b [] = {2,4,6,8};
//       int result [] = mergeTwoSortedArray(a,b);
//        System.out.println(Arrays.toString(result));
//       printArray(result);
//        System.out.println(Arrays.toString(arr));
//        printArray(arr);
    }

    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j])
                    swap(arr,i,j);
            }
        }

    }
    public static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[minIndex])
                    minIndex = j;

            }
            swap(arr,i,minIndex);

        }
    }

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >=1 ; j--) {
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
            }

        }
    }

    // Merge Two Sorted Array
    public static int[] mergeTwoSortedArray(int a[] , int b[]){
        int ai = 0;
        int bi = 0;
        int result[] = new int[a.length+b.length];
        int k = 0;
        while (ai<a.length && bi<b.length){
            if(a[ai]<b[bi]){
                result[k] = a[ai];
                ai++;
                k++;
            }
            else {
                result[k] = b[bi];
                bi++;
                k++;
            }
        }
        while (ai<a.length){
            result[k] = a[ai];
            ai++;
            k++;

        }
        while (bi<b.length){
            result[k] = b[bi];
            bi++;
            k++;
        }
        return result;
    }

    public static int[] mergeSort(int arr[] , int left , int right){
        if(left==right){
            int c [] = new int[1];
            c[0] = arr[left];
            return c ;
        }
        int mid = (left+right)/2;
        int [] a = mergeSort(arr,left,mid);
        int [] b =   mergeSort(arr,mid+1,right);
        return mergeTwoSortedArray(a,b);
    }

    public static int partationIndex(int arr[] , int pivot, int left, int right){
        int i = left;
        int j = left;
        while (i<=right){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                i++;
                j++;
            }
            else
                i++;
        }
        return j-1;
    }

    public static void quickSort(int arr[] , int left , int right){
        if(left>=right) return;
        int pivot = arr[right];
        int pi = partationIndex(arr,pivot,left,right);
        quickSort(arr,left,pi-1);
        quickSort(arr,pi+1,right);
    }

    public static int[] partitionIndexReturnArray(int arr[] , int pivot){
        int left = 0;
        int right = arr.length-1;
        int result[] = new int[arr.length];
        int i = left;
        int j = left;
        int k = 0;
        while ((i<=right)){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                result[k] = arr[j];
                k++;
                i++;
                j++;
            }
            else
                i++;
        }
        return result;
    }

    public static void findFirstOccurence(int arr[] , int n){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == n)
                System.out.println(i);
        }
    }


    

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
