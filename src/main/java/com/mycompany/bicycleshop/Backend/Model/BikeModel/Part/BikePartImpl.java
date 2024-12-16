/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Model.BikeModel.Part;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author arbe
 */


public class BikePartImpl implements BikePart{
    
    public @NotNull Long id;
    public @NotNull String name;
    public @NotNull Map<String, String> attributes; 
    public @NotNull StockStatus stockStatus; 

    @Override
    public @NotNull Long getId() {
        return id; 
    }

    @Override
    public @NotNull String getName() {
        return name;
    }

    @Override
    public @NotNull StockStatus getStockStatus() {
        return stockStatus;
    }

    @Override
    public Map<String, String> getAttributes() {
        return attributes;
    }

   
}
