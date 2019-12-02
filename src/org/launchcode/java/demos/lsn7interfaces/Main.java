package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

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
        System.out.println("\nCones Before:");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + cone.getCost());
        }
        System.out.println("\nToppings Before:");
        for (Topping topping : toppings) {
            System.out.println(topping.getName() + ": " + topping.getCost());
        }

        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());
        toppings.sort(new ToppingComparator());

        System.out.println("\nFlavors After:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ", #ofAllergens: " + flavor.getAllergens().size());
        }
        System.out.println("\nCones After:");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + cone.getCost());
        }
        System.out.println("\nToppings After:");
        for (Topping topping : toppings) {
            System.out.println(topping.getName() + ": " + topping.getCost());
        }
    }
}
