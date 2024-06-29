package com.example.RegisterLogin.Service;


import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Entity.Employee;
import com.example.RegisterLogin.response.LoginResponse;

import java.util.*;


public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginResponse loginEmployee(LoginDTO loginDTO); // throws UserNotFoundException;
    //LoginResponse loginEmployee(Employee employee) throws UserNotFoundException;

    public Employee findemp(String mail);
}