package br.sp.fatec.product.mappers;

import br.sp.fatec.product.dtos.ProductRequest;
import br.sp.fatec.product.dtos.ProductResponse;
import br.sp.fatec.product.entities.Product;

public class ProductMapper {
    public static Product toEntity(ProductRequest request) { // Transforma DTO → Entity
        Product p = new Product();
        p.setName(request.name());
        p.setPrice(request.price());
        p.setDescription(request.description());
        return p;
    }
    public static ProductResponse toDTO(Product product) {
         return new ProductResponse(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getPrice()
         );
    }
}