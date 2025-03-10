package com.banking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.model.Branch;

@Repository
public interface BranchDao extends JpaRepository<Branch, Integer> {

}
