package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        String someString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] someArray = someString.split(" ");
        String[] anotherArray = someString.split("\\.");
        int[] someInts = {1, 1, 2, 3, 5, 8};

        System.out.println(Arrays.toString(someArray));
        System.out.println(Arrays.toString(anotherArray));

        for (int i : someInts) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }

}
