package com.example.RegisterLogin.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empdetails")
public class EmpDetails {

    @Id
    @Column(name = "emp_code", length = 45)
    private int empCode;

    @Column(name = "emp_name", length = 225)
    private String empName;

    @Column(name = "emp_role", length = 225)
    private String empRole;



    @Column(name = "emp_subRole", length = 225)
    private String empSubRole;

    @Column(name = "emp_manager", length = 225)
    private String empManager;

    @Column(name = "emp_email", length = 225 , unique = true)
    private String empEmail;






    // Getters and Setters
    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getEmpManager() {
        return empManager;
    }

    public void setEmpManager(String empManager) {
        this.empManager = empManager;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpSubRole() {
        return empSubRole;
    }

    public void setEmpSubRole(String empSubRole) {
        this.empSubRole = empSubRole;
    }


}
