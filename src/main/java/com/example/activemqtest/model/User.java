package com.example.activemqtest.model;

import java.io.Serializable;

/**
 *
 * @author AJ Catambay of Bridging Code
 *
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "SystemMessage{" +
                "source='" + name + '\'' +
                ", message='" + surname + '\'' +
                '}';
    }
}
