import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BetweenTwoSets {

    private static long findGCD(long a, long b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a<b) {
            return findGCD(b%a, a);
        } else {
            return findGCD(b,a%b);
        }
    }

    private static long findLCM(long a, long b) {
        return (a*b)/findGCD(a,b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int[] a = new int[n];
        int[] b = new int[m];
        StringTokenizer st2 = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st2.nextToken());
        }
        StringTokenizer st3 = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<m;i++) {
            b[i] = Integer.parseInt(st3.nextToken());
        }
        long lcm=a[0];
        for (int i=1;i<n;i++) {
            lcm = findLCM(lcm, a[i]);
        }
        long gcd = b[0];
        for (int i=1;i<m;i++) {
            gcd = findGCD(gcd, b[i]);
        }
        int count=0, j=1;
        if (lcm>gcd) {
            System.out.println(count);
            return;
        }
        for (long i=lcm*j; i<=gcd; j++,i = lcm*j) {
            if (gcd%i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
