package object.java;

import java.util.ArrayList;

/**
 * It refers to a fruit inventory that inherits methods and attributes from the fruit class and applies its own methods and attributes.
 */
public class FruitInventory extends Fruit{
    /**
     * Refers to the amount of fruit in inventory.
     */
    private Integer amount;
    /**
     * It refers to the price of the fruit that is in the inventory.
     */
    public Integer price;
    /**
     * It refers to the tax of the fruit that is in the inventory.
     */
    protected Integer tax;

    /**
     * It references the constructor of the class that inherits the attributes of the fruit class and initializes them and initializes its own attributes.
     * @param name Assigns a value to the name attribute that is inherited from the fruits class.
     * @param averageHeight Assigns a value to the averageHeight attribute that is inherited from the fruits class.
     * @param colors Assigns a list to the colors attribute that is inherited from the fruits class.
     * @param price Assigns a value to the price attribute.
     * @param tax Assigns a value to the tax attribute.
     */
    public FruitInventory(String name, Float averageHeight, ArrayList<String> colors,  Integer price, Integer tax){
        super(name, averageHeight, colors);
        this.price = price;
        this.tax = tax;
    }

    /**
     * It refers to the method that allows assigning to the private method amount.
     * @param amount that will assign the value to the tribute amount.
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     *It refers to the method that returns the amount of fruit.
     * @return the value of the amount attribute.
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * It refers to the method that returns the price of fruit.
     * @return the value of the price attribute
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * It refers to the method that returns the tax of fruit.
     * @return the value of the tax attribute
     */
    public Integer getTax() {
        return tax;
    }

    /**
     *The method references the method of the @Override object class.
     * @return the description of the fruit inventory.
     */
        @Override
    public String toString() {
        return "FruitInventory{" +
                "name='" + name + '\'' +
                ", colors=" + colors +
                ", amount=" + amount +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
