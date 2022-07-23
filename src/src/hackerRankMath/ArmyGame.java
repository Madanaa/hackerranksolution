package hackerRankMath;

import java.util.Scanner;

//army game hackerrank solution in java
//Method 1
public class ArmyGame {
//    static int gameCell(int n, int m) {
//        int result = (n/2 + n%2)*(m/2 + m%2);
//        return result;
//    }
// method 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = ((n+1)/2 *((m+1)/2));
        System.out.println(result);

    }

}
