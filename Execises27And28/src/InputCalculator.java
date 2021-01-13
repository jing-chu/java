import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int count = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int num = scanner.nextInt();
                sum += num;
                count ++;
                avg = Math.round((double)sum/count);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
