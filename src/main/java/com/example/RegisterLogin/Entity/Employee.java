

package com.example.RegisterLogin.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name = "employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;
    @Column(name = "employee_name", length = 255)
    private String employeename;



    @Column(name = "employee_position", length = 255)
    private String employeeposition;

    @Column(name = "employee_stream", length = 255)
    private String employeestream;
    @Column(name = "email", length = 255)
    private String email;
    @Column(name = "password", length = 255)
    private String password;

    public Employee() {
    }

    public Employee(int employeeid, String employeename, String employeeposition, String employeestream, String email, String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeposition=employeeposition;
        this.employeestream=employeestream;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeestream() {
        return employeestream;
    }

    public void setEmployeestream(String employeestream) {
        this.employeestream = employeestream;
    }
    public String getEmployeeposition() {
        return employeeposition;
    }

    public void setEmployeeposition(String employeeposition) {
        this.employeeposition = employeeposition;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    //create getters and setters


    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", employeeposition='" + employeeposition + '\'' +
                ", employeestream='" + employeestream + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}