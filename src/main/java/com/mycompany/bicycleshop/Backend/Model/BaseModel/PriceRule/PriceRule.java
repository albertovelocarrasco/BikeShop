/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Model.BaseModel.PriceRule;

import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author arbe
 */
public interface PriceRule<Part> {
    @NotNull Long getId();
    @NotNull String getDescription();
    @NotNull BigDecimal getPriceModifier();
    @NotNull List<Part> getParts();
}

