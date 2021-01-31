package com.julia;

public class FirstTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.show();
    }
}

class Cat {
    void show() {
        System.out.println("Cat");
    }
}
