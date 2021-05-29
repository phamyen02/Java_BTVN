import java.util.Scanner;
public class Buoi10Bai2 {
    void checkDuplicate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String s = sc.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            Boolean found = false;
            for (int j = 0; j < s1.length(); j++) {
                if (s.charAt(i) == s1.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                s1 = s1.concat(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println("Chuỗi sau khi bỏ các kí tự trùng nhau: "+s1);
    }

}
