import java.util.Scanner;

public class AppendAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int k = sc.nextInt();

        if (s.length() + t.length() <= k) {
            System.out.println("Yes");
            return;
        }
        int i=0;
        for (;i<s.length() && i<t.length();i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
        }
        int minimumOperations = (s.length()-i) + (t.length()-i);
        boolean canTransform = (k>=minimumOperations) && (k-minimumOperations)%2==0;
        if (canTransform) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
