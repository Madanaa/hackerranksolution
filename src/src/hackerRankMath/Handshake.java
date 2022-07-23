package hackerRankMath;

public class Handshake {

    // you can change method name
    static int shake(int n ) {
        if(n <= 1)
            return 0;
        if(n==2)
            return 1;
        return shake(n-1)+(n-1);
    }

    public static void main(String[] args) {
        System.out.println(shake(2));
    }
}
