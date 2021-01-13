public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || (!isValid(num2)) || (!isValid(num3))) {
            return false;
        }
        int last1 = num1 % 10;
        int last2 = num2 % 10;
        int last3 = num3 % 10;
        return (last1 == last2) || (last1 == last3) || (last2 == last3);
    }

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }

}
