import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < 3; i++ ) {
            arr[i] = scanner.nextInt();
        }
        Scanner scanner2 = new Scanner(System.in);
        for (int i = 0; i < 3; i++ ) {
            arr2[i] = scanner2.nextInt();
        }
        System.out.println(Arrays.toString(merge(arr, arr2)));
    }

    public static int[] merge(int[] arr, int[] arr2) {
        int[] result = new int[arr.length + arr2.length];
        int indexA = 0, indexB = 0;
        for (int i = 0; i <result.length; i++){
            if (indexA < arr.length && indexB < arr2.length) {
                if (arr[indexA] <= arr2[indexB]) {
                    result[i] = arr[indexA];
                    indexA++;
                } else {
                    result[i] = arr2[indexB];
                    indexB++;
                }
            } else if (indexA >= arr.length) {
                result[i] = arr2[indexB];
                indexB++;

            } else {
                result[i] = arr[indexA];
                indexA++;
            }

        }
        return result;


    }

}

