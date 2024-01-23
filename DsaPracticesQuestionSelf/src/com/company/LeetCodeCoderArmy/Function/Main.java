package com.company.LeetCodeCoderArmy.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println(primeNumber(3));
        System.out.println(factorial(1));
    }

    public static boolean primeNumber(int num){
       // Prime Number is not less than 2 0 and 1 are not a prime number
        if (num < 2 )
            return false;
        // we will the number if it is divisible by between any number so it is not a prime number
        // eg if number are 7 so we will check all the number between 2 to 6 if any number between two 2 to 6 is divisible by that number than return the number is not a prime number
        for (int i = 2; i <num ; i++) {
            if(num % i == 0)
                return false;
        }
        // if the number is not divisible by any between number so it is prime number
        return true;
    }

    public static int factorial(int num){
        int ans = 1;
        for (int i = 1; i <=num ; i++) {
           ans = ans*i;
        }
        return ans;
    }
}
