/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Model.BikeModel.Product;
import com.mycompany.bicycleshop.Backend.Model.BikeModel.Part.BikePart;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author arbe
 */
public class BikeProductImpl implements BikeProduct {
    private final Long id;
    private final String name;
    private final String description;
    private final List<BikePart> parts; 
    private final BigDecimal price;

    @Override
    public @NotNull Long getId() {
        return id; 
    }

    @Override
    public @NotNull String getName() {
        return name;
    }
    
    @Override
    public @NotNull String getDescription() {
        return description;
    }
        
    @Override
    public @NotNull List<BikePart> getParts() {
        return parts;
    }
    
    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public BikeProductImpl(@NotNull Long id,@NotNull String name,@NotNull String description,@NotNull List<BikePart> parts,@NotNull BigDecimal price ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.parts = parts;
        this.price = price;
    }

    
    
    
}
