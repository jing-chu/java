public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        while (x != 0) {
            int digitX = x % 10;
            int tempY = y;
            while (tempY != 0) {
                int digitY = tempY % 10;
                if (digitY == digitX) {
                    return true;
                }
                tempY /= 10;
            }
            x /= 10;
        }
        return false;
    }
}
