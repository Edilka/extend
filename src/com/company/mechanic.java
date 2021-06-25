package com.company;

public class mechanic extends Car implements mechanicTransfers{
    private int transfer=0;// переменная для передач (0=R)
    private boolean tappedGas=false;// переменая для того чотбы узнать нажат ли газ
    mechanic(String number, String color) {
        this.number=number;
        this.color=color;
    }
    @Override
    public void startTheCar() {
        System.out.println("Вы завели машину");// для того чтобы начать движение нужно завести машину
        this.start=true;
    }

    @Override
    public void transferR() {
        if (!this.tappedGas){
            System.out.println("Остановите машину"); // для переключения на R нужно сначала остановиться
        }
        else if (this.start){
            System.out.println("Вы переключили на R");
            this.transfer=0;
        }
        else {
            System.out.println("Машина не заведена");
        }
    }

    @Override
    public void first() {
        if (this.start){
            System.out.println("Первая передача");
            this.transfer=1;
        }
        else{
            System.out.println("Заведите машину");
        }
    }

    @Override
    public void second() {
        if ((this.transfer!=0)&&(this.tappedGas)){
            System.out.println("Вторая передача"); // чтобы переключиться на вторую передачу сначала надо
            this.transfer=2;                       // переключиться на первую и поехать
        }
        else {
            System.out.println("Сначала поставьте на первую передачу и нажмите на газ");
        }
    }
    // для того чтобы переключиться на остальные передачи нужно для начала переключить на предыдущую передачу
    @Override
    public void third() {
        if ((this.transfer!=1)||(this.transfer!=0)){
            System.out.println("Третья передача");
            this.transfer=3;
        }
        else{
            System.out.println("Сначала поставьте на вторую передачу");
        }
    }

    @Override
    public void forth() {
        if ((this.transfer!=1)||(this.transfer!=0)||(this.transfer!=2)){
            System.out.println("Четвертая передача");
            this.transfer=4;
        }
        else{
            System.out.println("Сначала поставьте на третью передачу");
        }
    }

    @Override
    public void fifth() {
        if ((this.transfer==5)||(this.transfer==4)){
            System.out.println("Пятая передача");
            this.transfer=5;
        }
        else{
            System.out.println("Сначала поставьте на четвертую передачу");
        }
    }

    @Override
    public void tapToTheGas() {
        if (this.transfer==1){
            System.out.println("Вы поехали");
            this.tappedGas=true;
        }
        else if (this.transfer==0){
            System.out.println("Вы поехали назад");
        }
        else if ((this.transfer!=1)||(this.transfer!=0)){
            System.out.println("Вы уже едите");
        }
        else {
            System.out.println("Поставьте на первую передачу");
        }
    }

    @Override
    public void tapToTheBrake() {
        this.transfer=0;
        this.tappedGas=false;
        System.out.println("Вы остановились");
    }
}
