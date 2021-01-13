public class LargestPrime {
    public static int getLargestPrime (int num) {
        if (num <= 1) {
            return -1;
        }

        int i = 2;
        while(i < num) {
            if(num % i == 0) {
                num /= i;
                continue;
            }
            i++;
        }
        return i;
    }


}
