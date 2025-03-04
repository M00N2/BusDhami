interface List
    {
    void add(Object o);//adds a passenger to the end of the list

    void delete(String first, String last);// delete a passenger from the list

    void print(String latsName);//prints all the passengeres with the same last name

    boolean search(String first, String last);//search for a particular passenger with the given first and last name

    boolean isFull();//returns true if the buss is full, meaning all the eats are taken
    }
