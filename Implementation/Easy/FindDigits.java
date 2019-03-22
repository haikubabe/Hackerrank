import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t>0) {
            int n = scanner.nextInt();
            int temp = n;
            int count=0;
            while (n!=0) {
                int rem= n%10;
                if (rem !=0 && temp%rem == 0) {
                    count++;
                }
                n/=10;
            }
            System.out.println(count);
            t--;
        }
    }
}
