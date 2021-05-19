import java.sql.SQLOutput;
//https://github.com/TechMaster/JavaCore/tree/main/09Exercises

public class Java_BT_lession4 {
    void factorial(int f) {
        int fact = 1;
        for (int i = 1; i <= f; i++) {
            fact = fact * i;
        }
        System.out.println("Giai thừa là: " + fact);
    }

    void printString() {
        String quota = "You only live once, but if you do it right, once is enough";
        int count = 0;
        for (int i = 1; i < quota.length(); i++) {
            if (quota.charAt(i) == 'o') {
                System.out.println(i);
                count = count + 1;
            }
//            if (quota.substring(i,i+1).equals("o")){
//                System.out.println("Vị trí của tất cả các chữ o là: "+quota.indexOf("o",i));
//            }
        }
        System.out.println("số lần xuất hiện chữ o là: " + count);
    }

    void multiplication(int a) {
        for (int i = 1; i < 10; i++) {
            int mul = a * i;
            System.out.println(a + "*" + i + "=" + mul);
        }

    }

    void countWord(String input) {
        if(input == null){
            return ;
        }
        int count = 1;
        System.out.println(input);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Số từ trong chuỗi là: " + count);

    }
}