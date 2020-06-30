package burger_shop;

public class Topping {
    private final String toppingName;
    private final double toppingPrice;
    private final boolean isHealthy;
    public static final Topping Lettuce = new Topping("lettuce", 0.27, true);
    public static final Topping Tomatoes = new Topping("tomatoes", 0.15, true);
    public static final Topping Carrots = new Topping("carrots", 0.27, true);
    public static final Topping Pickles = new Topping("pickles", 0.35, true);
    public static final Topping Ketchup = new Topping("ketchup", 0.10, true);
    public static final Topping Mustard = new Topping("mustard", 0.10, true);
    public static final Topping Mayonnaise = new Topping("mayonnaise", 0.15, false);
    public static final Topping Relish = new Topping("relish", 0.25, true);
    public static final Topping Guacamole = new Topping("guacamole", 0.55, true);
    public static final Topping Cheese = new Topping("cheese", 1.00, false);
    public static final Topping Bacon = new Topping("bacon", 1.25, false);
    public static final Topping Egg = new Topping("egg", 1.00, false);
    public static final Topping Onions = new Topping("onions", 0.85, true);

    public Topping(String toppingName, double toppingPrice, boolean isHealthy) {
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
        this.isHealthy = isHealthy;
    }

    public String getToppingName() {
        return this.toppingName;
    }

    public double getToppingPrice() {
        return this.toppingPrice;
    }

    public boolean isHealthy() {
        return this.isHealthy;
    }
    
}