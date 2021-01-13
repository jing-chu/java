public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        if (num1 < 0 && num2 < 0) {
            long roundedNum1 = (long)Math.ceil(num1 * 1000);
            long roundedNum2 = (long)Math.ceil(num2 * 1000);
            return roundedNum1 == roundedNum2;
        } else if (num1 >= 0 && num2 >= 0) {
            long roundedNum1 = (long)Math.floor(num1 * 1000);
            long roundedNum2 = (long)Math.floor(num2 * 1000);
            return roundedNum1 == roundedNum2;
        }
        return false;
    }
}
