import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Bus bus;

    private BusStop busstop;

    @Before
    public void before(){
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
        bus = new Bus("York",3);
        busstop = new BusStop("York");


    }

    @Test
    public void busInitiallyEmpty(){
        assertEquals(0, bus.passengerCount());
    }
    @Test
    public void busCanAddPassengers(){
        bus.addPassenger(person1);
        assertEquals(1, bus.passengerCount());
    }
    @Test
    public void busCanOnlyAddPassengerIfNotFullTrue(){
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.addPassenger(person3);
        assertEquals(3, bus.passengerCount());
    }
    @Test
    public void busCannotAddPassengerIfFull(){
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.addPassenger(person3);
        bus.addPassenger(person4);
        assertEquals(3, bus.passengerCount());
    }
    @Test
    public void passengerCanLeaveBus(){
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.addPassenger(person3);
        bus.removePassenger(person1);
        assertEquals(2, bus.passengerCount());
    }
    @Test
    public void passengerCanBePickedUp(){
        busstop.addPersonToQueue(person1);
        busstop.addPersonToQueue(person2);
        bus.pickUp(busstop);
        assertEquals(1, bus.passengerCount());
        assertEquals(1, busstop.queueCount());
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
