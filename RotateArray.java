import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter rotation steps k: ");
        int k = sc.nextInt();
        k = k % n;

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = arr[i];
        }

        System.out.print("Array after rotation: ");
        for (int num : res) System.out.print(num + " ");
    }
}
