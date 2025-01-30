/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandowirtz.reportsexample.dao;

/**
 *
 * @author hector.garaboacasas
 */
public class Customer {
    private int id;
    private String firstName;
    private String email;

    public Customer(int id, String firstName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
    }
    
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        // Este método define cómo se mostrará en la lista
        return firstName + " - " + email;
    }
}

