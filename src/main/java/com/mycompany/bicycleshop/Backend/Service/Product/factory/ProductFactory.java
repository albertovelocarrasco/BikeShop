/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Service.Product.factory;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Exception.ShopException;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Part.Part;
import com.mycompany.bicycleshop.Backend.Model.BaseModel.Product.Product;
import java.util.List;

/**
 *
 * @author arbe
 */
public interface ProductFactory<Part> {
    public Product createProduct(List<Part> parts) throws ShopException;
    public boolean isValidProduct(List<Part> parts);
}
