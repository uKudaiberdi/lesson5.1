package com.company;

public class Main {

    public static void main(String[] args) {
        Boss Boss = new Boss();
        Boss.setBossDefenceType("Magical");
        Boss.setBossHealth(700);
        Boss.setBossDamage(200);
        System.out.println("Boss" + "  " +  Boss.getBossHealth() + "   " + "Damage" + "   " +  Boss.getBossDamage() + "   " + "DefenType" +  "  " +  Boss.getBossDefenceType());
        Hero[] dada = createHeroes();
        for (Hero hero : dada
             ) {
            System.out.println(hero.getHealth() + "  " + hero.getDamage() + "  " + hero.getMagical());

        }
    }
        public static Hero[] createHeroes () {
        Hero hulk = new Hero(500,140,"Physical");
        Hero turtule = new Hero(400,100,"Magical");
        Hero gg = new Hero(500,170);
        Hero[] dada = {hulk,turtule,gg};
        return dada;
    }
    }

