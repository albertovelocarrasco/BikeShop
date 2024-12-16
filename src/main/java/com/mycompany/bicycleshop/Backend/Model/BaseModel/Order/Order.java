/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Model.BaseModel.Order;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Product.Product;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author arbe
 */
public interface Order {
    public Long getId();
    public List<Product> getProducts();
    public BigDecimal getPrice();
}
