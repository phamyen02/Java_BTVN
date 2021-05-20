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
    void printSecond(int[]array){
        int max =0;
        int max1 = Integer.MIN_VALUE;
        int max1Idx=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max1 = max;
                max = array[i];
            } else if (array[i] > max1)
                max1 = array[i];
            max1Idx = i;
        }
        System.out.println("Phần tử lớn thứ 2 trong mảng: " + max1);
        System.out.println("indexSecond: "+ max1Idx);
    }
}

