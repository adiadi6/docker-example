package com.master.master_service.module;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Location {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id_loc")
	private int idLoc;
     @Basic
     @Column(name="nm_loc")
	private String nmLoc;
     @Basic
     @Column(name="cd_loc")
	private String cdLoc;
    public int getIdLoc() {
        return idLoc;
    }
    public void setIdLoc(int idLoc) {
        this.idLoc = idLoc;
    }
    public String getNmLoc() {
        return nmLoc;
    }
    public void setNmLoc(String nmLoc) {
        this.nmLoc = nmLoc;
    }
    public String getCdLoc() {
        return cdLoc;
    }
    public void setCdLoc(String cdLoc) {
        this.cdLoc = cdLoc;
    }
    
}
