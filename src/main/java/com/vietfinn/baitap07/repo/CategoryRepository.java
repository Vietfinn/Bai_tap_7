package com.vietfinn.baitap07.repo;

import com.vietfinn.baitap07.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> { }