package burger_shop;

import java.text.DecimalFormat;
import java.util.Arrays;

public class HealthBurger extends Burger {
    private String healthTopping1Name;
    private double healthTopping1Price;

    private String healthTopping2Name;
    private double healthTopping2Price;

    private String healthTopping3Name;
    private double healthTopping3Price;

    private String healthTopping4Name;
    private double healthTopping4Price;

    private static DecimalFormat priceFormat = new DecimalFormat("#0.00");

    private String[] healthToppings = {"Lettuce", "Tomatoes", "Carrots", "Onions"};

    public HealthBurger(String meat){
        super("Health", meat, "Brown Rye");
            double price = 4.25;
    }

    public void addHealthTopping1(String name, double price){
        this.healthTopping1Name = name;
        this.healthTopping1Price = price;
    }

    public void addHealthTopping2(String name, double price){
        this.healthTopping2Name = name;
        this.healthTopping2Price = price;
    }

    public void addHealthTopping3(String name, double price){
        this.healthTopping3Name = name;
        this.healthTopping3Price = price;
    }

    public void addHealthTopping4(String name, double price){
        this.healthTopping4Name = name;
        this.healthTopping4Price = price;
    }

    public boolean topping1IsHealth(){
        if(Arrays.asList(healthToppings).contains(healthTopping1Name)){
            return true;
        } else{
            return false;
        }
    }

    public boolean topping2IsHealth(){
        if(Arrays.asList(healthToppings).contains(healthTopping2Name)){
            return true;
        } else{
            return false;
        }
    }

    public boolean topping3IsHealth(){
        if(Arrays.asList(healthToppings).contains(healthTopping3Name)){
            return true;
        } else{
            return false;
        }
    }

    public boolean topping4IsHealth(){
        if(Arrays.asList(healthToppings).contains(healthTopping4Name)){
            return true;
        } else{
            return false;
        }
    }

    @Override public void addBurgerTopping1(String name, double price){
        throw new UnsupportedOperationException("Unhealthy topping cannot be added to the Health Burger.");
    }

    @Override public void addBurgerTopping2(String name, double price){
        throw new UnsupportedOperationException("Unhealthy topping cannot be added to the Health Burger.");
    }

    @Override public double totalBurgerPrice(){
        double burgerPrice = this.basicBurgerPrice();
        if(this.healthTopping1Name != null && this.topping1IsHealth()){
            burgerPrice += this.healthTopping1Price;
            System.out.println("Added " + this.healthTopping1Name + " for an extra $" + priceFormat.format(this.healthTopping1Price));
        } else if (!this.topping1IsHealth()){
            System.out.println(this.healthTopping1Name + " is not available on the Health Burger.");
        }
        if(this.healthTopping2Name != null && this.topping2IsHealth()){
            burgerPrice += this.healthTopping2Price;
            System.out.println("Added " + this.healthTopping2Name + " for an extra $" + priceFormat.format(this.healthTopping2Price));
        } else if (!this.topping2IsHealth()){
            System.out.println(this.healthTopping2Name + " is not available on the Health Burger.");
        }
        if(this.healthTopping3Name != null && this.topping3IsHealth()){
            burgerPrice += this.healthTopping3Price;
            System.out.println("Added " + this.healthTopping3Name + " for an extra $" + priceFormat.format(this.healthTopping3Price));
        } else if (!this.topping3IsHealth()){
            System.out.println(this.healthTopping3Name + " is not available on the Health Burger.");
        }
        if(this.healthTopping4Name != null && this.topping4IsHealth()){
            burgerPrice += this.healthTopping4Price;
            System.out.println("Added " + this.healthTopping4Name + " for an extra $" + priceFormat.format(this.healthTopping4Price));
        } else if (!this.topping4IsHealth()){
            System.out.println(this.healthTopping4Name + " is not available on the Health Burger.");
        }
        return burgerPrice;

    }
}
