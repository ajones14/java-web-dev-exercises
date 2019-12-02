package org.launchcode.java.demos.lsn7interfaces;


import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case allItems = new Case();
        ArrayList<Flavor> flavors = allItems.getFlavors();
        ArrayList<Cone> cones = allItems.getCones();
        ArrayList<Topping> toppings = allItems.getToppings();

        System.out.println("Flavors Before:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ", #ofAllergens: " + flavor.getAllergens().size());
        }
        System.out.println("\n");
        System.out.println("Cones Before:");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + cone.getCost());
        }
        System.out.println("\n");
        System.out.println("Toppings Before:");
        for (Topping topping : toppings) {
            System.out.println(topping.getName() + ": " + topping.getCost());
        }
        System.out.println("\n");

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());
        toppings.sort(new ToppingComparator());
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Flavors After:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ", #ofAllergens: " + flavor.getAllergens().size());
        }
        System.out.println("\n");
        System.out.println("Cones After:");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + cone.getCost());
        }
        System.out.println("\n");
        System.out.println("Toppings After:");
        for (Topping topping : toppings) {
            System.out.println(topping.getName() + ": " + topping.getCost());
        }

    }
}
