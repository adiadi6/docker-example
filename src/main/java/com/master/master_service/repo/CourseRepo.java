package com.master.master_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.master_service.module.Course;

public interface  CourseRepo extends JpaRepository<Course, Integer>{
    
}
