package com.unicaes.ProductAPI.repository;


import com.unicaes.ProductAPI.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
