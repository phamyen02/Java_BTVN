public class Main {
    public static void main(String[] args) {
        System.out.println("Bài tập tính diện tích, chu vi hình tròn + hình chữ nhật");
        Rectangle rec = new Rectangle();
        rec.chuvi();
        rec.dientich();
        Circle cir = new Circle();
        cir.chuViCircle();
        cir.dienTichCricle();
        System.out.println("\n");
        System.out.println("Bài tập in ra số ngày trong tháng");
        Month thang = new Month();
        thang.thang(100);
        thang.thang1(0);
        System.out.println("\n");
        System.out.println("Bài tập tính phương trình bậc 2");
        Quadratic qua = new Quadratic();
        qua.resolve(1, -8, 16);
        System.out.println("\n");
        System.out.println("Bài tập kiểm tra 3 cạnh là 3 cạnh tam giác");
        Triangle tri = new Triangle();
        tri.checkTriangle(-1, 2, -8);
        System.out.println("\n");
        System.out.println("Bài tập số nguyên tố");
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
        int i = 2;
        System.out.println("\n 10 số nguyên tố đầu tiên là: ");
        while (countPrime < b) {
            if (prime.isPrime(i)) {
                System.out.print( i+ "\t");
                countPrime++;
            }
            i++;
        }
    }
}
