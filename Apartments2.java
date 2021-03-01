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

public class Apartments {
    //Data types
    private int apmtNumber;
    private int bedrooms;
    private int bathrooms;
    private double rentAmount;
    
        //Creating the constructor
        public Apartments(int apmtNumber, int bedrooms, int bathrooms, 
                double rentAmount){
            this.apmtNumber = apmtNumber;
            this.bedrooms = bedrooms;
            this.bathrooms = bathrooms;
            this.rentAmount = rentAmount;
        }
        
        //Getter methods
        public int getApmtNumber() {
            return apmtNumber;
        }
        public int getBedrooms() {
            return bedrooms;
        }
        public int getBathrooms() {
            return bathrooms;
        }
        public double getRentAmount() {
            return rentAmount;
        }
}
