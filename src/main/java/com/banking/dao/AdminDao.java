package com.banking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.model.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer>{
	Admin findByUserIdandPassword(String userId, String password);

}
