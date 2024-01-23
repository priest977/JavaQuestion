package com.company.LeetCodeCoderArmy.LeetCodeFirstSevenProblemCodeArmy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println(addNumberAndReturnSingleDigit(643));
    //    leapYear(1800);
     //   System.out.println(reverseInteger(234));
        System.out.println(squareRoot(8));
    }

    // 1. Find Sum of All Number and return number the Number Must be in  Single digit
    public static int addNumberAndReturnSingleDigit(int num) {
        while (num > 9) {
            int rem, ans = 0;
            while (num > 0) {
                // calculate remainder or retrive last number of integer
                rem = num % 10;
                // dived the number and make small
                num /= 10;
                ans = rem + ans;
            }
            num = ans;
        }
        return num;
    }

    public static void leapYear(int year){
        if(year % 400 == 0){
            System.out.println( year + " It is leap Year ");
        }
        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " It is leap year ");
        }
        else {
            System.out.println(year + " It is Not a Leap Year ");
        }
    }

    public static int reverseInteger(int num) {
        int rem, ans = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            // For Integer Overflow Case
            if (ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10)
                return 0;
            ans = ans * 10 + rem;
            }
            return ans;
        }

        public static int squareRoot(int num){
            int ans = 0 , swrt = 1;
            while (num > swrt){
                ans = swrt;
                swrt *= swrt;
                swrt++;
            }
            return ans;
        }
}

