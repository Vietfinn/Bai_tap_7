package com.vietfinn.baitap07.repo;

import com.vietfinn.baitap07.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByOrderByPriceAsc();
    List<Product> findByCategoryId(Long categoryId);
}