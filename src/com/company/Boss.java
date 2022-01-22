package com.company;

public class Boss {
    private int BossHealth;
    private int BossDamage;
    private String BossDefenceType;

    public int getBossHealth() {
        return BossHealth;
    }

    public void setBossHealth(int bossHealth) {
        BossHealth = bossHealth;
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public String getBossDefenceType() {
        return BossDefenceType;
    }

    public void setBossDefenceType(String bossDefenceType) {
        BossDefenceType = bossDefenceType;
    }
}
