import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        
        System.out.println("Enter elements (0 or 1 only):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = 0, count = 0;

    
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0; 
            }
        }

        System.out.println("Maximum Consecutive Ones = " + maxCount);
    }
}
