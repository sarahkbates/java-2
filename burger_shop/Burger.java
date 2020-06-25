package burger_shop;

import java.text.DecimalFormat;

public class Burger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String topping1Name;
    private double topping1Price;

    private String topping2Name;
    private double topping2Price;

    private static DecimalFormat priceFormat = new DecimalFormat("##0.00");



    public Burger(String name, String meat, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = 3.25;

}

    public void addBurgerTopping1(String name, double price){
        this.topping1Name = name;
        this.topping1Price = price;
    }

    public void addBurgerTopping2(String name, double price){
        this.topping2Name = name;
        this.topping2Price = price;
    }

    public double basicBurgerPrice(){
        return this.price;
    }

    public double totalBurgerPrice(){
        double burgerPrice = this.price;
        System.out.println(this.name + " hamburger with a " + this.meat + " patty on a " + this.breadRollType + " roll, price is $" + priceFormat.format(this.price));
        if(this.topping1Name != null){
            burgerPrice += this.topping1Price;
            System.out.println("Added " + this.topping1Name + " for an extra $" + priceFormat.format(this.topping1Price));
        }
        if (this.topping2Name != null){
            burgerPrice += this.topping2Price;
            System.out.println("Added " + this.topping2Name + " for an extra $" + priceFormat.format(this.topping2Price));
        }
        return burgerPrice;
    }

}