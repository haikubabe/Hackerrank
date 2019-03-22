import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CavityMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().split("\\s+")[0]);
        String[] map = new String[n];
        for (int i = 0; i < n; i++) {
            map[i] = br.readLine();
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if ((map[i].charAt(j) > map[i].charAt(j - 1) && map[i].charAt(j) > map[i].charAt(j + 1)) &&
                        (map[i].charAt(j) > map[i - 1].charAt(j) && map[i].charAt(j) > map[i + 1].charAt(j))) {
                    map[i] = map[i].substring(0, j) + "X" + map[i].substring(j + 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(map[i]);
        }
    }
}
