/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicycleshop.gateway.Product;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Constraint.Constraint;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Exception.ShopException;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Part.Part;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.PriceRule.PriceRule;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Product.Product;
import com.mycompany.bicycleshop.Backend.Service.Part.PartService;
import com.mycompany.bicycleshop.Backend.Service.Product.ProductService;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arbe
 */
public class ProductGatewayServiceImpl implements ProductGatewayService {
    
    private ProductService productService;
    private PartService partService;

    public ProductGatewayServiceImpl(ProductService productService, PartService partService) {
        this.productService = productService;
        this.partService = partService;
    }

    @Override
    public List<Part> getParts() {
        return partService.getParts();
    }

    @Override
    public Product createProduct(List<Part> parts) {
       
        Product product = null;
        try {
            product = productService.createProduct(parts);
        } catch (ShopException ex) {
            Logger.getLogger(ProductGatewayServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            // We could add here localisation for the error message coming from the backend, so the frontends would always receive translated strings
        }
        
      
        return product;
        
    }

    @Override
    public boolean validateProduct(List<Part> parts) {
        return productService.validateProduct(parts);
    }

    @Override
    public void addPart(Part part) {
        partService.createPart(part);
    }

    @Override
    public void addConstraint(Part part, Constraint constraint) {
        partService.addConstraints(Arrays.asList(constraint));
        
    }

    @Override
    public void addPriceRule(List<Part> parts, PriceRule rule) {
        partService.addPriceRules(Arrays.asList(rule));
        
    }
    
    
}
