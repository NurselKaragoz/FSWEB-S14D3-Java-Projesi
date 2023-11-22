package com.workintech.car;

import java.util.Objects;

public class Car {
   private boolean engine ;

    private int cylinders;

  private String name;

  private int wheels ;
  public void startEngine(){
      System.out.println("The car's engine is starting"+ getClass().getSimpleName());

  }
  public void accelerate(){
      System.out.println("the car is accelerating"+getClass().getSimpleName());
  }
  public void brake(){
      System.out.println("the car is braking"+getClass().getSimpleName());
  }

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine= true;
        this.wheels=4;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return  cylinders == car.cylinders && Objects.equals(name, car.name);
    }


}
