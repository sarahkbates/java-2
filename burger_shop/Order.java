package burger_shop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Order {
    private Burger orderBurger;
    private final ArrayList<Topping> toppingsList;
    private final ArrayList<Side> sidesList;
    private final ArrayList<Burger> burgersList;
    private final ArrayList<Drink> drinksList;

    private static final DecimalFormat priceFormat = new DecimalFormat("##0.00");

    public Order(Burger orderBurger, Bread orderBread, Meat orderMeat) {
        this.orderBurger = orderBurger;
        this.orderBurger.setBreadRollType(orderBread);
        this.orderBurger.setMeat(orderMeat);
        this.toppingsList = orderBurger.toppingsList;
        this.sidesList = new ArrayList<>();
        this.burgersList = new ArrayList<>(Collections.singletonList(orderBurger));
        this.drinksList = new ArrayList<>();
    }

    public Order(Meal orderMeal) {
        this.orderBurger = orderMeal.mealBurger;
        this.toppingsList = orderMeal.mealBurger.toppingsList;
        this.sidesList = orderMeal.sidesList;
        this.burgersList = new ArrayList<>(Collections.singletonList(orderMeal.mealBurger));
        this.drinksList = new ArrayList<>(Collections.singletonList(orderMeal.mealDrink));
    }

    public void addToppings(Topping... addedToppings) {
        for(Topping t: addedToppings){
            if(this.toppingsList.size() >= this.orderBurger.maxToppings) {
                System.out.println("Exceeded maximum toppings allowed. The " + this.orderBurger.name + " Burger only " + "allows " + "for " + this.orderBurger.maxToppings + " toppings, " + t.getToppingName() + " not added.");
            } else if(orderBurger == Burger.Health && !t.isHealthy()) {
                    System.out.println(t.getToppingName() + " is not healthy and cannot be ordered on the Healthy Burger.");
            } else {
                this.toppingsList.add(t);
            }
        }
    }

    public void addSides(Side ... addedSides) {
        this.sidesList.addAll(Arrays.asList(addedSides));
    }

    public void addBurger(Burger addedBurger) {
        this.burgersList.add(addedBurger);
    }

    public void addDrink(Drink addedDrink) {
        this.drinksList.add(addedDrink);
    }

    public void printOrderTotal() {
        double orderTotal = 0.00;
        for(Burger burger: burgersList) {
            burger.printBasicBurgerPrice();
            orderTotal += burger.basicBurgerPrice();
        }
        for(Topping topping: this.toppingsList) {
            System.out.println("Added " + topping.getToppingName() + " to burger for an extra $" + priceFormat.format(topping.getToppingPrice()));
            orderTotal += topping.getToppingPrice();
        }
        for(Side side: sidesList) {
            System.out.println("Added " + side.getSideName() + " to side for an extra $" + priceFormat.format(side.getSidePrice()));
            orderTotal += side.getSidePrice();
        }
        for(Drink drink: drinksList) {
            System.out.println("Added " + drink.getDrinkName() + " for $" + priceFormat.format(drink.getDrinkPrice()));
            orderTotal += drink.getDrinkPrice();
        }
        System.out.println("Your order total is: $" + priceFormat.format(orderTotal));
    }

    public void purchaseOrder() {
        System.out.println("Thank you for dining with us at Bill's Burgers!");
    }
}
