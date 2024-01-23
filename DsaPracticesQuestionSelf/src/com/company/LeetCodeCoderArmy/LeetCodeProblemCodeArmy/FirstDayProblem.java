package com.company.LeetCodeCoderArmy.LeetCodeProblemCodeArmy;

public class FirstDayProblem {
    public static void main(String[] args) {
//        char ans = convertLowerToUpperCharacter('z');
//        System.out.println(ans);
     //   System.out.println(countDigit(1536));
     //   System.out.println(amrStrongNumber(153));
     //   System.out.println(trailingZeroInFactorial(10));
        System.out.println(totalBishopMove(4,4));
    }

    public static char convertLowerToUpperCharacter(char chr){
        char upperChar =(char) (chr + 'A' - 'a');
        return  upperChar;
    }

    public static int countDigit(int num){
        int counter = 0 ;
        while (num > 0){
            counter++;
           num /= 10;
        }
        return counter;
    }

//    public static boolean amrStrongNumber(int num, int digit){
    // That is also Correct Code
//       int ans = num , rem = 0;
//       double sum = 0;
//       while (ans > 0){
//           rem = ans % 10;
//           ans /= 10;
//           sum += Math.pow(rem,digit);
//       }
//       if(sum == num)
//           return true;
//       else
//           return false;
//    }

    public static boolean amrStrongNumber(int num){
        // That is also Correct Code
        int count = countDigit(num);
        int ans = num , rem = 0;
        double sum = 0;
        while (ans > 0){
            rem = ans % 10;
            ans /= 10;
            sum += Math.pow(rem,count);
        }
        if(sum == num)
            return true;
        else
            return false;
    }

    public static int trailingZeroInFactorial(int num){

        // Code Army Solution
        // Hmko factorial count nahi krna hai bs zero ko count krna hai
        // eg
        int count = 0;
        while (num >= 5){
            count = count+num/5;
            num = num /5;
        }
        return count;


        // Apna solution
//        int ans = 1;
//        for (int i = 1; i <=num ; i++) {
//            ans = ans *i;
//        }
//        int count = 0;
//        while(ans > 0) {
//            ans = ans % 10;
//            if (ans == 0) {;
//                count++;
//            }
//            ans /= 10;
////        if(ans % 10==0){
////            return 1;
////        }
////        else {
////            return 0;
////        }
//        }
//        return count;
    }

    public static int totalBishopMove(int a , int b){
        // Chess are 8 row and 8 col so Bishop(Camel) are not move beyond 8 row and 8 col;
        // And Bishop are Moves Diognally in chess board 
        int count = 0;
        count += Math.min(8-a,8-b);
        count += Math.min(a-1,8-b);
        count += Math.min(8-a,b-1);
        count += Math.min(a-1,b-1);
        return count;
    }
}
