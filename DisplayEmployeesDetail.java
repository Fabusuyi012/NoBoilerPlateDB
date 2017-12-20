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
public class DisplayEmployeesDetail {
    public static void main(String[] args) {
        NoBoilerPlateDB nBPdb = new NoBoilerPlateDB();
        Employee employee = nBPdb.getEmployeeById(1);
        System.out.println(employee.getID());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());
    }
}
