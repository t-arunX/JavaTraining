package java_basics.day6;

public class RandomNumberArray {
    public static void main(String[] args) {
        int i = 20, range = 1000;
        int temp = i + 1;
        int[] arr = new int[i + 1];
        int result = 0;
        while (i >= 0) {
            arr[i] = (int) (Math.random() * range);
            result += arr[i];
            --i;
        }
        result /= temp;
        System.out.println("average is: " + result);
        for (int j : arr) {
            if (j > result)
                System.out.println(j);
        }
    }
}
