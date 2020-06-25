package burger_shop;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Main {

    private static DecimalFormat priceFormat = new DecimalFormat("##0.00");
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        Burger hamburger = new Burger("Basic", "Beef", "Wheat");
        hamburger.addBurgerTopping1("Avocado", 1.50);
        hamburger.addBurgerTopping2("Ketchup", 0.25);
        System.out.println("Basic Burger price: $" +priceFormat.format(hamburger.basicBurgerPrice()));

        DeluxeBurger deluxeBurger = new DeluxeBurger("White");
        deluxeBurger.addBurgerTopping1("Avocado", 1.50);
        deluxeBurger.addBurgerTopping2("topping 2", 0.25);
        deluxeBurger.addBurgerTopping3("topping 3", 0.50);
        deluxeBurger.addBurgerTopping4("topping 4", 0.75);
        deluxeBurger.addBurgerTopping5("topping 5", 1.00);
        System.out.println("Deluxe Burger price: $" +priceFormat.format(deluxeBurger.basicBurgerPrice()));
        System.out.println("Total price after toppings: $" + priceFormat.format(deluxeBurger.totalBurgerPrice()));

        HealthBurger health = new HealthBurger("Turkey");
        health.addHealthTopping1("Lettuce", 0.50);
        health.addHealthTopping2("Bacon", 1.25);
        health.addHealthTopping3("Pickle", 0.50);
        health.addHealthTopping4("Mustard", 0.25);
        System.out.println("Heath Burger price: $" + priceFormat.format(health.basicBurgerPrice()));
        System.out.println("Total after toppings: $" + priceFormat.format(health.totalBurgerPrice()));


        
    }
}
