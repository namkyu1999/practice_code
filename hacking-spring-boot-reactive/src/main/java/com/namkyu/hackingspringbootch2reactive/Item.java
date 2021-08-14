package com.namkyu.hackingspringbootch2reactive;

import org.springframework.data.annotation.Id;

public class Item{

    private @Id String id;
    private String name;
    private double price;
    private String description;

    private Item(){}

    Item(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}