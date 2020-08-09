package burger_shop;

public class Bread {
    private final String breadType;

    public static final Bread Rye = new Bread ("brown rye");
    public static final Bread White = new Bread ("white");
    public static final Bread Wheat = new Bread ("wheat");
    public static final Bread Lettuce = new Bread ("lettuce");

    public Bread(String breadType){
        this.breadType = breadType;
    }

    public String getBreadTypeName(){
        return breadType;
    }

}
