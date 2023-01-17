import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }


    public int passengerCount(){
        return this.passengers.size();
    }
    public void removePassenger(Person person){
        this.passengers.remove(person);
    }

    public void addPassenger(Person person){
        if (passengerCount() < this.capacity){
         this.passengers.add(person);
        }

    }

    public void pickUp(BusStop busstop){
        Person person = busstop.removePersonFromQueue();
        this.passengers.add(person);


    }
}


//    Create a `Bus` class with a destination, capacity and an initially empty ArrayList, passengers of type `Person`
//        * Create a method to return the number of passengers on the bus.
//        * Create a method to add a passenger onto the bus only if the passenger count is less than the capacity.
//        * Create a method to remove a passenger from the bus.
//
//        ## Extensions:
//        * Add a `BusStop` class which interacts with the other two.
//        * BusStop should have a name and an initially empty ArrayList of type "Person" called queue.
//        * Add a method to add a person to the queue.
//        * Add a method to remove a person from the queue.
//        * Create a pickUp method in Bus that gets a person from bus stop and adds to the bus passengers.
