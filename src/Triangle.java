public class Triangle {
    void checkTriangle(int a, int b, int c) {
        int d = a + b;
        int e = a + c;
        int f = b + c;
        if (d > c && e > b && f > a && a > 0 && b > 0 && c > 0) {
            if ( a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b)
            {
                System.out.println("\n 3 so ban vua nhap la do dai 3 canh cua 1 tam giac vuong");
            }
            else
            {
                if( a==b && b==c)
                {
                    System.out.println("\n 3 so ban vua nhap la do dai 3 canh cua 1 tam giac deu");
                }
                else
                {
                    if(a*a > b*b + c*c || b*b > a*a + c*c || c*c > a*a + b*b)
                    {
                        System.out.println("\n 3 so ban vua nhap la do dai 3 canh cua 1 tam giac tu");
                    }
                    else
                    {
                        System.out.println("\n 3 so ban vua nhap la do dai 3 canh cua 1 tam giac nhon");
                    }
                }
            }
            }

        else {
            System.out.println("3 số " + a + " " + b + " " + c + " " + " không phải là 3 cạnh của tam giác");
        }
    }
}
