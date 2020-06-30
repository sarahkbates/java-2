package burger_shop;


public class DeluxeBurger extends Burger{
    
    public DeluxeBurger(Meat meat, Bread breadRollType) {
        super(meat, breadRollType);
        this.setBurgerName("Deluxe");
        this.setBurgerPrice(4.99);
        this.setMaxToppings(6);
    }
    
}
    


