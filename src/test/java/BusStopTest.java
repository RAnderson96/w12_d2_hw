import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private Person person1;
    private Person person2;
    private Person person3;
    private BusStop busstop;

    @Before
    public void before(){
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();

        busstop = new BusStop("York");

    }

    @Test
    public void busstopQueueStartsEmpty(){
        assertEquals(0, busstop.queueCount());
    }
    @Test
    public void passengersCanQueueAtBusStop(){
        busstop.addPersonToQueue(person1);
        assertEquals(1, busstop.queueCount());
    }
    @Test
    public void busstopHasAName(){
        assertEquals("York", busstop.getName());
    }
    @Test
    public void personCanBeRemovedFromQueue(){
        busstop.addPersonToQueue(person1);
        busstop.addPersonToQueue(person2);
        busstop.removePersonFromQueue();

        assertEquals(1, busstop.queueCount());
    }
    @Test
    public void personCanBePickedUp(){

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
