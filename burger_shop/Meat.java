package burger_shop;

public class Meat {
    private final String meatName;

    public static final Meat Beef = new Meat("beef");
    public static final Meat Turkey = new Meat("turkey");
    public static final Meat Bison = new Meat("bison");
    public static final Meat BlackBean = new Meat("black bean");
    public static final Meat Steak = new Meat("steak");

    public Meat(String meatName) {
        this.meatName = meatName;
    }

    public String getMeatName() {
        return meatName;
    }
}
