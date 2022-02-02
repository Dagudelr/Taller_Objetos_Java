package object.java;

/**
 * The class references a bank account with protected and private attributes.
 */
public class BankAccount{
    /**
     * Refers to the account number with private access.
     */
    private Integer accountNumber;
    /**
     * It refers to the state of the account being true activated and false deactivated.
     */
    protected Boolean activated;

    /**
     *The method refers to obtaining the value of the accountNumber attribute.
     * @return The method securely returns the accountNumber with private access.
     */
    public Integer getAccountNumber() {
        return accountNumber;
    }

    /**
     *The method safely assigns an initialization to the accountNumber attribute.
     * @param accountNumber Refers to the account number assigned in the BankAccount class instance.
     */
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *The method refers to getting the value of the activated attribute.
     * @return a boolean with value true or false
     */
    public Boolean getActivated() {

        return this.activated;
    }

    /**
     *The method refers to the initialization of the class when it is instantiated.
     * @param activated is the boolean with value true or false that initializes the activated attribute.
     */
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

}
