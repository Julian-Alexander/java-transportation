package com.lambdaschool;

import java.util.ArrayList;

public class Main
{
    public static void printVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester)
    {
        for (AbstractVehicle v : vehicles)
        {
            if (tester.test(v))
            {
                System.out.println(v.getName());
            }
        }
    }

    public static void main(String[] args)
    {
        Horse epona = new Horse("Epona",10);
        Horse bojack = new Horse("Bojack");
        Horse secretariat = new Horse("Secretariat");

        System.out.println("\n***Horses***");
        epona.eat(2);
        bojack.eat(2);
        secretariat.eat(2);
        bojack.move();
        bojack.move();
        epona.move();
        System.out.println("Bojack's fuel level " + bojack.getFuelLevel());

        HorseFromVehicle affirmed =  new HorseFromVehicle("Affirmed", 10);

        ArrayList<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();
        myList.add(new HorseFromVehicle("Seabiscuit"));
        myList.add(new HorseFromVehicle("Eclipse"));
        myList.add(new HorseFromVehicle("Trigger"));
        myList.add(new HorseFromVehicle("Seattle Sew"));
        myList.add(new HorseFromVehicle("American Pharaoh"));
        myList.add(new Auto("VW", 10));
        myList.add(new Auto("BMW", 10));
        myList.add(new Auto("Tesla", 25));

        // list all vehicles with fuel greater than 5
        // Lambda Expression
        System.out.println("\n***Fuel higher than 5***");
        printVehicles(myList, v -> v.getFuelLevel() > 5);

        System.out.println("\n***Grass***");
        printVehicles(myList, v -> v.getPath().equals("Grass"));
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));

        System.out.println("\n***Road***");
        printVehicles(myList, v -> v.getPath().equals("Road"));

        System.out.println("\n***Sorted***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach(((v) -> System.out.println(v.getName() + " - " + v.getFuelLevel())));

        System.out.println("\n***Fuel sort High to Low***");
        myList.sort((v1, v2) -> (v2.getFuelLevel() - v1.getFuelLevel()));
        myList.forEach((v) -> System.out.println(v.getFuelLevel()));

        System.out.println("\n Fuel sort Low to High");
        myList.sort((v1, v2) -> (v1.getFuelLevel() - v2.getFuelLevel()));
        myList.forEach((v) -> System.out.println(v.getFuelLevel()));

        System.out.println("\n***Fuel level between 5 and 15***");
        printVehicles(myList, v -> (v.getFuelLevel() > 5) && (v.getFuelLevel() < 15));
        //myList.forEach((v) -> System.out.println(v));

        System.out.println("\n***Alphabetical order***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        printVehicles(myList, v -> (v.getFuelLevel() > 5) && (v.getFuelLevel() < 15));

    }
}
