package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Ulitka";
        names[1] = "Kasya";
        names[2] = "Kanya";
        switch (names[0]) {
            case "Ulitka":
                System.out.println("Доброе утро" + "!");
                break;
            case "Kasya":
                System.out.println("Добрый день" + "!");
                break;
            case "Kanya":
                System.out.println("Добрый вечер" + "!");
                break;
        }
        System.out.println(names[0]);


      /*  String[] names = {"Ulitka", "Kasya", "Kanya"};
        switch (names[2]) {
            case "Ulitka":
                System.out.println("Доброе утро" + "!");
                break;
            case "Kasya":
                System.out.println("Добрый день" + "!");
                break;
            case "Kanya":
                System.out.println("Добрый вечер" + "!");
                break; не нужно проверять*/

    }

}


