package object.java;

import java.util.ArrayList;

/**
 * refers to a bank class.
 */
public class Bank {
    /**
     * Refers to the name of the bank.
     */
    public String name;
    /**
     * It refers to the bank's list of services.
     */
    public ArrayList<String> services;
    /**
     * Refers to the name of the bank manager.
     */
    protected String managerName;
    /**
     * Refers to the name of the bank customer.
     */
    private String client;

    /**
     * Refers to the method that gets the name of the attribute.
     * @return the value of the name attribute
     */
    public String getName() {
        return name;
    }

    /**
     * Refers to the method that assigns a value to the name attribute.
     * @param name Is the value that is assigned when the class is instantiated.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Refers to the method that gets the services of the attribute.
     * @return the value of assigned to the service attribute.
     */
    public ArrayList<String> getServices() {
        return services;
    }

    /**
     * Refers to the method that assigns a value to the services attribute.
     * @param services Is the value that is assigned when the class is instantiated.
     */
    public void setServices(ArrayList<String> services) {
        this.services = services;
    }

    /**
     * Refers to the method that gets the managerName of the attribute.
     * @return the value of assigned to the managerName attribute.
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * Refers to the method that assigns a value to the managerName attribute.
     * @param managerName Is the value that is assigned when the class is instantiated.
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * Refers to the method that gets the client of the attribute.
     * @return the value of assigned to the client attribute.
     */
    public String getClient() {
        return client;
    }

    /**
     * Refers to the method that assigns a value to the managerName attribute.
     * @param client Is the value that is assigned when the class is instantiated.
     */
    public void setClient(String client) {
        this.client = client;
    }
}
