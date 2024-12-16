/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Model.BikeModel.Constraint;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Constraint.Constraint;
import com.mycompany.bicycleshop.Backend.Model.BikeModel.Part.BikePart;
import java.util.List;

/**
 *
 * @author arbe
 */
public interface BikeConstraint extends Constraint<BikePart> {

    @Override
    public boolean isValid(List<BikePart> selectedParts);

    @Override
    public List<BikePart> getParts();
    
}
