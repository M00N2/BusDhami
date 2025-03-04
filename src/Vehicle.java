class Vehicle
    {//declaring private variables for Vehicle class
    private String plateNumber;
    private String make;
    private String model;
    private String fuelType;
    private boolean isElectric;

    public Vehicle(String plateNumber, String make, String model, String fuelType, boolean isElectric)
        {//constructor
        this.plateNumber = plateNumber;
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.isElectric = isElectric;

        }

    public boolean getElectric()
        {
        return isElectric;
        } //getter

    public void setElectric(boolean electric)
        {
        isElectric = electric;
        } //setter

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
        {// printing out the information of the bus
        String s = "Yes";
        if (!isElectric) s = " No";

        return "Make: " + make + ", Model: " + model + ", Plate: " + plateNumber + ", Fuel type: " + fuelType + ", Electric: " + s + "\n";
        }

    public boolean equals(Object o)//using the interface list to make a conditional change
    {
    if (o instanceof Vehicle v)
        {
        return this.plateNumber.equalsIgnoreCase(v.plateNumber);
        }
    return false;
    }

    }
