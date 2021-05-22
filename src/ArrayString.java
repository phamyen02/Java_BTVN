import java.util.Scanner;

public class ArrayString {
    void printMaxMin(int[] array) {
        int min = array[0];
        int minIdx = 0;
        int max = array[0];
        int maxIdx = 0;
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIdx = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIdx = i;
            }
        }

        System.out.println("Phần tử lớn nhất là: " + max);
        System.out.println("indexMax: " + maxIdx);
        System.out.println("phần tử nhỏ nhất là: " + min);
        System.out.println("indexMin: " + minIdx);

    }

    void printSecond(int[] array) {
        int max = 0;
        int max1 = Integer.MIN_VALUE;
        int max1Idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max1 = max;
                max = array[i];
            } else if (array[i] > max1)
                max1 = array[i];
            max1Idx = i;
        }
        System.out.println("Phần tử lớn thứ 2 trong mảng: " + max1);
        System.out.println("indexSecond: " + max1Idx);
    }

    void multiArray() {
        Scanner sc = new Scanner(System.in);
        int row = 0;
        int column = 0;
        System.out.print("Nhập số hàng: ");
        row = sc.nextInt();
        System.out.print("Nhập số cột: ");
        column = sc.nextInt();
        int[][] arr = new int[row][column];
        System.out.println("Số phần từ trong ma trận vuông là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("a[%d,%d]=", i, j);
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("Ma trận A = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("ĐƯờng chéo chính là: ");
        int sum = 0;
        int a = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                    a = arr[i][j];
                    sum = sum + a;
                }
            }
        }
        System.out.println("\n" + "tổng phần tử đường chéo: " + sum);
        System.out.println("Sắp xếp hàng 2 theo thứ tự tăng dần");
        int k;
        int m;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (k = j + 1; k < column; k++) {
                    if (arr[1][j] > arr[1][k]) {
                        m = arr[1][k];
                        arr[1][k] = arr[1][j];
                        arr[1][j] = m;
                    }
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiArray2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Các phần tử của mảng là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("số nguyên tố là: "); //how to loại bỏ các phần tử trùng trog mảng???
        for (int i = 0; i < n; i++) {
            if (PrimeNumber.isPrime(arr[i])) {
                System.out.println(arr[i] + "\t");
            }
        }
        System.out.print("tổng các số nguyên tố là: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (PrimeNumber.isPrime(arr[i])) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
        System.out.println("Nhập vị trí phần tử muốn sửa: ");
        int k = sc.nextInt();
        System.out.println("Nhap X:");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[k]){
                arr[i]=x;
            }
        }
        System.out.print("Dãy sau khi thay đổi: ");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}

