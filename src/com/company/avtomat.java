package com.company;


public class avtomat extends Car implements avtoTransfers{
    private int transfer=2;// переменная для передач машины
                           // 0 - R
                           // 1 - D
                           // 2 - N
    avtomat(String number, String color){
        this.color=color;
        this.number=number;
    }

    @Override
    public void transferR() {
        this.transfer=0;
        System.out.println("Передача R");
    }

    @Override
    public void D() {
        this.transfer=1;
        System.out.println("Передача D");
    }

    @Override
    public void N() {
        this.transfer=2;
        System.out.println("Передача N");
    }

    @Override
    public void tapToTheGas() {
        if (this.start){ // для того чтобы нажать на газ машина должна быть заведена
            // в зависимости от передач машина будет ехать вперед, назад или стоять на месте
            if (this.transfer==2){
                System.out.println("Машине в нейтральном состоянии");
            }
            else if (this.transfer==1){
                System.out.println("Вы поехали");
            }
            else if (this.transfer==0){
                System.out.println("Вы поехали назад");
            }
        }
        else {
            System.out.println("Заведите машину");
        }
    }

    @Override
    public void tapToTheBrake() {
        System.out.println("Вы остановились");
    }

    @Override
    public void startTheCar() {
        this.start=true;
        System.out.println("Машина заведена");
    }
}
