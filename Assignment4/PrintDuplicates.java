package in.ineuron.main;

import java.util.Scanner;

public class PrintDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    sb.append(arr[i]);
                    break;
                }
            }
        }

        System.out.println("Duplicate characters: " + sb);
    }
}