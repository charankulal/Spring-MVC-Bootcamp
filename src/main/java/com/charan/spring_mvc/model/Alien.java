package com.charan.spring_mvc.model;

public class Alien {
    private int aid;
    private String name;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "aid=" + aid +
                ", name='" + name + '\'';
    }
}
