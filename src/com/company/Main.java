package com.company;

public class Main {

    public static void main(String[] args) {
	Dodge dodge=new Dodge("3123","red");
	dodge.startTheCar();
	dodge.first();
	dodge.tapToTheGas();
	dodge.second();
	dodge.third();
	dodge.fifth();
	dodge.forth();
	dodge.fifth();
	dodge.tapToTheBrake();
	dodge.transferR();
	dodge.tapToTheGas();

	Toyota_Kluger Kluger=new Toyota_Kluger("3939","white");
	Kluger.tapToTheGas();
	Kluger.startTheCar();
	Kluger.D();
	Kluger.tapToTheGas();
	Kluger.N();
	Kluger.tapToTheGas();
	Kluger.transferR();
	Kluger.tapToTheGas();
	Kluger.tapToTheBrake();
    }
}
