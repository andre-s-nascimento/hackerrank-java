package problem_solving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class _06_PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int tamanhoArray = 0;
        double totalPositivos = 0;
        double totalNegativos = 0;
        double totalZeros = 0;
        double razaoPositivos = 0.0;
        double razaoNegativos = 0.0;
        double razaoZeros = 0.0;

        tamanhoArray = arr.length;

        for (int i = 0; i < tamanhoArray; i++) {
            if (arr[i] < 0) {
                totalNegativos++;
            } else {
                if (arr[i] > 0) {
                    totalPositivos++;
                } else {
                    totalZeros++;
                }
            }

        }

        razaoPositivos = (totalPositivos / tamanhoArray);
        razaoNegativos = (totalNegativos / tamanhoArray);
        razaoZeros = (totalZeros / tamanhoArray);

        // System.out.println(razaoPositivos);
        System.out.println(String.format("%.6f", razaoPositivos));
        System.out.println(String.format("%.6f", razaoNegativos));
        System.out.println(String.format("%.6f", razaoZeros));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
