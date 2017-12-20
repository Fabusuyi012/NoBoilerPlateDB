/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webClass;

/**
 *
 * @author Ayodeji Fabusuyi
 */
public class Employee {
    private long id, salary;
    private String firstName, lastName;
    
    public long getID(){
        return id;
    }
    public void setID(long id){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public long getSalary(){
        return salary;
    }
    public void setSalary(long salary){
        this.salary = salary;
    }
}
