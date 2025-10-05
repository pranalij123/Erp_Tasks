package com.erp.Day_3.repository;

import com.erp.Day_3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
