package com.product;

public class Coke extends ProductForSale{

    private String size;
    private boolean diet;
    public Coke(String type, double price, String description, String size, boolean diet) {
        super(type, price, description);
        this.diet=diet;
        this.size=size;
    }

    @java.lang.Override
    public void ShowDetails() {
        System.out.println(super.toString() + toString());
    }

    @java.lang.Override
    public String toString() {
        return "Coke{" +
                "size='" + size + '\'' +
                ", diet=" + diet +
                '}';
    }
}
