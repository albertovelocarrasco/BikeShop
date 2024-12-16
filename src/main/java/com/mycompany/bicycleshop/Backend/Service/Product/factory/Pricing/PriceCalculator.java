/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Service.Product.factory.Pricing;

import com.mycompany.bicycleshop.Backend.Model.BikeModel.Part.BikePart;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author arbe
 */
public interface PriceCalculator {
    public BigDecimal calculatePrice(List<BikePart> parts);
}
