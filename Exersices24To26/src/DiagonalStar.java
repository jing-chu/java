public class DiagonalStar {
    public static void printSquareStar (int num) {
        if (num < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int r=1; r<=num; r++) {
                if (r == 1 || r == num) {
                    for(int j=1; j<=num; j++) {
                        System.out.print("*");
                    }
                } else {
                    for(int j=1;j<=num;j++) {
                        if (j==1 || j == num || j == r || j == num-r+1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }

    }
}
