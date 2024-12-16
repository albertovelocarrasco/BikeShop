/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Persistence;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Basket.Basket;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Constraint.Constraint;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Order.Order;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Part.Part;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.PriceRule.PriceRule;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Product.Product;
import java.util.List;

/**
 *
 * @author arbe
 */
public interface Repositories {

    
public interface ProductRepository extends Repository<Product> {}



public interface PartRepository extends Repository<Part> {}


public interface ConstraintRepository extends Repository<Constraint> {

    public List<Constraint> getConstraintsByPart(Part part);
    
}


public interface PricingRuleRepository extends Repository<PriceRule> {

    public List<PriceRule> getPriceRulesByPart(Part part);}


public interface OrderRepository extends Repository<Order> {}


public interface BasketRepository extends Repository<Basket> {}

}
