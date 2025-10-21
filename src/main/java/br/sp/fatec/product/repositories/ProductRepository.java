package br.sp.fatec.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.sp.fatec.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
