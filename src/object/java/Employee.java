package object.java;

import java.util.Date;

/**
 * Refers to the employee class that inherits from the Person class
 */
public class Employee extends Person{
    /**
     * Refers to the employee's job name.
     */
    public String job;
    /**
     * Refers to the employee's salary.
     */
    private Integer salary;
    /**
     * Refers to the employee ID.
     */
    protected Integer employeeId;

    /**
     * Refers to the constructor of the class that initializes the attributes.
     * @param gender Refers to the gender attribute that is inherited from the Person class.
     * @param name Refers to the name attribute that is inherited from the Person class.
     * @param lastName1 Refers to the lastName1 attribute that is inherited from the Person class.
     * @param lastName2 Refers to the lastName2 attribute that is inherited from the Person class.
     * @param dateBirth Refers to the birthday date attribute that is inherited from the Person class.
     * @param height Refers to the height attribute that is inherited from the Person class.
     * @param job Refers to the job attribute of the Employee class.
     * @param salary Refers to the salary attribute of the Employee class.
     * @param employeeId Refers to the employeeId attribute of the Employee class
     */
    public Employee(String gender, String name, String lastName1, String lastName2, Date dateBirth, Float height, String job, Integer salary, Integer employeeId){
        super(gender, name, lastName1, lastName2, dateBirth, height);
        this.job = job;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    /**
     * It refers to the method that returns the job of Employee.
     * @return the value of the job attribute.
     */
    public String getJob() {

        return job;
    }

    /**
     * It refers to the method that returns the salary of Employee.
     * @return the value of the salary attribute.
     */
    public Integer getSalary() {

        return salary;
    }

    /**
     * The method references the method of the @Override object class.
     * @return to the employee description using their attributes.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "job='" + job + '\'' +
                ", salary=" + salary +
                ", employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", lastName1='" + lastName1 + '\'' +
                ", lastName2='" + lastName2 + '\'' +
                ", dateBirth=" + dateBirth +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                '}';
    }
}
