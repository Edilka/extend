package com.company;

public abstract class Car implements startTheCar, transfer_R, tapToThe {
    // машины делятся на два класса
    // на автоматической коробке передач (avtomat)
    // и на механической коробке передач (mechanic
    // в зависимости от этого определенные машины наследуют один или сразу два вида коробок передач
    protected String number;
    protected String color;
    public boolean start=false;
    void Car(String number, String color) {
        this.number=number;
        this.color=color;
    }
}
