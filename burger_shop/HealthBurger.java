package burger_shop;

public class HealthBurger extends Burger {

    private String[] healthyToppings = {"Lettuce", "Tomatoes", "Carrots", "Guacamole", "Pickles"};

    public HealthBurger(Meat meat) {
        super(meat, Bread.Lettuce);
        this.setBurgerName("Healthy");
        this.setBurgerPrice(4.50);
        this.setMaxToppings(4);
    }

    @Override public void addToppings(Topping ... topping) {
        for(Topping t: topping){
            if(t.isHealthy()) {
                super.addToppings(topping);
            } else {
                System.out.println(t.getToppingName() + " is not healthy and cannot be ordered on the Healthy Burger.");
            }
        }
    }
}
