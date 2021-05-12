public class Triangle {
    void checkTriangle(int a, int b, int c) {
        int d = a + b;
        int e = a + c;
        int f = b + c;
        if (d > c && e > b && f > a && a > 0 && b > 0 && c > 0) {
            System.out.println("3 số " + a + b + c + "là cạnh của tam giác");
        } else {
            System.out.println("3 số " + a + " " + b + " " + c + " " + " không phải là cạnh của tam giác");
        }
    }
}
