public class PrimeNumber {

    boolean isPrime(int a) {
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
