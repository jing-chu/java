public class FactorPrinter {
    public static void printFactors(int num) {
        if (num < 1) System.out.println("Invalid Value");
        int divisor = 1;
        while (divisor <= num) {
            if (num % divisor == 0) {
                System.out.println(divisor);
            }
            divisor ++;
        }
    }
}
