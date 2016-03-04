/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.desktopapplication.data;

import java.util.List;

/**
 *
 * @author uto
 */
public interface IDataService<T> {
    public T save(T object);
    public T update(T object);
    public Boolean delete(T object);
    public List<T> getAll();
    public T getById(Long Id);
    
    
}
