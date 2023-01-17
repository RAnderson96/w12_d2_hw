import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }
    public int queueCount(){
        return this.queue.size();
    }

    public void addPersonToQueue(Person person){
        this.queue.add(person);
    }

    public String getName(){
        return this.name;
    }
    public Person removePersonFromQueue(){
        return this.queue.remove(0);
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
