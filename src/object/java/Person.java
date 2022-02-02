package object.java;
import java.util.Date;

/**
 * The class represents people and their fundamental attributes.
 * @author Daniel Felipe Agudelo Ramos
 */
public class Person  {
    /**
     * Represents the name of a person.
     */
    public String name;
    /**
     * Represents the first lastname of a person.
     */
    public String lastName1;
    /**
     * Represents the second lastname of a person.
     */
    public String lastName2;
    /**
     * Represents a person's birthday.
     */
    public Date dateBirth;
    /**
     * Represents the height of a person.
     */
    public Float height;
    /**
     * Represents the gender of a person.
     */
    public String gender;

    /**
     * Represents the constructor that initializes the class's attributes when an instance is created.
     * @param gender The gender that is entered in the instance.
     * @param name The name that is entered into the instance.
     * @param lastName1 The first last name that is entered in the instance.
     * @param lastName2 The second last name that is entered in the instance.
     * @param dateBirth The birthday date that is entered into the instance
     * @param height The height that is entered into the instance.
     */
    public Person (String gender, String name, String lastName1, String lastName2, Date dateBirth, Float height){
        this.gender = gender;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     *
     * @return the gender oof the instantiated class.
     */
    public String getGender() {
        return gender;
    }

    /**
     *The method references the initialization of the name attribute.
     * @param name It refers to the name that will be assigned to the attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the name of the instantiated class.
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return the first lastname of the instantiated class.
     */
    public String getLastName1() {
        return this.lastName1;
    }

    /**
     *
     * @return the second lastname of the instantiated class.
     */
    public String getLastName2() {
        return this.lastName2;
    }

    /**
     *
     * @return the birthday of the instantiated class.
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     *
     * @return the height of the instantiated class.
     */
    public Float getHeight() {
        return this.height;
    }

    /**
     *The method references the method of the @Override object class.
     * @return to the description of the person using their attributes.
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\n' +
                ", lastName1='" + lastName1 + '\n' +
                ", lastName2='" + lastName2 + '\n' +
                ", dateBirth=" + dateBirth +
                ", height=" + height + '\n'+
                ", gender='" + gender + '\n' +
                '}';
    }
}

