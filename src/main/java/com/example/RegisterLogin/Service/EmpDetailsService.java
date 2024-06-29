package com.example.RegisterLogin.Service;


import com.example.RegisterLogin.Dto.EmpDetailsDTO;
import com.example.RegisterLogin.Entity.EmpDetails;

import java.util.List;


public interface EmpDetailsService {
    String addNewEmployee(EmpDetailsDTO empDetailsDTO);
    List<EmpDetails> getAllEmployees();

}