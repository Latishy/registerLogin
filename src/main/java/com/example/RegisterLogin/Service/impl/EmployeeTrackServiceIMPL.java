package com.example.RegisterLogin.Service.impl;

import com.example.RegisterLogin.Entity.EmployeeTrack;
import com.example.RegisterLogin.Repo.EmployeeTrackRepo;
import com.example.RegisterLogin.Service.EmployeeTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List; // Import List instead of ArrayList

@Service
public class EmployeeTrackServiceIMPL implements EmployeeTrackService {
    @Autowired
    private EmployeeTrackRepo empTrack;

    @Override
    public List<EmployeeTrack> getAllEmployeeTrack() { // Change return type to List
        return empTrack.findAll();
    }
}
