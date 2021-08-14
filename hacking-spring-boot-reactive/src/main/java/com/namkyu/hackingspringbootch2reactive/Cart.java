package com.namkyu.hackingspringbootch2reactive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

class Cart {

    private @Id String id;
    private List<CartItem> cartItems;
    
    private Cart(){}

    public  Cart(String id){
        this(id, new ArrayList<>());
    }

    public Cart(String id, List<CartItem> cartItems){
        this.id = id;
        this.cartItems = cartItems;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the cartItems
     */
    public List<CartItem> getCartItems() {
        return cartItems;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @param cartItems the cartItems to set
     */
    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
    
}