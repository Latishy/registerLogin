package com.example.RegisterLogin.Dto;



public class EmployeeDTO {
    private int employeeid;
    private String employeename;
    private String employeeposition;
    private String employeestream;
    private String email;
    private String password;

    public EmployeeDTO() {
    }



    public EmployeeDTO(int employeeid, String employeename, String employeeposition, String employeestream, String email, String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeposition=employeeposition;
        this.employeestream=employeestream;
        this.email = email;
        this.password = password;
    }


    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }
    public String getEmployeeposition() {
        return employeeposition;
    }

    public void setEmployeeposition(String employeeposition) {
        this.employeeposition = employeeposition;
    }

    public String getEmployeestream() {
        return employeestream;
    }

    public void setEmployeestream(String employeestream) {
        this.employeestream = employeestream;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", employeeposition='" + employeeposition + '\'' +
                ", employeestream='" + employeestream + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
} //create getters and setters
