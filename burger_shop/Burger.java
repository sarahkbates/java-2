package burger_shop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Burger {

    public static final Burger Basic = new Burger(Meat.Beef, Bread.White);
    public static final Burger Deluxe = new DeluxeBurger (Meat.Bison, Bread.Wheat);
    public static final Burger Health = new HealthBurger(Meat.Turkey);

    public String name;
    private Meat meat;
    private double price;
    private Bread breadRollType;
    public ArrayList<Topping> toppingsList;
    public int maxToppings;

    private static final DecimalFormat priceFormat = new DecimalFormat("##0.00");



    public Burger(Meat meat, Bread breadRollType){
        this.name = "Basic";
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = 3.25;
        this.toppingsList = new ArrayList<>();
        this.maxToppings = 2;

}

    public String getBurgerName(){
        return name;
    }

    public void setBurgerName(String name){
        this.name = name;
    }

    public void setBurgerPrice(double price){
        this.price = price;
    }

    public void setMaxToppings(int maxToppings){
        this.maxToppings = maxToppings;
    }

    public void setMeat(Meat meat){
        this.meat = meat;
    }

   public void setBreadRollType(Bread breadRollType){
       this.breadRollType = breadRollType;
   }

    public void addToppings(Topping... topping){
        for(Topping t: topping){
            if(this.toppingsList.size() >= this.maxToppings) {
                System.out.println("Exceeded maximum toppings allowed. The " + this.name + " Burger only allows for " + this.maxToppings + " toppings, " + t.getToppingName() + " not added.");
            } else {
                System.out.println("Added " + t.getToppingName() + " for an extra $" + priceFormat.format(t.getToppingPrice()));
                this.toppingsList.add(t);
            }
        }
    }

    public double basicBurgerPrice(){
        return this.price;
    }

    public void printBasicBurgerPrice(){
        System.out.println(this.name + " hamburger with a " + this.meat.getMeatName() + " patty on a " + this.breadRollType.getBreadTypeName() + " bun, price is $" + priceFormat.format(this.price));
    }

    public void totalBurgerPrice() {
        double burgerPrice = this.price;
        for (Topping checkedTopping : toppingsList) {
            burgerPrice += checkedTopping.getToppingPrice();
        }
        System.out.println("Total burger price with toppings: $" + priceFormat.format(burgerPrice));
    }
   


}