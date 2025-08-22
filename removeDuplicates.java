import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        String result = "";
        boolean[] seen = new boolean[256]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                result += ch;
                seen[ch] = true;
            }
        }

        System.out.println("String without duplicates: " + result);
    }
}
