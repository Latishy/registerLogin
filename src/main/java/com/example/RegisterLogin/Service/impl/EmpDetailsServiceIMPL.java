package com.example.RegisterLogin.Service.impl;

import com.example.RegisterLogin.Dto.EmpDetailsDTO;
import com.example.RegisterLogin.Entity.EmpDetails;
import com.example.RegisterLogin.Repo.EmpDetailsRepo;
import com.example.RegisterLogin.Service.EmpDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpDetailsServiceIMPL implements EmpDetailsService {
    @Autowired
    private EmpDetailsRepo empDetailsRepo;

    @Override
    public String addNewEmployee(EmpDetailsDTO empDetailsDTO) {
        EmpDetails empDetails = new EmpDetails();
        empDetails.setEmpCode(empDetailsDTO.getEmpCode());
        empDetails.setEmpName(empDetailsDTO.getEmpName());

        empDetailsRepo.save(empDetails);
        return "Inserted record";
    }

    @Override
    public List<EmpDetails> getAllEmployees(){
        return empDetailsRepo.findAll();
    }


}