package burger_shop;

public class Side {
    private String sideName;
    private double sidePrice;

    public static final Side Fries = new Side ("fries", 1.25);
    public static final Side Chips = new Side ("chips", 1.25);
    public static final Side ApplePie = new Side ("apple pie", 1.25);
    public static final Side IceCream = new Side ("ice cream", 1.25);
    public static final Side AppleSlices = new Side ("apple slices", 1.25);

    public Side(String sideName, double sidePrice){
        this.sideName = sideName;
        this.sidePrice = sidePrice;
    }

    public String getSideName(){
        return this.sideName;
    }

    public double getSidePrice(){
        return this.sidePrice;
    }

}
