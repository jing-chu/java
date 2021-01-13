public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int firstD = 0;
        int lastD = 0;
        int sum = 0;
        lastD = number % 10;
        while (number != 0) {
            firstD = number % 10;
            number = number /10;

        }
        sum = firstD + lastD;
        return sum;
    }
}
