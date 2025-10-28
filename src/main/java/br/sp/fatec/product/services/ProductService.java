package br.sp.fatec.product.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.sp.fatec.product.entities.Product;
import br.sp.fatec.product.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<Product>getProducts(){
        return repository.findAll();
    }

    public Product getProductById(long id){
        return repository.findById(id)
                         .orElseThrow( ()-> new EntityNotFoundException("Produto não cadastrado"));
    }
    public void deleteProductById(long id){
		if(repository.existsById(id))
			repository.deleteById(id);
		else
			throw new EntityNotFoundException("Produto não existe");
    }
    public Product saveProduct(Product product){
        return repository.save(product);
    }
}