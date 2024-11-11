package com.master.master_service.module;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id")
	private int s_id;
     @Basic
     @Column(name="s_name")
	private String s_name;
    
    @Basic
    @Column(name="s_reg")
private String s_reg;
@Basic
@Column(name="phone_no")
String phone_No;
@Column(name="email" , unique = true)
String email;
@Basic
@Column(name="password")
String password;
public int getS_id() {
    return s_id;
}
public void setS_id(int s_id) {
    this.s_id = s_id;
}
public String getS_name() {
    return s_name;
}
public void setS_name(String s_name) {
    this.s_name = s_name;
}
public String getS_reg() {
    return s_reg;
}
public void setS_reg(String s_reg) {
    this.s_reg = s_reg;
}
public String getPhone_No() {
    return phone_No;
}
public void setPhone_No(String phone_No) {
    this.phone_No = phone_No;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}



}
