package com.company.LeetCodeCoderArmy.BinaryForm;

public class Main {
    public static void main(String[] args) {
        decimalToBinary(13);
        binaryToDecimal(1101);
    }

    public static void decimalToBinary(int num){
        int rem , ans = 0;
        int mul = 1;
        while (num > 0){
            rem = num % 2;
            num = num / 2;
            ans = rem * mul + ans;
            mul = mul *10;
        }
        System.out.println(ans);
    }

    public static void binaryToDecimal(int num){
        int rem , ans = 0 , mul = 1;
        while (num > 0){
            rem = num % 10;
            num /= 10;
            ans += rem * mul;
            mul *= 2;
        }
        System.out.println(ans);
    }
}
