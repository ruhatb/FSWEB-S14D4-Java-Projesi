package com.rpg;

public class WereWolf extends Monster implements Bleedable{

    public WereWolf(String name, int hitPoint, double damage) {
        super(name, hitPoint, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }



    @Override
    public double bleed() {
        return getDamage()*0.25 ;
    }
}
