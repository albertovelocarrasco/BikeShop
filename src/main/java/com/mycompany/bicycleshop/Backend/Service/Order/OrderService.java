/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Service.Order;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Basket.Basket;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Order.Order;

/**
 *
 * @author arbe
 */
public interface OrderService {
    public Order createOrder(Basket basket);
    public void payOrder(Order order);//savce for later 
}
