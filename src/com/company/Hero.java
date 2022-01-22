package com.company;

public class Hero {
    private int Health;
    private int Damage;
    private String Magical;

    public Hero(int health, int damage) {
        Health = health;
        Damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getMagical() {
        return Magical;
    }

    public Hero(int health, int damage, String magical) {
        Health = health;
        Damage = damage;
        Magical = magical;
    }
}

