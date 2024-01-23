package com.company.PatternQuestion;

public class HardPatternProblem {
    public static void main(String[] args) {
 //       printPatternPyramidQuestionOne(5);
  //      printPatternPyramidQuestionTwo(5);
        printPatternPyramidQuestionThree(5);
    }
    // 1.  *************************************************************************************

//                  *
//                 * * *
//                * * * * *
//               * * * * * * *
//              * * * * * * * * *

    public static void printPatternPyramidQuestionOne(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=row-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // 2.  *************************************************************************************

//                 1
//                1 2 1
//               1 2 3 2 1
//              1 2 3 4 3 2 1
//             1 2 3 4 5 4 3 2 1

    public static void printPatternPyramidQuestionTwo(int row){
        for (int i = 1; i <=row ; i++) {
            for (int j = i; j <=row-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

// 3. *************************************************************************************

//            * * * * * * * * *
//            * * * * * * *
//            * * * * *
//            * * *
//            *

    public static void  printPatternPyramidQuestionThree(int row){
        int count = row;
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=2*count-1 ; j++) {
                System.out.print("*" + " ");
            }
            count--;
            for (int j = i; j >=i ; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 4. *************************************************************************************
    
}
