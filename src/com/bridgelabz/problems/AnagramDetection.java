package com.bridgelabz.problems;

import java.util.Arrays;
import java.util.Scanner;
    public class AnagramDetection {
        public static boolean findAnagram(String str1, String str2) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            if (str1.length() != str2.length()) {
                return false;
            }else {
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if (Arrays.equals(arr1, arr2)) {
                    return true;
                }
            }
            return false;

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter String One");
            String str1 = scanner.next();
            System.out.println("Enter String Two");
            String str2 = scanner.next();

            boolean result = findAnagram(str1, str2);
            if(result) {
                System.out.println("Two String are anagram");
            }else {
                System.out.println("Two String are not anagram");
            }

        }
}
