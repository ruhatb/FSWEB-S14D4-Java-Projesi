package com.rpg;

public class Scorpion extends Monster implements Posinable{
    public Scorpion(String name, int hitPoint, double damage) {
        super(name, hitPoint, damage);
    }

    @Override
    public double attack() {
        return getDamage() + 2*posion();
    }

    @Override
    public double posion() {
        return getDamage() + posion();
    }
}
