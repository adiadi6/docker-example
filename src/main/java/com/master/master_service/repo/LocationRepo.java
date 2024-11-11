package com.master.master_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.master_service.module.Location;

public interface LocationRepo extends JpaRepository<Location, Integer> {
    
}
