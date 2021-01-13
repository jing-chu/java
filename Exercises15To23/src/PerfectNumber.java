public class PerfectNumber {
    public static boolean isPerfectNumber (int num) {
        if (num < 1) {
            return false;
        }
        int divisor = 0;
        int sum = 0;
        while (divisor < num-1) {
            divisor ++;
            if (num % divisor == 0) {
                sum += divisor;
            }

        }
        return sum == num;
    }
}
