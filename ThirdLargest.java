import java.util.*;

public class ThirdLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr); 
        if (n < 3) {
            System.out.println("Not enough elements.");
        } else {
            System.out.println("Third largest element: " + arr[n - 3]);
        }
    }
}
