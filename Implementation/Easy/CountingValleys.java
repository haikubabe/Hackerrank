import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        String s = bufferedReader.readLine();
        char[] c = s.toCharArray();
        int noOfValleys = 0, currentLevel = 0;

        for (int i=0;i<n;i++) {
            if (c[i] == 'U') {
                currentLevel++;
            } else {
                currentLevel--;
            }
            if (currentLevel == 0 && c[i] == 'U') {
                noOfValleys++;
            }
        }
        System.out.println(noOfValleys);
    }
}
