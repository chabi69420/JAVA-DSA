import java.util.*;

public class stockProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int prices[] = new int[n];

        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();

        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        System.out.println("Max Profit = " + maxProfit);
    }
}
