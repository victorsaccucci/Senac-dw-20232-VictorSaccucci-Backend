package com.victorsaccucci.Senacdw20232VictorSaccucciBackend.reporsitory;

import com.victorsaccucci.Senacdw20232VictorSaccucciBackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
