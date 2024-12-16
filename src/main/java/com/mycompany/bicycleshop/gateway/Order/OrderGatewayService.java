/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.gateway.Order;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Basket.Basket;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Order.Order;

/**
 *
 * @author arbe
 */
public interface OrderGatewayService {
    public Order createOrder(Basket basket);
    //would add payment method as params, and tokens to identify customer
    public void pay(Order order);
}
