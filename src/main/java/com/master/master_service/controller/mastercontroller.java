package com.master.master_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.master.master_service.module.Course;
import com.master.master_service.module.Location;
import com.master.master_service.module.Student;
import com.master.master_service.module.StudentCourse;
import com.master.master_service.service.MasterService;


@RestController
@CrossOrigin
@RequestMapping("master/api")
public class mastercontroller {
    @Autowired
    MasterService masterService;

    @PostMapping("location")
    public ResponseEntity<?> postLocation(@RequestBody Location entity) {
       
        Location l=masterService.saveLoc(entity);
        return ResponseEntity.ok(l) ;
    }
    @PostMapping("course")
    public ResponseEntity<?> postCourse(@RequestBody List<Course> entity) {
       
        List<Course> l=masterService.saveCourse(entity);
        return ResponseEntity.ok(l) ;
    }
    @GetMapping("course")
    public ResponseEntity<?> getCourse() {
        List<Course> l=masterService.fetchCourse();
        return ResponseEntity.ok(l);
    }
    @PostMapping("student")
    public ResponseEntity<?> postStundet(@RequestBody List<Student> entity) {
       
        List<Student> l=masterService.saveStudent(entity);
        return ResponseEntity.ok(l) ;
    }

    @PostMapping("studentCourse")
    public ResponseEntity<?> postStundetCourse(@RequestBody List<StudentCourse> entity) {
       
        List<StudentCourse> l=masterService.saveStudentCourse(entity);
        return ResponseEntity.ok(l) ;
    }

    @GetMapping("login")
    public ResponseEntity<?> getLocation(@RequestParam String email,@RequestParam String password) {
        Student l=masterService.login(email,password);
        return ResponseEntity.ok(l);
    }


    @GetMapping("location")
    public ResponseEntity<?> getLocation() {
        List<Location> l=masterService.fetchLoc();
        return ResponseEntity.ok(l);
    }
    @GetMapping("courseByStudent")
    public ResponseEntity<?> getCByS(@RequestParam int id ) {
        List<Course> l=masterService.getCByS(id);
        return ResponseEntity.ok(l);
    }
    

    
    
}
