package problem_solving.warmup;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class _10_TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        /*
         * Write your code here.
         */
        String militaryTime = "";
        String temp = "";

        if (s.endsWith("PM")) {
            // militaryTime = "PM";
            temp = s.substring(0, 2);
            switch (temp) {
            case "01":
                militaryTime = "13" + s.substring(2, 8);
                break;
            case "02":
                militaryTime = "14" + s.substring(2, 8);
                break;
            case "03":
                militaryTime = "15" + s.substring(2, 8);
                break;
            case "04":
                militaryTime = "16" + s.substring(2, 8);
                break;
            case "05":
                militaryTime = "17" + s.substring(2, 8);
                break;
            case "06":
                militaryTime = "18" + s.substring(2, 8);
                break;
            case "07":
                militaryTime = "19" + s.substring(2, 8);
                break;
            case "08":
                militaryTime = "20" + s.substring(2, 8);
                break;
            case "09":
                militaryTime = "21" + s.substring(2, 8);
                break;
            case "10":
                militaryTime = "22" + s.substring(2, 8);
                break;
            case "11":
                militaryTime = "23" + s.substring(2, 8);
                break;
            case "12":
                militaryTime = "12" + s.substring(2, 8);
                break;
            }

        } else {
            System.out.println(s.substring(0, 2));
            // militaryTime = s.substring(2, 8);
            temp = s.substring(0, 2);

            if (temp.contains("12")) {
                militaryTime = "00" + s.substring(2, 8);
            } else {
                militaryTime = s.substring(0, 8);
            }

        }

        return militaryTime;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bw = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "12:40:22AM"; // scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
        // bw.write(result);
        // bw.newLine();

        // bw.close();
    }
}
