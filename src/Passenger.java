/*
Passenger class extends the person class. every passenger has row number, seat number, number of luggeges

*/
class Passenger extends Person // getting attributes of person and using them in Passanger class//extends Person    Must make sure that passenger class extends Person class
    {//passenger class which gets information from person clss
    private String row;
    private String seat;
    private String luggage;

    public Passenger(String first, String last, String phone, String email, String id, String row, String seat, String luggage)
        {
        super(first, last, phone, email, id); // super means grabbing from parent class and being able to use them in passanger class
        this.row = row;
        this.seat = seat;
        this.luggage = luggage;
        }

    public String getRow()
        {
        return row;
        }// getter

    public void setRow(String row)
        {
        this.row = row;
        } //setter

    public String getSeat()
        {
        return seat;
        }

    public void setSeat(String seat)
        {
        this.seat = seat;
        }

    public String getLuggage()
        {
        return luggage;
        }

    public void setLuggage(String luggage)
        {
        this.luggage = luggage;
        }

    public String toString()
        {//getting string from parent and adding this information to the end
        return super.toString() + ", Row: " + row + ", Seat: " + seat + ", Luggage: " + luggage + "\n";
        }//get Person.toString + Passenger.toString

    @Override
    public boolean equals(Object o)
        {
        if (o instanceof Person person)
            {
            //return this.id.equalsIgnoreCase(((Person) o).id)
            }
        return super.equals(o);
        }
    }
