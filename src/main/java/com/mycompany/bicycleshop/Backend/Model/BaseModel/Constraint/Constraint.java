/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Model.BaseModel.Constraint;

import java.util.List;

/**
 *
 * @author arbe
 */
public interface Constraint<Part> {
    List<Part> getParts();
    void setConstraintType(ConstraintType constraintType);
    String getDescription(); 
    boolean isValid(List<Part> selectedParts);
    public enum ConstraintType {PROHIBITED, REQUIRES}
}
