package com.product;

public class Bread extends ProductForSale{
    private String color;
    private String shape;

    public Bread(String type, double price, String description, String color, String shape) {
        super(type, price, description);
        this.color = color;
        this.shape = shape;
    }

    @java.lang.Override
    public String toString() {
        return "Bread{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }

    @Override
    public void ShowDetails() {
        System.out.println(super.toString() + toString());
    }

}
