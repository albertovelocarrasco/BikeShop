/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.gateway.Basket;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Basket.Basket;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Product.Product;
import java.util.List;

/**
 *
 * @author arbe
 */
public interface BasketGatewayService {
    public Basket CreateBasket(List<Product> product);
    public void deleteBasket(Basket basket);
}
