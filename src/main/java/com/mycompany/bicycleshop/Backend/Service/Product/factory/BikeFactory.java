/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Service.Product.factory;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Constraint.Constraint;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Exception.InvalidBikeException;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Exception.ShopException;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Part.Part;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Product.Product;
import com.mycompany.bicycleshop.Backend.Model.BikeModel.Part.BikePart;
import com.mycompany.bicycleshop.Backend.Model.BikeModel.Product.BikeProductImpl;
import com.mycompany.bicycleshop.Backend.Persistence.Repositories.ConstraintRepository;
import com.mycompany.bicycleshop.Backend.Persistence.Repositories.ProductRepository;
import com.mycompany.bicycleshop.Backend.Service.Product.factory.Pricing.PriceCalculator;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author arbe
 */
public class BikeFactory implements ProductFactory<BikePart>{
    
    private ConstraintRepository constraintRepository;
    private PriceCalculator priceCalculator;
    private ProductRepository productRepository;

    public BikeFactory(ConstraintRepository constraintRepository, 
            PriceCalculator priceCalculator, ProductRepository productRepository) {
        this.constraintRepository = constraintRepository;
        this.priceCalculator = priceCalculator;
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(List<BikePart> parts) throws ShopException {
        if(!arePartsValid(parts)){
            throw new InvalidBikeException();
        }
        
        BigDecimal price = priceCalculator.calculatePrice(parts);
        
        //cheating here, the Id should be the database key. Not using real name and descriptions also because lack of time
        BikeProductImpl newProduct =  new BikeProductImpl(1L, "fakeName", "fakeDescription", parts, price);
        productRepository.store(newProduct);
        return newProduct;
        
    }

    @Override
    public boolean isValidProduct(List<BikePart> parts) {
        return arePartsValid(parts);
    }
    
    
    //It's inneficient, but I didn't have much time XD
    private boolean arePartsValid(List<BikePart> parts){
        for(Part part: parts){
            if (!(part instanceof BikePart)){
                return false;
                }  
            List<Constraint> constraints = constraintRepository.getConstraintsByPart(part);
            for(Constraint constraint: constraints){
                List<Part> prohibitedParts = constraint.getParts();
                for(Part prohibitedPart: prohibitedParts){
                    if(parts.contains(prohibitedPart) && !prohibitedPart.equals(part)){
                        return false;
                    }
                }
            }
                
        }
        return true;
        
    }
    

    
}
