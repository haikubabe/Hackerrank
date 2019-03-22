import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeautifulDaysAtTheMovies {
    private static String reverse(int n) {
        String str="";
        while (n!=0) {
            str += n%10;
            n /= 10;
        }
        return str;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int beautifulDays = 0;
        for (int m=i;m<=j;m++) {
            int rev = Integer.parseInt(reverse(m));
            if (Math.abs(m-rev)%k == 0) {
                beautifulDays++;
            }
        }
        System.out.println(beautifulDays);
    }
}
