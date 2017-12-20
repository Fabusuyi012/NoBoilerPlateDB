/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Ayodeji Fabusuyi
 */
public class NoBoilerPlateDB {
    private final String URL = "linkToDatabase";
    private final String USERNAME = "access Username";
    private final String PASSWORD = "access Password";
    
    private DataSource getDataSource(String url, String username, String password){
        DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
        return dataSource;
    }
    
    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource(URL, USERNAME, PASSWORD));
    
    /**
     * 
     * @param id is the ID number of the employee
     * @return result from querying the database for employee with id @param id
     */
    public Employee getEmployeeById(long id){
        return jdbcTemplate.queryForObject("select id, firstname, lastname, salary"
                + " from employee where id=?",
                new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setID(rs.getLong("id"));
                employee.setFirstName(rs.getString("firstname"));
                employee.setLastName(rs.getString("lastname"));
                employee.setSalary(rs.getLong("salary"));
                return employee;
            }
        }, id
        );
    }
    public static void main(String[] args) {
        new NoBoilerPlateDB().getEmployeeById(1);
    }
}
