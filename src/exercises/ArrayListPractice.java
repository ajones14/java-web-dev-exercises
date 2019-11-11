package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> someWords = new ArrayList<>();
        ArrayList<Integer> someInts = new ArrayList<>();
        someWords.add("Word");
        someWords.add("Strings");
        someWords.add("Int");

        for (int i = 1; i <= 11; i++) {
            someInts.add(i);
        }
        System.out.println(sumOfEvenInts(someInts));
        System.out.println("Enter the length of word to search: ");
        int searchLength = input.nextInt();
        input.close();
        printLetters(someWords, searchLength);

    }

    public static int sumOfEvenInts(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i : arrayList) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void printLetters(ArrayList<String> wordList, int searchLength) {
        for (String i : wordList) {
            if (i.length() == searchLength) {
                System.out.println(i);
            }
        }
    }

}
