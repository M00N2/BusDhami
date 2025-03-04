/*The person class is complete and there is no need to add any code to it*/
class Person
    {//declaring all the private variables that will be used for a person
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
        {//toString to return the Persons variables
        return "First name : " + first + ", Last name :  " + last + ", phone: " + phone + ", email: " + email + ", ID: " + id;
        }//gets this information then goes to passanger and appends that info to end

    public boolean equals(Object o)
        {// a system finding if the id is the same for a person
        if (o instanceof Person)
            return this.id.equalsIgnoreCase(((Person) o).id);// checking for last name and grouping together if the same last name
        else return false;

        }

    }
