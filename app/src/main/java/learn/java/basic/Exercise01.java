package learn.java.basic;

public class Exercise01 {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0) {
            return a;
        }

        if (b == 0) {
            return b;
        }

        int init = Math.max(a, b);
        while (init % a != 0 || init % b != 0) {
            init++;
        }

        return init;
    }
}
