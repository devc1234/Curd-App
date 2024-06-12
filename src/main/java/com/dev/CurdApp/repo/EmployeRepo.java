package com.dev.CurdApp.repo;

import com.dev.CurdApp.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeRepo extends JpaRepository<Employe, Long> {
}
