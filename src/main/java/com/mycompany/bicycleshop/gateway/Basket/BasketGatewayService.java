/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.gateway.Basket;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Basket.Basket;

/**
 *
 * @author arbe
 */
public interface BasketGatewayService {
    public Basket CreateBasket();
    public void deleteBasket(Basket basket);
}
