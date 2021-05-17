public class Fibonacci {
    //F0 = 0, F1 = 1, F2 = 1, F3 = 2

    int fibonacci(int n) {
        int f0 ;
        int f1 = 1;
        int fn = 1;
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 1 ; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }

        }
        return fn;
    }
}
