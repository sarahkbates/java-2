package burger_shop;

public class Drink {
    private final String drinkName;
    private final double drinkPrice;

    public static final Drink Water = new Drink("water", 0.50);
    public static final Drink Gatorade = new Drink("Gatorade", 0.50);
    public static final Drink PowerAid = new Drink("Power Aide", 0.50);
    public static final Drink Coke = new Drink("Coke", 0.50);
    public static final Drink DietCoke = new Drink("Diet Coke", 0.50);
    public static final Drink MountainDew = new Drink("Mountain Dew", 0.50);
    public static final Drink Sprite = new Drink("Sprite", 0.50);
    public static final Drink Fanta = new Drink("Fanta", 0.50);
    public static final Drink DrPepper = new Drink("Dr. Pepper", 0.50);

    public Drink(String drinkName, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkName() {
        return this.drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }
    
}