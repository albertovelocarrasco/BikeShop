/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Service.Part;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Constraint.Constraint;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Part.Part;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.PriceRule.PriceRule;
import java.util.List;

/**
 *
 * @author arbe
 */
public interface PartService {
    public void createPart(Part part);
    public void addPriceRules(List<PriceRule> priceRules);
    public void addConstraints(List<Constraint> constraints);
    public Part getPart(Long id);
    public List<Part> getParts();
}
