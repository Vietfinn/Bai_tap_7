package com.vietfinn.baitap07.repo;

import com.vietfinn.baitap07.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }