/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bicycleshop.Backend.Persistence;

import java.util.List;

/**
 *
 * @author arbe
 */
public interface Repository<T> {
    public T getByID(Long id);
    public void store(T entity);
    public void store(List<T> entities);
    public List<T> getAll();
}
