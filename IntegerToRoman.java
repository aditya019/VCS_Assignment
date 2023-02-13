import java.util.*;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = integerToRoman(n);
        System.out.println(n+ " in Roman from is = " + s);
    }
    static String integerToRoman(int n) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder(100);
        if(n == 0) {
            throw new IllegalArgumentException("0 cannot be converted to Roman Numeral");
        }
        if(n >= 1000) {
            int x = n / 1000;
            for (int i = 0; i < x; i++) {
                sb.append('M');
            }
            n = n % 1000;
        }
        if(n >= 900) {
            sb.append("CM");
            n = n - 900;
        }
        if(n >= 500) {
            sb.append('D');
            n = n - 500;
        }
        if(n >= 400) {
            sb.append("CD");
            n = n - 400;
        }
        if(n >= 100) {
            int x = n / 100;
            for(int i = 0; i < x; i++) {
                sb.append('C');
            }
            n = n % 100;
        }
        if(n >= 90) {
            sb.append("XC");
            n = n - 90;
        }
        if(n >= 50) {
            sb.append('L');
            n = n - 50;
        }
        if(n >= 40) {
            sb.append("XL");
            n = n - 40;
        }
        if(n >= 10) {
            int x = n / 10;
            for(int i = 0; i < x; i++) {
                sb.append('X');
            }
            n = n % 10;
        }
        if(n == 9) {
            sb.append("IX");
            n = 0;
        }
        if(n >= 5) {
            sb.append('V');
            n = n - 5;
        }
        if(n == 4) {
            sb.append("IV");
            n = 0;
        } else {
            for(int i = 0; i < n / 1; i++) {
                sb.append("I");
            }
        }
        return sb.toString();
    }
}
