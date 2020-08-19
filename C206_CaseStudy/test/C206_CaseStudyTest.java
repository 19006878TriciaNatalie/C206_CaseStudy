import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	@Before
	public void setUp() throws Exception {
		ArrayList<Food> foodList = new ArrayList<Food>();
		foodList.add(new Food(1, "Noodles", "Noodle maker", 12, 11122020));
		foodList.add(new Food(25, "Rice", "Rice maker", 12, 11032020));
		ArrayList<Electronics> electronicsList = new ArrayList<Electronics>();
		electronicsList.add(new Electronics(21, "iPhone 102", "Apple inc", 12, 1254843141));
		electronicsList.add(new Electronics(51, "Philips monitor 2000", "Philips", 14, 1144145194));
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer(990812, "Yan Xin", 90944385, 0));
		customerList.add(new Customer(990252, "Tricia", 88750325, 0));
		ArrayList<Outlet> outletList = new ArrayList<Outlet>();
		outletList.add(new Outlet(1, "Store plaza sing", "Plaza singapore 72512"));
		outletList.add(new Outlet(2, "Store wood", "Wood singapore 745784"));
		ArrayList<Tracker> trackList= new ArrayList<Tracker>();
		ArrayList<Tracker> oldtrackList= new ArrayList<Tracker>();
			
	}
	@Test
	  public void addFoodTest() {
	    ArrayList<Food> foodList = new ArrayList<Food>();
	    // Item list is not null, so that can add a new item - boundary
	    assertNotNull("Check if there is valid Food arraylist to add to", foodList);
	    //Given an empty list, after adding 1 item, the size of the list is 1 - normal
	    //The item just added is as same as the first item of the list
	    
	    Food fd=new Food(1, "Noodles", "Noodle maker", 12, 11122020);
	    C206_CaseStudy.addFood(foodList, fd);
	    assertEquals("Check that Food arraylist size is 1", 1, foodList.size());
	    assertSame("Check that Food is added", fd, foodList.get(0));
	    
	    //Add another item. test The size of the list is 2? -normal
	    //The item just added is as same as the second item of the list
	    Food fd1=new Food (25, "Rice", "Rice maker", 12, 11032020);
	    C206_CaseStudy.addFood(foodList, fd1);
	    assertEquals("Check that Food arraylist size is 2", 2, foodList.size());
	    assertSame("Check that Food is added", fd1, foodList.get(1));
	  }
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	

}

//Delete product 



//If product list is null prompt out error message “There is nothing in the list” (Error)

//If is the item that the user want to delete, remove the item (Normal)

//If no such item exist and the user want to delete the item prompt an error message” there is no such item” (Error)

//Add product

//User input all the detail of the product then the system put it in the list (Normal)

//The user key in a negative amount for the quantity then an error message will pop out(boundary) 

 

//View product

//Product list cannot be null when requesting to view (boundary)

//Input view product and system get all the product in the list and display to user(normal)