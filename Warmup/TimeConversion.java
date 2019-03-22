import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(":");
        String hour = str[0];
        String minutes = str[1];
        String secondFormat = str[2];
        int hh = Integer.parseInt(hour);
        String seconds = secondFormat.substring(0,2);

        if (secondFormat.contains("AM") && (hh == 12)) {
            System.out.println("00:" + minutes + ":" + seconds);
        } else if(secondFormat.contains("PM") &&(hh<12)) {
            System.out.println((12+hh) + ":" + minutes + ":" + seconds);
        } else {
            System.out.println(hour + ":" + minutes + ":" + seconds);
        }
    }
}
