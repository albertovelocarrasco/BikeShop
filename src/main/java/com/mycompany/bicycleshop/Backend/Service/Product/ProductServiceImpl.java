/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Service.Product;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Exception.ShopException;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Part.Part;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Product.Product;
import com.mycompany.bicycleshop.Backend.Persistence.Repositories.ProductRepository;
import com.mycompany.bicycleshop.Backend.Service.Product.factory.ProductFactory;
import java.util.List;

/**
 *
 * @author arbe
 */
public class ProductServiceImpl implements ProductService {
    
    
    private ProductRepository productRepository;
    private ProductFactory productFactory;

    public ProductServiceImpl(ProductRepository productRepository, ProductFactory productFactory) {
        this.productRepository = productRepository;
        this.productFactory = productFactory;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.getByID(id);
    }

    @Override
    public Product createProduct(List<Part> parts) throws ShopException{
        return productFactory.createProduct(parts);
    }

    @Override
    public void updateProduct(Product product) {
       // todo
    }

    @Override
    public boolean validateProduct(List<Part> parts) {
        return productFactory.isValidProduct(parts);
    }

    
}
