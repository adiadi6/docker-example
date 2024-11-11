package com.master.master_service.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.master.master_service.module.Student;

public interface  StudentRepo extends JpaRepository<Student, Integer> {
    
     @Query("SELECT s FROM Student s WHERE s.email = :email AND s.password = :password")
    Optional<Student> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
