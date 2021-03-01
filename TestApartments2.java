/*
Problem Statement:
Create a class named Apartment that holds an apartment number, number of bedrooms, 
number of baths, and rent amount. Create a constructor that accepts values for each 
data field. Also create a get method for each field. Write an application that 
creates at least five Apartment objects. Then prompt a user to enter a minimum 
number of bedrooms required, a minimum number of baths required, and a maximum 
rent the user is willing to pay. Display data for all the Apartment objects that 
meet the user’s criteria or an appropriate message if no such apartments are 
available. Save the files as Apartment.java and TestApartments.java.
Author: Anderson Turner
Date: 2/25/21
 */
package testapartments;
import java.util.Scanner;
public class TestApartments {

    //The main class
    public static void main(String[] args) {
        //Creating the Apartment objects.
       Apartments Apartment1 = new Apartments(52, 2, 1, 500.00);
       Apartments Apartment2 = new Apartments(37, 1, 1, 250.00);
       Apartments Apartment3 = new Apartments(53, 2, 2, 575.00);
       Apartments Apartment4 = new Apartments(12, 3, 4, 650.00);
       Apartments Apartment5 = new Apartments(7, 4, 3, 615.00);
        
       /*
         Prompting the user to enter the desired amount of bedrooms and bathrooms
         as well as the maximum rent amount that they can pay.
       */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minimum amount of bedrooms you require: ");
        int bedrooms = input.nextInt();
        
        System.out.println("Enter the minimum amount of bathrooms you require: ");
        int bathrooms = input.nextInt();
        
        System.out.println("Enter the maximum amount of rent you can pay: ");
        double rent = input.nextDouble();
        
        int count = 0;
        
        if (apartmentCriterea(Apartment1, bedrooms, bathrooms, rent)){
            count++;
            System.out.println("Looks like we found some matches for you!: ");
            System.out.println("Apmt. number: " +Apartment1.getApmtNumber());
            System.out.println("Bedroom count: " +Apartment1.getBedrooms());
            System.out.println("Bathroom count: " +Apartment1.getBathrooms());
            System.out.println("Rent Amount: " +Apartment1.getRentAmount());
        }
        
        if (apartmentCriterea(Apartment2, bedrooms, bathrooms, rent)){
            count++;
            System.out.println("Looks like we found some matches for you!: ");
            System.out.println("Apmt. number: " +Apartment2.getApmtNumber());
            System.out.println("Bedroom count: " +Apartment2.getBedrooms());
            System.out.println("Bathroom count: " +Apartment2.getBathrooms());
            System.out.println("Rent Amount: " +Apartment2.getRentAmount());
        }
        
        if (apartmentCriterea(Apartment3, bedrooms, bathrooms, rent)){
            count++;
            System.out.println("Looks like we found some matches for you!: ");
            System.out.println("Apmt. number: " +Apartment3.getApmtNumber());
            System.out.println("Bedroom count: " +Apartment3.getBedrooms());
            System.out.println("Bathroom count: " +Apartment3.getBathrooms());
            System.out.println("Rent Amount: " +Apartment3.getRentAmount());
        }
        
        if (apartmentCriterea(Apartment4, bedrooms, bathrooms, rent)){
            count++;
            System.out.println("Looks like we found some matches for you!: ");
            System.out.println("Apmt. number: " +Apartment4.getApmtNumber());
            System.out.println("Bedroom count: " +Apartment4.getBedrooms());
            System.out.println("Bathroom count: " +Apartment4.getBathrooms());
            System.out.println("Rent Amount: " +Apartment4.getRentAmount()+"\n");
        }
        
        if (apartmentCriterea(Apartment5, bedrooms, bathrooms, rent)){
            count++;
            System.out.println("Looks like we found some matches for you!: ");
            System.out.println("Apmt. number: " +Apartment5.getApmtNumber());
            System.out.println("Bedroom count: " +Apartment5.getBedrooms());
            System.out.println("Bathroom count: " +Apartment5.getBathrooms());
            System.out.println("Rent Amount: " +Apartment5.getRentAmount()+"\n");
        }
        
        //Prints if the user input does not meet with any of the available objects.
        if (count == 0) {
            System.out.println("I'm sorry, we cannot find any options to match your criterea.");
        }
    }
        //This method finds an appropriate apartment object based on user input.
    public static boolean apartmentCriterea(Apartments apartmentObject, int userBedroom, int userBathroom, double userRent)
        {
            boolean result = false;
            if ((apartmentObject.getBedrooms() >= userBedroom) && (apartmentObject.getBathrooms() >= userBathroom) && (apartmentObject.getRentAmount() <= userRent)) {
               
                result = true;
            }
                return result;
        }
}
