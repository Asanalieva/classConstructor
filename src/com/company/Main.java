package com.company;

public class Main {

    public static void main(String[] args) {

        Class classes = new Class(26,"Бул класс",new int[]{76,34,56,90});
        System.out.print("Массив: ");
        for (int i : classes.getSan()){
            System.out.print(i + " ");
        }
        System.out.println("Номер: " + classes.getNumber() + " " + classes.getSoz());
    }
}
