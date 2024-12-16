/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Service.Basket;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Basket.Basket;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Product.Product;
import java.util.List;

/**
 *
 * @author arbe
 */
public interface BasketService {
    public Basket createBasket(List<Product> products, Long CustomerId);
    public Basket getBasketById(Long id, Long CustomerId);
}
