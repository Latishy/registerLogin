package com.example.RegisterLogin.Dto;


public class EmpDetailsDTO {

    private int empCode;

    private String empName;

    private String empRole;

    private String empSubRole;

    private String empManager;

    private String empEmail;



    private String empMaster;

    // Constructors
    public EmpDetailsDTO() {
    }

    public EmpDetailsDTO(int empCode, String empName, String empRole, String empSubRole, String empManager, String empEmail, String empMaster) {
        this.empCode = empCode;
        this.empName = empName;
        this.empRole = empRole;
        this.empSubRole=empSubRole;
        this.empManager = empManager;
        this.empEmail = empEmail;
       // this.empMaster = empMaster;
    }

    @Override
    public String toString() {
        return "empDetails{" +
                "empCode=" + empCode +
                ", empName='" + empName + '\'' +
                ", empRole='" + empRole + '\'' +
                ", empSubRole='" + empSubRole + '\'' +
                ", empManager='" + empManager + '\'' +
                ", empEmail='" + empEmail + '\'' +
               // ", empMaster='" + empMaster + '\'' +
                '}';
    }

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
