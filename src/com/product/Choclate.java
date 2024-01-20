package com.product;

public class Choclate extends ProductForSale{

    private String size;
    private String shape;

    private boolean nuts;

    @Override
    public void ShowDetails() {
      super.toString();
        System.out.println(super.toString() + toString());
    }





    public Choclate(String type, double price, String description, String shape, String size, boolean nuts ) {
        super(type, price, description);
        this.shape=shape;
        this.size=size;
        this.nuts=nuts;
    }

    @java.lang.Override
    public String toString() {
        return "Choclate{" +
                "size='" + size + '\'' +
                ", shape='" + shape + '\'' +
                ", nuts=" + nuts +
                '}';
    }
}
