package classPractice;

import java.util.ArrayList;

public class SumArrayLists {

    public static void main(String[] args) {

        //make two int ArrayLists
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        //put stuff into ArrayLists
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(1);
        b.add(1);
        b.add(6);

        //make new ArrayList for result
        ArrayList<Integer> result = new ArrayList<>();

        //find the length of longest list
        int length = 0;
        if (a.size() > b.size()) {
            length = a.size();
        } else {
            length = b.size();
        }

        //for each value in longest list
        for (int i = 0; i < length; i++) {
            //add value from long list to short list
            int sum = a.get(i) + b.get(i);
            //put value in result list
            result.add(sum);
        }
        //print out results
        System.out.println(result);

    }

}
