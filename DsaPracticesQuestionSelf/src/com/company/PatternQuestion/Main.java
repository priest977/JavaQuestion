package com.company.PatternQuestion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
 //      printRectangle(3,5);
//       printHollowRectangle(3,5);
//        halfPyramid(5);
//        invertedHalfPyramid(5);
//        hollowInvertedHalfPyramid(3,5);
//      int arr[] =   {2,7,11,15};
 //       System.out.println(returnAddIndex(arr,9));

//        int arr[] = new int[5];
//        Arrays.fill(arr,42);
//        for(int res : arr){
//            System.out.println(res);
//        }
//       int arr[] = {7,5,3,1,6,4};
//        System.out.println(bestTimeByeAndSellStock(arr));

//        int arr[] = {1,2,3,4,5};
//        System.out.println(sumofFirst(arr));
////        printNumberRowAndCol(5,5);
//        int arr[] = {0,5,2,10};
//        System.out.println(binary(arr));

//        printIncreasingAlphaBate(5,5);
//        System.out.println("*******************************************");
//        printIncreasingAlpha(5,5);
//        System.out.println("*********************************");
//        printIncreasingNumberPattern(5,5);
//          printNumberInDecresingOrder(5);
//        printStarDecresingOrder(5);
//        printDecresingNumberInPyamid(5);
//        printNumber(5,5);
//        int arr[] = {0,1,0,3,12};
//        movesZero(arr);
////        printArray(arr);
//        System.out.println(Arrays.toString(arr));
//        printPattenRightSideWithSpaces(5,5);
//        printRightShiftNumber(5);
        printPatternWithRightShiftIncreasingOrder(5);
        printAlphaBateIncreasingOrderPattern(5);

    }
    // Hard Pattern Problem
//            A
//          A B
//        A B C
//      A B C D
//    A B C D E
    public static void printAlphaBateIncreasingOrderPattern(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <row-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                char res =(char) ('A' + j-1);
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }

//                     1
//                   1 2
//                 1 2 3
//               1 2 3 4
//             1 2 3 4 5
    public static void printPatternWithRightShiftIncreasingOrder(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=row-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Print
//            1
//           2 2
//         3 3 3
//        4 4 4 4
//     5 5 5 5 5

    public static void printRightShiftNumber(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=row-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


//            *
//          * *
//        * * *
//      * * * *
//    * * * * *

    public static void printPattenRightSideWithSpaces(int row, int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=row-i ; j++) {
                System.out.print("  " );
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

//    print
//    1
//    2 2
//    3 3 3
//    4 4 4 4
//    5 5 5 5 5

    public static void printNumber(int row , int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
//            1
//            2 1
//            3 2 1
//            4 3 2 1
//            5 4 3 2 1

    public static void printNumberInDecresingOrder(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(j-1 + " ");
            }
            System.out.println();
        }
    }

    public static void printStarDecresingOrder(int row ){
        for (int i = row; i >=1 ; i--) {
            for (int j = 1; j <=row ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void printDecresingNumberInPyamid(int row){
        for (int i = 0; i <= row ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print(j-i + " ");
            }
            System.out.println();
        }
    }

    // Print
//    a a a a a
//    b b b b b
//    c c c c c
//    d d d d d
//    e e e e e

    public static void printIncreasingAlphaBate(int row , int col){
        for (int i = 1; i <=row ; i++) {
            char res = (char) ('a' + i-1);
            for (int j = 1; j <=col ; j++) {
                System.out.print(res  + " ");
            }
            System.out.println();
        }
    }

//    print pattern
//            a b c d e
//            a b c d e
//            a b c d e

    public static void printIncreasingAlpha(int row , int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                char res = (char) ('a' + j-1);
                System.out.print(res  + " ");
            }
            System.out.println();
        }
    }

//    // Pattern
//    1 2 3 4 5
//    6 7 8 9 10
//    11 12 13 14 15
//    16 17 18 19 20

    public static void printIncreasingNumberPattern(int row , int col){
        int count = 1;
        for(int i = 1 ; i<=row ; i++){
            for(int j  = 1 ; j<=col ; j++){
                System.out.print(count + " ");
                count = count+1;
            }
            System.out.println();
        }
    }
    //  1.Rectangle Pattern Programs
//       * * * * *
//       * * * * *
//       * * * * *

    public static void printRectangle(int row, int col ){
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=col; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

//    2. Hollow Rectangle
//            * * * * *
//            *       *
//            *       *
//            * * * * *

    public static void printHollowRectangle(int row , int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col; j++) {
                if(i==1 || i ==row  || j ==1 || j==col){
                    System.out.print("*" + " ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//    3.Half Pyramid
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *

    public static void halfPyramid(int row ){
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <i+1 ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

//    4.InverTed Half Pyramid
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *

    public static void invertedHalfPyramid(int row){
        for (int i = row; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

//    5.Hollow Inverted Half Pyramid
//            * * * * *
//            *     *
//            *   *
//            * *
//            *

    public static void hollowInvertedHalfPyramid(int row, int col){
        for (int i = row; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                if(j==1 || j==col || i ==1 || i ==row){
                    System.out.print("*" + " ");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    //    [2,7,11,15], target = 9
//    return index which is equal to target

    public static int[] returnAddIndex(int arr[], int target){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return  new int[]{ };
    }

    public static void movesZero(int arr[]){
        for (int i = 0 ; i<arr.length-1 ; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length ; j++){
                if(arr[minIndex] == 0)
                    minIndex = j;
            }
            swap(arr,i,minIndex);
        }
    }

    public static void swap(int arr[] , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static int bestTimeByeAndSellStock(int arr[]){
//        int minNumber = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]<minNumber)
//                minNumber = arr[i];
//        }
// //       return minNumber;
//        for (int i = minNumber; i < arr.length; i++) {
//
//
//        }

        int minvalue = Integer.MAX_VALUE;
        int calProfite = 0;
        int maxProfite = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<minvalue) {
                minvalue = arr[i];
            }
            calProfite = arr[i]-minvalue;
            if(calProfite>maxProfite)
                maxProfite = calProfite;

        }
        return maxProfite;

    }

    public static int sumofFirst(int arr[]){
        int sum = 0;
        for (int i = 0 ; i<arr.length;i++){
            sum = sum +arr[i];
        }
        return sum;
    }

    // print pattern
//     1 1 1 1 1
//     2 2 2 2 2
//     3 3 3 3 3
//     4 4 4 4 4
//     5 5 5 5 5

    public static void printNumberRowAndCol(int row , int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                if(i==i){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static int binary(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int mid = (left+right)/2;
            if(arr[mid]>arr[mid+1]){
                right = mid;
            }else
                left = mid+1;
        }
        return left;
    }

}
