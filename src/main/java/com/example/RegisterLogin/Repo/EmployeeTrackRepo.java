package com.example.RegisterLogin.Repo;

import com.example.RegisterLogin.Entity.EmployeeTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTrackRepo extends JpaRepository<EmployeeTrack, Integer> {
    // No additional methods needed, JpaRepository provides basic CRUD operations
}
