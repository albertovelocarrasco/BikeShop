/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Service.Customer;

import com.mycompany.bicycleshop.Backend.Model.BaseModel.Customer.Customer;

/**
 *
 * @author arbe
 */
public interface CustomerService {
    public void createCustomer(Customer customer);
    public Customer getCustomer(String email, String token);
    public void updateCustomer(Customer customer);
}
