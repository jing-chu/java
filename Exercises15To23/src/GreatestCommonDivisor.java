public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10) return -1;
        int minNum = Math.min(num1, num2);
        int maxNum = Math.max(num1,num2);
        int result = 0;
        for (int i = 1; i <= minNum; i ++) {
            if (minNum % i ==0 && maxNum % i == 0) {
                    result = i;
                }
        }
        return result;
    }
}
