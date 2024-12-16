/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Model.BaseModel.Part;
import java.util.Map;

/**
 *
 * @author arbe
 */
public interface Part {
    Long getId();
    String getName();
    Map<String, String> getAttributes();
    StockStatus getStockStatus();
    
    public enum StockStatus{IN_STOCK, OUT_OF,STOCK};
}
