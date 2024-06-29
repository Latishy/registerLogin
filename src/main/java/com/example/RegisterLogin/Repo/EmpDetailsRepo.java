package com.example.RegisterLogin.Repo;

import com.example.RegisterLogin.Dto.EmpDetailsDTO;
import com.example.RegisterLogin.Entity.EmpDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;


@EnableJpaRepositories
@Repository

public interface EmpDetailsRepo extends JpaRepository<EmpDetails,Integer> {
    Optional<EmpDetails> findByEmpName(String empName);
    //ArrayList<EmpDetails> getAllEmployees();

}










