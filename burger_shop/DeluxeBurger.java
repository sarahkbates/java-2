package burger_shop;

import java.text.DecimalFormat;

public class DeluxeBurger extends Burger{
    private String topping3Name;
    private double topping3Price;

    private String topping4Name;
    private double topping4Price;

    private String topping5Name;
    private double topping5Price;

    private String topping6Name;
    private double topping6Price;

    private static DecimalFormat priceFormat = new DecimalFormat("##0.00");

    public DeluxeBurger(String breadRollType){
        super("Deluxe", "Bison", breadRollType);
        double price = 4.50;
    }

    public void addBurgerTopping3(String name, double price){
        this.topping3Name = name;
        this.topping3Price = price;
    }

    public void addBurgerTopping4(String name, double price){
        this.topping4Name = name;
        this.topping4Price = price;
    }

    public void addBurgerTopping5(String name, double price){
        this.topping5Name = name;
        this.topping5Price = price;
    }

    public void addBurgerTopping6(String name, double price){
        this.topping6Name = name;
        this.topping6Price = price;
    }

    @Override public double totalBurgerPrice(){
        double burgerPrice = super.totalBurgerPrice();
        if(this.topping3Name != null){
            burgerPrice += this.topping3Price;
            System.out.println("Added " + this.topping3Name + " for an extra $" + priceFormat.format(this.topping3Price));
        }
        if(this.topping4Name != null){
            burgerPrice += this.topping4Price;
            System.out.println("Added " + this.topping4Name + " for an extra $" + priceFormat.format(this.topping4Price));
        }
        if(this.topping5Name != null){
            burgerPrice += this.topping5Price;
            System.out.println("Added " + this.topping5Name + " for an extra $" + priceFormat.format(this.topping5Price));
        }
        if(this.topping6Name != null){
            burgerPrice += this.topping6Price;
            System.out.println("Added " + this.topping6Name + " for an extra $" + priceFormat.format(this.topping6Price));
        }

        return burgerPrice;
    }
    
}
    


