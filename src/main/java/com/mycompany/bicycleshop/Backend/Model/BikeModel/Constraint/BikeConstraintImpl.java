/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Model.BikeModel.Constraint;

import com.mycompany.bicycleshop.Backend.Model.BikeModel.Part.BikePart;
import java.util.List;

/**
 *
 * @author arbe
 */
public class BikeConstraintImpl implements BikeConstraint {

    public List<BikePart> parts;
    public ConstraintType type;
    public String description;
    
    
    @Override
    public boolean isValid(List<BikePart> selectedParts) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<BikePart> getParts() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setConstraintType(ConstraintType constraintType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
