package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly ob = new RWOnly();
//        ob.name = "Bhagyesh";
//        System.out.print(ob.name);
        // Error: 'name' has private access in 'com.driver.RWOnly'

        ob.setName("Bhagyesh");
        System.out.print(ob.getName());
    }
}