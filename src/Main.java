public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.chuvi();
        rec.dientich();
        Circle cir = new Circle();
        cir.chuViCircle();
        cir.dienTichCricle();

        Month thang = new Month();
        thang.thang(100);
        thang.thang1(0);

        Quadratic qua = new Quadratic();
        qua.resolve(1, -8, 16);

        Triangle tri = new Triangle();
        tri.checkTriangle(-1, 2, -8);

        PrimeNumber prime = new PrimeNumber();
        if (prime.isPrime(9)) {
            System.out.println("Là số nguyên tố");
        } else {
            System.out.println("Không phải số nguyên tố");
        }
        System.out.println("Các số nguyên tố từ 100 là: ");
        for (int i = 0; i <= 100; i++) {
            if (prime.isPrime(i)) {
                System.out.print(i + "\t");
            }
        }
        int b =10;
        int countPrime = 0;
        int i = 0;
        System.out.println( b +"\n số nguyên tố đầu tiên là: ");
        while (countPrime < b) {
            if (prime.isPrime(i)) {
                System.out.print( i+ "\t");
                countPrime++;
            }
            i++;
        }
    }
}
