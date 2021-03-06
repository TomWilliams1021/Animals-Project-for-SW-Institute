package com.Animals.Mammals;

import com.Animals.Animals;

public abstract class Mammal extends Animals {
    ////Attributes////
    private int size = 12;

    ////Constructors////

    ////Methods////
    public String Breathe(){
        return "I am breathing";
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public abstract Mammal reproduce();
}
