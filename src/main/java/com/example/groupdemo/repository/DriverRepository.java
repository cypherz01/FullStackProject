package com.example.groupdemo.repository;

import com.example.groupdemo.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long> {

}
