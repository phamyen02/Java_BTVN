public class PrimeNumber {

    //Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng for loop
    void printPrimeForLoop() {
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    //Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng while loop
    void printPrimeWhileLoop() {
        int i = 0;
        while (i < 100) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
            }
            i++;
        }
    }
    //Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng do while
    void printPrimeDoWhile(){
        int i=0;
        do {
            if (isPrime(i)){
                System.out.print(i +"\t");
            }
            i++;
        }
        while (i<100);
    }

    //In ra n số nguyên tố đầu tiên
    void printPrime(){
        int b =10;
        int countPrime = 0;
        int i = 2;

        while (countPrime < b) {
            if (isPrime(i)) {
                System.out.print( i+ "\t");
                countPrime++;
            }
            i++;
        }
    }


    //Phương thức để kiểm tra số nguyên tố
    static boolean isPrime(int a) {
        if (a < 2) {
            //  System.out.println(a + " Không là số nguyên tố");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}
