
package com.example.RegisterLogin.EmployeeController;
import com.example.RegisterLogin.Dto.EmpDetailsDTO;
import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Entity.EmpDetails;
import com.example.RegisterLogin.Entity.Employee;
import com.example.RegisterLogin.Entity.EmployeeTrack;
import com.example.RegisterLogin.Service.EmpDetailsService;

import com.example.RegisterLogin.Service.EmployeeService;
import com.example.RegisterLogin.Service.EmployeeTrackService;
import com.example.RegisterLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        String empname = employeeService.addEmployee(employeeDTO);
        return empname;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse LoginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(LoginResponse);
    }

    @Autowired
    private EmpDetailsService empDetailsServiceobj;

    @PostMapping(path = "/enter")
    public String saveNewEmployeeInfo(@RequestBody EmpDetailsDTO newEmpInfo)
    {
        String status = empDetailsServiceobj.addNewEmployee(newEmpInfo);
        //return savedInfo;
        System.out.println(status);
        return status;
    }

    @GetMapping(path="/all")
    public List<EmpDetails> AllEmployeeInfo()
    {
        return empDetailsServiceobj.getAllEmployees();

    }

    @Autowired
    private EmployeeTrackService employeeTrackServiceobj;



    @GetMapping(path="/track")
    public List<EmployeeTrack> AllEmployeeTrackInfo()
    {
        return employeeTrackServiceobj.getAllEmployeeTrack();

    }

    @GetMapping(path = "/mail/{empmail}")
    public Employee femp(@PathVariable("empmail") String mail) {
        return employeeService.findemp(mail);
    }


}