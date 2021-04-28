package com.SetApp;

public class Object {

    static void string(Car car){
        System.out.println(
                "name "+ car.name+"\n"+
                "model "+ car.model+"\n"+
                "price "+ car.price+"\n"

        );
    }



    public static void main(String[] args) {
        Car cars = new Car();

cars.name="Matiz";
cars.model="2";
cars.price=5000;
        System.out.println(cars.name);
        string(cars);
    }
}
