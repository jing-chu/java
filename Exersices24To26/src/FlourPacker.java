public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        for (int i = 0; i <= bigCount; i ++) {
            int bigKilo = i * 5;
            if (bigKilo > goal) {
                return false;
            } else if (bigKilo == goal) {
                return true;
            }
            for (int j=0; j<=smallCount; j++) {
                int sum = bigKilo;
                sum += j;
                if(sum == goal) {
                    return true;
                }
            }
        }
        return false;
    }
}
