package chapter1;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(result(num1, num2, num3));
    }
    public static String result(int num1, int num2, int num3){
        if(num1 == num2 && num2 == num3 ){
            return "equal";
        }
        return "not equal";
    }
}
