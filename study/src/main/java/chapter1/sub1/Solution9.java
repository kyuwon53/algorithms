package chapter1.sub1;

public class Solution9 {
    public static void main(String[] args) {
        int n = 8;
        String s = "";
        for (int i = n; i > 1; i /= 2) {
            s = (n % 2) + s;
        }
        s = "1" + s;
        System.out.println(s);
        System.out.println("toBinaryString(8) = " + toBinaryString(8));
    }

    public static String toBinaryString(int n) {
        if (n < 2) return String.valueOf(n);

        return toBinaryString(n / 2) + String.valueOf(n % 2);
    }
}
