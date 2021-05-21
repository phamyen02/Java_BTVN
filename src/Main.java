import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Java_BT_lession4 les = new Java_BT_lession4();
        ArrayString ar = new ArrayString();
        PrimeNumber prime = new PrimeNumber();
        while (true) {
            menu();
            int choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Bài tập tính diện tích, chu vi hình tròn + hình chữ nhật");
                    Rectangle rec = new Rectangle();
                    rec.chuvi();
                    rec.dientich();
                    Circle cir = new Circle();
                    cir.chuViCircle();
                    cir.dienTichCricle();
                    break;
                case 2:
                    System.out.println("Bài tập in ra số ngày trong tháng");
                    Month thang = new Month();
                    thang.thang(100);
                    thang.thang1(0);
                    break;
                case 3:
                    System.out.println("Bài tập tính phương trình bậc 2");
                    Quadratic qua = new Quadratic();
                    qua.resolve(1, -8, 16);
                case 4:
                    System.out.println("Bài tập kiểm tra 3 cạnh là 3 cạnh tam giác");
                    Triangle tri = new Triangle();
                    tri.checkTriangle(2, 2, 2);
                    break;
                case 5:
                    System.out.println("Bài tập số nguyên tố");

                    if (prime.isPrime(9)) {
                        System.out.println("Là số nguyên tố");
                    } else {
                        System.out.println("Không phải số nguyên tố");
                    }
                    System.out.println("Các số nguyên tố từ 100 theo vòng lặp for là: ");
                    prime.printPrimeForLoop();
                    System.out.println("\n");
                    System.out.println("Các số nguyên tố từ 100 theo vòng lặp while là: ");
                    prime.printPrimeWhileLoop();
                    System.out.println("\n");
                    System.out.println("Các số nguyên tố từ 100 theo vòng lặp do- while là: ");
                    prime.printPrimeDoWhile();
                    System.out.println("\n");
                    System.out.println("\n 10 số nguyên tố đầu tiên là: ");
                    prime.printPrime();
                    break;
                case 6:
                    System.out.println("Bài tập fibonacci");
                    int n;

                    System.out.println("Số các số fibonacci muốn hiển thị là: ");
                    n = scanner.nextInt();
                    Fibonacci fibo = new Fibonacci();
                    for (int e = 0; e < n; e++) {
                        System.out.print(fibo.fibonacci(e) + "\t");
                    }
                    System.out.println("\n");
                    System.out.println("Bạn muốn lấy ra bao nhiêu số fibonacci đầu tiên: ");
                    int m;
                    m = scanner.nextInt();
                    System.out.println(m + " số đầu tiên của dãy số fibonacci: ");
                    for (int i = 0; i < m; i++) {
                        System.out.print(fibo.fibonacci(i) + "\t");
                    }
                case 7:
                    System.out.print("nhập số cần tính giai thừa: ");
                    int f;
                    f = scanner.nextInt();
                    les.factorial(f);
                case 8:
                    Random rand = new Random();
                    int x = rand.nextInt(10) + 1; // nextInt random từ 1 -> 10, số k âm
                    System.out.println("Số random là: " + x);
                    if (PrimeNumber.isPrime(x)) {
                        System.out.println(x + " là số nguyên tố");
                    } else {
                        System.out.println(x + " không phải số nguyên tố");
                    }
                    les.factorial(x);
                    break;
                case 9:
                    les.printString();
                    break;
                case 10:
                    System.out.println("Nhập số: ");
                    int a;
                    a = scanner.nextInt();
                    les.multiplication(a);
                    break;
                case 11:
                    les.countWord("What  is your name");
                    break;
                case 12:
                    System.out.println("Nhập số phần tử trong mảng: ");
                    n = scanner.nextInt();
                    int[] array = new int[n];
                    System.out.println("Nhập các phần tử của mảng: ");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("a[%d] =", i);
                        array[i] = scanner.nextInt();
                    }
                    ar.printMaxMin(array);
                    ar.printSecond(array);
                    break;
                case 13:
                    //ar.multiArray();
                    ar.multiArray2();
                    break;

            }

        }

    }

    static void menu() {
        System.out.println("\nNhập lựa chọn: ");
        System.out.println("1 - Bài tập tính diện tích, chu vi hình tròn + hình chữ nhật");
        System.out.println("2 - Bài tập in ra số ngày trong tháng");
        System.out.println("3 - Bài tập tính phương trình bậc 2");
        System.out.println("4 - kiểm tra 3 cạnh đó có là tam giác, tam giác vuông, tam giác cân,\n" +
                "tam giác đều");
        System.out.println("5 - Bài tập số nguyên tố");
        System.out.println("6 - Bài tập số Fibonacci");
        System.out.println("7 - Bài tập giai thừa");
        System.out.println("8 - Bài tập số random");
        System.out.println("9 - Bài tập lấy index của chữ cái trong chuỗi");
        System.out.println("10 - Bài tập in ra bảng cửu chương");
        System.out.println("11 - Bài tập đếm số từ");
        System.out.println("12 - Bài tập tạo mảng số nguyên");
        System.out.println("13 - Bài tập mảng đa chiều + 1 chiều");
        System.out.println("0 - Thoát chương trình");
        System.out.print("Lựa chọn của bạn là: ");
    }
}