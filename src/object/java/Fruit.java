package object.java;

import java.util.ArrayList;

/**
 * The class refers to the characteristics of a fruit.
 */
public class Fruit {

    /**
     * It refers to the name of the fruit.
     */
    public String name;
    /**
     * It refers to the average height of the fruit.
     */
    private Float averageHeight;

    /**
     * It refers to a list of colors that the fruit can have.
     */
    public ArrayList<String> colors;

    /**
     *Refers to the constructor of the class that initializes the attributes.
     * @param name It refers to the name of the fruit that is assigned when the class is instantiated.
     * @param averageHeight It refers to the average height of the fruit that is assigned when the class is instantiated.
     * @param colors Refers to the list of fruit colors that is assigned when the class is instantiated.
     */
    public Fruit(String name, Float averageHeight, ArrayList<String> colors) {
        this.name= name;
        this.averageHeight = averageHeight;
        this.colors = colors;
    }

    /**
     * The method refers to obtaining the averageHeight of the fruit
     * @return the value of the mean height attribute.
     */
    public Float getAverageHeight() {
        return averageHeight;
    }

    /**
     * The method references the initialization of the value of the averageHeight attribute.
     * @param averageHeight assigns a value of type Float to the averageHeight attribute.
     */
    public void setAverageHeight(Float averageHeight) {
        this.averageHeight = averageHeight;
    }


}
