package com.master.master_service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.master.master_service.module.Course;
import com.master.master_service.module.StudentCourse;

public interface StuCou  extends JpaRepository<StudentCourse, Integer> {
      @Query("SELECT sc.course FROM StudentCourse sc WHERE sc.student.s_id = :studentId")
    List<Course> findCoursesByStudentId(@Param("studentId") int studentId);
}
