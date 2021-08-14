package com.namkyu.hackingspringbootch2reactive;

class CartItem {
    private Item item;
    private int quantity;

    private CartItem(){}

    CartItem(Item item){
        this.item = item;
        this.quantity = 1;
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }
    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }
    public void increment(){
        this.quantity ++;
    }
    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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