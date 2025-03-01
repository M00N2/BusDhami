/*
Name: Karan Dhami
Date: 3/3/25
self grade based on the given requirmnets and the correctness of the output
Testimony:  I didn't cheat

Your code must genearte a very similar output. Make sure create your own list of the passengers.
Do not copy the given passengers. The driver ahs 20 points. Any copy from the sample output will cause losing points
*/

interface List
{
    void add(Object o);//adds a passenger to the end of the list

    void delete(String first, String last);// delete a passenger from the list

    void print(String latsName);//prints all the passengeres with the same last name

    boolean search(String first, String last);//search for a particular passenger with the given first and last name

    boolean isFull();//returns true if the buss is full, meaning all the eats are taken
}

public class BusDhami
{
    //no code here
}

/*The person class is complete and there is no need to add any code to it*/
class Person
{
    private String first;
    private String last;
    private String phone;
    private String email;
    private String id;

    public Person(String first, String last, String phone, String email, String id)
    {
        this.first = first;
        this.last = last;
        this.phone = phone;
        this.email = email;
        this.id = id;
    }

    public String getFirst()
    {
        return first;
    } // getter

    public void setFirst(String newFirst)
    {
        first = newFirst;
    } // setter

    public String getLast()
    {
        return last;
    }

    public void setLast(String newLast)
    {
        last = newLast;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String newPhone)
    {
        phone = newPhone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String newEmail)
    {
        email = newEmail;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String newId)
    {
        id = newId;
    }

    public String toString()
    {
        return "first: " + first + ",last =  " + last + ",phone= " + phone + ",email= " + email + " ID = " + id;
    }

    public boolean equals(Object o)
    {
        if (o instanceof Person) return this.id.equalsIgnoreCase(((Person) o).id);
        else return false;
    }

}

/*
Passenger class extends the person class. every passenger has row number, seat number, number of luggeges

*/
class Passenger extends Person // getting attributes of person and using them in Passanger class//extends Person    Must make sure that passenger class extends Person class
{


    public Passenger(String first, String last, String phone, String email, String id)
    {
        super(first, last, phone, email, id); // super means grabbing from parent class and being able to use them in passanger class
    }
}

/*Compelet code is given No need to add any code*/
class Vehicle
{
    private String plateNumber;
    private String make;
    private String model;
    private String fuelType;
    private boolean isElectric;

    public Vehicle(String plateNumber, String make, String model, String fuelType, boolean isElectric)
    {
        this.plateNumber = plateNumber;
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.isElectric = isElectric;

    }

    public boolean getElectric()
    {
        return isElectric;
    }

    public void setElectric(boolean electric)
    {
        isElectric = electric;
    }

    public String getPlane()
    {
        return plateNumber;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String newModel)
    {
        model = newModel;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String newMake)
    {
        make = newMake;
    }

    public String fuelType()
    {
        return fuelType;
    }

    public void setPlate(String newPlate)
    {
        plateNumber = newPlate;
    }

    public void setFuel(String newFuel)
    {
        fuelType = newFuel;
    }

    public String toString()

    {
        String s = "Yes";
        if (!isElectric) s = " No";

        return "Make= " + make + " , Model = " + model + "Plate= " + plateNumber + "Fuel type = " + fuelType + "Electric: " + s;
    }

    public boolean equals(Object o)
    {
        if (o instanceof Vehicle v) {
            return this.plateNumber.equalsIgnoreCase(v.plateNumber);
        }
        return false;
    }

}

class Bus extends Vehicle // getting attributes from Vehicle class and using them in Bus Class//extends Vehicle  implements List  : must make sure that passenger inmplements the List
{
    public Bus(String plateNumber, String make, String model, String fuelType, boolean isElectric)
    {
        super(plateNumber, make, model, fuelType, isElectric); // super means grabbing from parent class Vehicle
    }
    //declare all the instance variables


    // create the constructor


    //create the getter methods


    //implemenbt all the methods listed in the List interface


}

class Driver
{
    public static void main(String[] args)
    {

        //create a Bus object


        //call the setDriver method to set the driver for the bus

        //create 10 passengers of your choice. be sure to create some passengers with the same last name


        //call the add method to add each passenger to the bus


        //test toString method from the Bus class


        //call seatsLeft method

        //call print method to print the list of the passengers with the same last name

        //call the seach method to search for a particular passenger in the Bus

        //call delete method to delete a passenger of your choice from the list

        //call the desitiantion of the bus

        //call the origion of the bus

        //call the tostring method


    }
}