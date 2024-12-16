/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Model.BaseModel.Product;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Part.Part;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author arbe
 */
public interface Product<Part> {
    @NotNull Long getId();
    @NotNull String getName();
    @NotNull String getDescription();
    @NotNull List<Part> getParts();
    @NotNull BigDecimal getPrice();
}
