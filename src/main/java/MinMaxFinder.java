import java.util.Arrays;
import java.util.Scanner;

public class MinMaxFinder {
//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int [] newArrforMin = Arrays.copyOfRange(arr, 0, arr.length-1);
        int [] newArrforMax = Arrays.copyOfRange(arr, 1, arr.length);

        long minSum = Arrays.stream(Arrays.stream(newArrforMin).mapToLong(i->i).toArray()).reduce(0L, (x,y)->x+y);
        long maxSum = Arrays.stream(Arrays.stream(newArrforMax).mapToLong(i->i).toArray()).reduce(0L, (x,y)->x+y);
        System.out.print(minSum + " " + maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}


