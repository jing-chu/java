public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int paraNum = number;
        while (number != 0) {
           int lastDigit = number % 10;
           reverse += lastDigit;
           reverse *= 10;
           number = number / 10;
        }
        reverse /= 10;
        return reverse == paraNum;
    }
}
