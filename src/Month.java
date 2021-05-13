public class Month {
    void thang(int month) {

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Tháng " + month + " có 31 ngày");
        } else if (month == 2) {
            System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Tháng " + month + " có 30 ngày");
        }
        else{
            System.out.println("Tháng "+month+" không tồn tại");
        }
    }

    void thang1(int month1) {
        switch (month1) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month1 + " có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng " + month1 + " có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month1 + " có 30 ngày");
                break;
            default:
                System.out.println("Tháng " + month1+" không tồn tại");

        }
    }
}
