public class NumberToWords {
    public static void numberToWorlds(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        } else if (num == 0) {
            System.out.println("Zero");
        }
        int digitsOfNum = getDigitCount(num);
        num = reverse(num);
        int digitsOfReverse = getDigitCount(num);
        while (num > 0) {
            int lastDigit = num % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            num /= 10;
        }
        if(digitsOfNum != digitsOfReverse) {
            int numOfZero = digitsOfNum - digitsOfReverse;
            for (int i=0; i<numOfZero; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse (int num) {
        if (num < 0) {
            return -reverse(-num);
        }
        int digits = getDigitCount(num);
        int reverseDigit = 0;
        while (num > 0) {
            int newDigit = (num % 10) * (int) Math.pow(10, digits - 1);
            reverseDigit += newDigit;
            num /= 10;
            digits--;
        }
        return reverseDigit;

    }

    public static int getDigitCount (int num) {

        if (num < 0) {
            return -1;
        } else if (num == 0) {
            return 1;
        }
        int count = 1;
        while(num / 10 > 0) {
                count ++;
                num /= 10;
            }
        return count;
    }
}

