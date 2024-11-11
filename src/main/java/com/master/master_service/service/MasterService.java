package com.master.master_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.master_service.module.Course;
import com.master.master_service.module.Location;
import com.master.master_service.module.Student;
import com.master.master_service.module.StudentCourse;
import com.master.master_service.repo.CourseRepo;
import com.master.master_service.repo.LocationRepo;
import com.master.master_service.repo.StuCou;
import com.master.master_service.repo.StudentRepo;

@Service
public class  MasterService {
    
    @Autowired
    LocationRepo locationRepo;
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    StudentRepo repo;
    @Autowired
    StuCou cou;

    public Location saveLoc(Location entity) {
      return   locationRepo.save(entity);
    }

    public List<Location> fetchLoc() {
      return locationRepo.findAll();
    }

    public List<Course> saveCourse(List<Course> entity) {
       return courseRepo.saveAll(entity);
    }

    public List<Course> fetchCourse() {
       return courseRepo.findAll();
    }

    public List<Student> saveStudent(List<Student> entity) {
       return repo.saveAll(entity);
    }

    public Student login(String email, String password) {
        return repo.findByEmailAndPassword(email, password)
                .orElseThrow(() -> new RuntimeException("Student not found with email and password"));
 
    }

    public List<StudentCourse> saveStudentCourse(List<StudentCourse> entity) {
      return cou.saveAll(entity);
    }

    public List<Course> getCByS(int id) {
     return cou.findCoursesByStudentId(id);
    }


}
