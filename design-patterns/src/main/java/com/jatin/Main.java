package com.jatin;

public class Main {
    public static void main(String[] args) {
        A obj = A.builder()
                .num1(10)
                .num2(20)
                .build();
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
