import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        long n = scanner.nextLong();
        long count=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        count = (n/s.length())*count;
        for (int i=0;i<n%s.length();i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
