package com.company.BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Nafish Khan");
//        int arr [] = {2,4,9,1,0,3};
//        System.out.println(linearSearch(arr,0));
//        int arr[] = {1,2,3,4,8,10,10,30};
//        System.out.println(binarySearch(arr,4,0,arr.length-1));
//        System.out.println(binarySearchRecursively(arr,2,0,arr.length-1));
//        System.out.println(descendingSortedArray(arr,3));
//        firstElementInSortedArray(arr,10);


//        System.out.println(firstoccurenceInSortedArray(arr,10));
//        System.out.println(lastOccurencesInSortedArray(arr,10));
//        int arr1[] = {11, 12, 15, 18, 2, 5, 6, 8};
//        System.out.println(noOfRotationInSortedArray(arr1));
//        System.out.println(numberOfElementInRepeated(arr));
//        System.out.println(searchElementInNearlySortedArray(arr,40));
//        System.out.println(floorOfSortedArray(arr,5));
//        System.out.println(cellingofSortedArray(arr,5));
//        char [] arr = {'a','b','c','d','e','f','g'};
//        char next  =  findNextElementInSortedCharArray(arr,'c');
//        System.out.println(next);
//
//        char prev = findPreviousElementInSortedCharArray(arr,'c');
//        System.out.println(prev);

//        int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12};
//        System.out.println(findElementInInfiniteSortedArray(arr,7));
////        System.out.println(findSmallerLetterGreaterThanKey(arr,'h'));
//
//        int arr[] = {4,5,1,2,3};
//        System.out.println(serarchRotatedSortedArray(arr,6));
//
//        int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1};
//        System.out.println(searchElementInBinaryInfiniteSortedArray(arr,1));

//        int arr[] = {10,20,15,2,23,90,67};
//        System.out.println(binarySearchOnAnswers(arr));

        int arr[] = {0,1,2,0};
        System.out.println(peakIndexInMountainArrayBruteForce(arr));


    }

    // LeetCode peakIndexInMountainArray
    // Brute Force
    public static int peakIndexInMountainArrayBruteForce(int arr[]){
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[minIndex] && arr[i]>arr[i+1]){
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static int linearSearch(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int arr[], int n, int l, int r) {
//        int l = 0;
//        int r = arr.length-1;
        while ((l <= r)) {
            int mid = (l + r) / 2;
            if (arr[mid] == n) return mid;
            else if (arr[mid] < n) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static int binarySearchRecursively(int arr[], int n, int l, int r) {
        if (l > r) return -1;
        int mid = (l + r) / 2;
        if (arr[mid] == n) return mid;
        else if (arr[mid] < n)
            return binarySearchRecursively(arr, n, mid + 1, r);
        else return binarySearchRecursively(arr, n, l, mid - 1);
    }

    public static int descendingSortedArray(int arr[], int n) {
        int l = 0;
        int r = arr.length - 1;
        while ((l <= r)) {
            int mid = (l + r) / 2;
            if (arr[mid] == n)
                return mid;
            else if (arr[mid] > n)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    // First and last occurence of the element
    // int arr[] = {2,4,10,10,10,18,20};
    public static void firstElementInSortedArray(int arr[], int n) {
        int l = 0;
        int r = arr.length - 1;
        int f1 = 0;
        int f2 = 0;
        while (true) {
            if (arr[l] == n) {
                System.out.println("First occurences : " + l);
                f1 = 1;
            } else {
                l++;
            }
            if (arr[r] == n) {
                f2 = 1;
                System.out.println("Last Occurences : " + r);
            } else {
                r--;
            }
            if (f1 == 1 && f2 == 1) {
                break;
            }
        }
    }

    public static int firstoccurenceInSortedArray(int arr[], int n) {
        int l = 0;
        int r = arr.length - 1;
        int res = -1;
        while (l <= r) {
            int mid = l + r - l / 2;
            if (arr[mid] == n) {
                res = mid;
                r = mid - 1;
            } else if (arr[mid] < n) l = mid + 1;
            else r = mid - 1;

        }
        return res;
    }

    public static int lastOccurencesInSortedArray(int arr[], int n) {
        int l = 0;
        int r = arr.length - 1;
        int res = -1;
        while ((l<=r)) {
            int mid = (l + r) / 2;
            if (arr[mid] == n) {
                res = mid;
                l = mid + 1;
            } else if (arr[mid] > n)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return res;
    }

    public static int numberOfElementInRepeated(int arr[]){
        int first = firstoccurenceInSortedArray(arr,10);
        int last = lastOccurencesInSortedArray(arr,10);
        return (last-first+1);
    }

    public static int noOfRotationInRotatedSortedArray(int arr[]) {
        int l = 0;
        int r = arr.length - 1;
        int n = arr.length;
        while (l <= r) {
            int mid = l + (r-l) / 2;
            int pre = (mid - 1) % n;
            int next = (mid + 1) % n;
            if (arr[mid] < arr[pre] && arr[mid] < arr[next])
                return mid;
            else if (arr[mid] > arr[r]) l = mid + 1;
            else  r = mid-1;
        }
        return -1;
    }

   public static int searchElementInNearlySortedArray(int arr[], int n){
        int l = 0;
        int r = arr.length-1;
        while (l<=r){
            int mid = l +(r-l)/2;
            if(arr[mid]==n)
                return mid;
            else if (mid-1<=r && arr[mid]==mid-1)
                return mid-1;
            else if( mid+1>=l && arr[mid]==mid+1)
                return mid+1;
            else if(arr[mid]<n) l = mid+2;
            else r = mid-2;
        }
        return -1;
   }

   public static int floorOfSortedArray(int arr[], int n){
        int l = 0;
        int r = arr.length-1;
        int res = -1;
        while (l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid]==n) return mid;
            else if(arr[mid]<n){
                res = mid;
                l = mid+1;
            }else
                r = mid-1;
        }
        return res;
   }
   public static int cellingofSortedArray(int arr[], int n){
        int l = 0;
        int r = arr.length-1;
        int res = -1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==n) return mid;
            else if(arr[mid]>n){
                res = mid;
                r = mid-1;
            }else
                l = mid+1;
        }
        return res;
   }
   public static char findNextElementInSortedCharArray(char [] chars, char n){
        int l = 0;
        int r = chars.length-1;
        char res = '#';
        while (l<=r){
            int mid = l + (r-l)/2;
            if(chars[mid]==n) {
                res = chars[mid + 1];
                return res;
            }
            else if(chars[mid]<n) l = mid+1;
            else r = mid-1;
        }
        return ' ';
   }
    public static char findPreviousElementInSortedCharArray(char [] chars, char n){
        int l = 0;
        int r = chars.length-1;
        char res = '#';
        while (l<=r){
            int mid = l + (r-l)/2;
            if(chars[mid]==n) {
                res = chars[mid - 1];
                return res;
            }
            else if(chars[mid]<n) l = mid+1;
            else r = mid-1;
        }
        return ' ';
    }

    public static int findElementInInfiniteSortedArray(int arr[], int n){
        int l = 0;
        int r = l+1;
        while ((l<=r)){
            if(arr[r]!=n){
                l = r;
                r = (r*2);
            }
            int mid = l +(r-l)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]<n) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }

    public static char findSmallerLetterGreaterThanKey(char [] chars, char n){
        int l = 0;
        int r = chars.length-1;
        char res = ' ';
        char res1 = ' ';
        while ((l<=r)){
            int mid = l +(r-l)/2;
            if(chars[mid]==n) {
                res = chars[mid + 1];
                return res;
            }
            else if(chars[mid]!=n && chars[mid]>n){
                res1 = chars[mid];
                r = mid-1;
            }
            else l = mid+1;
        }
        return res1;
    }
    public static int serarchRotatedSortedArray(int arr[], int n){
        int l = 0;
        int r = arr.length-1;
        while (l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid]==n) return mid;
            else if(arr[mid]<n) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
    public static int searchElementInBinaryInfiniteSortedArray(int arr[], int n){
        int l = 0;
        int r = l+1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==n) return mid;
            else if(arr[mid]<n){
                l = mid+1;
                r= mid+2;
            }
            else r= mid-1;
        }
        return -1;
    }

    public static int binarySearchOnAnswers(int arr[]){
        int l = 0;
        int r = arr.length-1;
        while ((l<=r)){
            int mid = l + (r-l)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid]>arr[mid-1]) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }




}
