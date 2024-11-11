package com.master.master_service.module;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Course {
     @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id")
	private int s_id;
@Basic
@Column(name="c_name")
    private String courseName;
@Basic
@Column(name="c_link")
private String courseLink;
public int getS_id() {
    return s_id;
}
public void setS_id(int s_id) {
    this.s_id = s_id;
}
public String getCourseName() {
    return courseName;
}
public void setCourseName(String courseName) {
    this.courseName = courseName;
}
public String getCourseLink() {
    return courseLink;
}
public void setCourseLink(String courseLink) {
    this.courseLink = courseLink;
}




}
