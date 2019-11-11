package Studios;

import java.util.TreeMap;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        System.out.println("Please enter a string:");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        inputString = inputString.toLowerCase();
        input.close();

//        String sampleString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there";
//        sampleString = sampleString.toLowerCase();

        char[] charactersInString = inputString.toCharArray();

        //create structure to hold char count variables
        TreeMap<Character, Integer> charCounts = new TreeMap<>();
        //loop through the char array
        for (char i : charactersInString) {
            if (Character.isLetter(i) && !charCounts.containsKey(i)) {
                int count = 0;
                for (char j : charactersInString) {
                    if (i == j) {
                        count++;
                    }
                }
                //initialize or add char variable
                charCounts.put(i, count);
                System.out.println(i + ": "+ count);
            }

        }

    }

}
