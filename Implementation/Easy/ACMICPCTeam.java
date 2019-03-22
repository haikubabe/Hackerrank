import java.util.Scanner;

public class ACMICPCTeam {
    private static int calculate(String s, String t, int n) {
        int sum=0;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        for (int i=0;i<n;i++) {
            if ((c1[i] == '1' && c2[i] == '1') || (c1[i] == '1' && c2[i] == '0') || (c1[i] == '0' && c2[i] == '1')) {
                sum += 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] s = new String[n];
        for (int i=0;i<n;i++) {
            s[i] = sc.next();
        }
        int max=0;
        int[] count = new int[m];
        for (int i=0;i<n-1;i++) {
            for (int j=i+1;j<n;j++) {
                int b = calculate(s[i],s[j],m);
                count[b-1]++;
                if (b>=max) {
                    max=b;
                }
            }
        }
        System.out.println(max);
        System.out.println(count[max-1]);
    }
}
