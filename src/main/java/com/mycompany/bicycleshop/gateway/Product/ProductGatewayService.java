/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.gateway.Product;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Constraint.Constraint;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Part.Part;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.PriceRule.PriceRule;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Product.Product;
import java.util.List;

/**
 *
 * @author arbe
 */
public interface ProductGatewayService {
    //for customer focused logic
    public List<Part> getParts();
    public Product createProduct(List<Part> parts);
    
    //for Admin focused logic
    public void addPart(Part part);
    public void addConstraint(Part part, Constraint constraint);
    public void addPriceRule(List<Part> parts, PriceRule rule);
}
