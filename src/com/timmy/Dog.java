package com.timmy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Dog {

    private String petName;
    private String ownerName;
    public String homeAddress;
    public int[] daysToWalk;
    //build constructor for dog
    public Dog(String dogName, String nameOfOwner, String address){
        DogManager.objectList.add(this);
        this.petName = dogName;
        this.ownerName = nameOfOwner;
        this.homeAddress = address;
        this.daysToWalk = new int [7];
    }
    public static int printMenu() {
        System.out.println("Pet-Walker LLC" + "\n" + "please make a selection below and press enter:");
        System.out.println("(1)Enter new client ");
        System.out.println("(2)View client info ");
        System.out.println("(3)Remove Client ");
        System.out.println("(4)Quit program " + "\n:");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            return Integer.parseInt(in.readLine());
        } catch (IOException e){
            e.printStackTrace();//not sure
            throw new Error("IOException");
        }
    }
    public static void makeSchedule(int[] daysToWalk){
        // days of week array
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many times to walk your dog each day:");
        // parallel array
        for (int i = 0; i < daysToWalk.length ; i++) {
            System.out.println(days[i]);
            daysToWalk[i] = scan.nextInt();
        }
    }
    public static void printSchedule(int[] daysToWalk, String[] days){
        for (int i = 0; i < daysToWalk.length; i++) {
            System.out.println(days[i]);
            System.out.println(daysToWalk[i]);
        }
        System.out.println();
    }
    //  get/set pet name
    public String getPetName(){return  this.petName;}
    public void setPetName(String newPet){this.petName = newPet;}
    // get/set owner info
    public String getOwnerName(){return this.ownerName;}
    public void setOwnerName(String owner){this.ownerName = owner;}
    // get/set address
    public String getHomeAddress(){return  this.homeAddress;}
    public void setHomeAddress(String address){this.homeAddress = address;}
    // get/set for daysToWalk array
    public int[] getDaysToWalk(){ return daysToWalk;}
    public void setDaysToWalk (int[] daysToWalk){ this.daysToWalk = daysToWalk;}

    @Override
    public String toString() {
        return "Pet name: " + this.petName + ", Owner(s): " + this.ownerName + ", Home address: " + this.homeAddress +
                "\nScheduled days to walk: ";
    }

}