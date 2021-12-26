package com.startjava.lesson_2_3_4.robot;

class Jaeger {
    private String modelName;
    private String mark;
    private float height;
    private float weight;
    private int strength;
    private int combat;

    public Jaeger(String modelName, String mark, float height,
            float weight, int strength, int combat) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.combat = combat;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeigh() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getCombat() {
        return combat;
    }

    public void setCombat(int combat) {
        this.combat = combat;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useWeapon() {
        System.out.println("activated");
    }
}