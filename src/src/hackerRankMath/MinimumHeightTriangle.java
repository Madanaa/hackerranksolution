package hackerRankMath;

public class MinimumHeightTriangle {
    // Minimum Height Triangle hackerrank solution
    static int minimumheight(int base, int area) {
        int height = ((area *2 )+(base-1))/base;
        return height;
    }

    public static void main(String[] args) {
        System.out.println(minimumheight(4,6));
    }
}
