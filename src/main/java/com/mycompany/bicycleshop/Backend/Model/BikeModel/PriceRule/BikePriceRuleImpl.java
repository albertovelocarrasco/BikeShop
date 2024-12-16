/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Model.BikeModel.PriceRule;

import com.mycompany.bicycleshop.Backend.Model.BikeModel.Part.BikePart;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author arbe
 */
class BikePriceRuleImpl implements BikePriceRule{
    private final @NotNull Long id;
    private final @NotNull String description; // E.g., "Full suspension frame + Matte finish"
    private final @NotNull BigDecimal priceModifier;  
    private final @NotNull List<BikePart> parts;

    @Override
    public @NotNull Long getId() {
        return id;
    }

    @Override
    public @NotNull String getDescription() {
        return description;
    }

    @Override
    public @NotNull BigDecimal getPriceModifier() {
        return priceModifier;
    }
    
    @Override
    public List<BikePart> getParts() {
        return parts;
    }

    public BikePriceRuleImpl(@NotNull Long id, @NotNull String description, @NotNull BigDecimal priceModifier,@NotNull List<BikePart> parts) {
        this.id = id;
        this.description = description;
        this.priceModifier = priceModifier;
        this.parts = parts;
    }

    
    
    
}
