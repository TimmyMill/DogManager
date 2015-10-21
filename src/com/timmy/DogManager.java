package com.timmy;
import java.util.ArrayList;
import java.util.Scanner;
import static com.timmy.Dog.makeSchedule;
import static com.timmy.Dog.printMenu;

public class DogManager {

    public static ArrayList<Dog> objectList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice;
        int[] walk;
        choice = printMenu();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        while (choice != 4) {
            if (choice == 1) {
                System.out.println("Enter name of dog: ");
                String dogName = scan.nextLine();
                System.out.println("Enter name of owner: ");
                String nameOfOwner = scan.nextLine();
                System.out.println("Enter home address of client: ");
                String address = scan.nextLine();

                Dog dog = new Dog(dogName, nameOfOwner, address);
                walk = dog.getDaysToWalk();
                makeSchedule(walk);
                choice = printMenu();

            } else if (choice == 2) {
                for (Dog dogs : objectList) {
                    System.out.println(dogs.toString());
//                    walk = dog.getDaysToWalk();
//                    Dog.printSchedule(walk, days);
                }

                choice = printMenu();
            } else if (choice == 3) {
                for (int i = 0; i < days.length ; i++) {
                    System.out.println(days[i]);
                    for (Dog list : DogManager.objectList) {
                        System.out.println("walk" + list);
                        System.out.println(list.daysToWalk[i] +"times.");
                    }
                }
                choice = printMenu();
            }
            else {
                System.out.println("Exiting program.");
            }
        }
    }
}