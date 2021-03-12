package thirty_days_of_code;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Day08 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneNumber = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneNumber.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (phoneNumber.get(s) == null)
                System.out.println("Not found");
            else {
                System.out.println(s + "=" + phoneNumber.get(s));
            }

        }
        in.close();
    }
}
