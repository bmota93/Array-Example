
/**
 * <pre>
 * 
 * Author:
 *  	Brandon Mota 
 *  
 *  
 * Description: 
 * 		This program will simulate a bus operation and places
 * 		students in an array to do so.  
 * 
 * 
 * </pre>
 */

public class Bus 
{
	//data
	private String[] names;
	private int sz;
	
	/**
	 * <pre>
	 * Description: 
	 * This is the constructor for the program.
	 * Pre:
	 * none. 
	 * Post:
	 * Creates the new array object.
	 * </pre>
	 * 
	 */

	public Bus(int szx)
	{
		int sz = szx;
		names = new String[sz];
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This will add a new student to the array.
	 * Pre:
	 * An empty seat has to be available.
	 * Post:
	 * A student is added to the bus.
	 * </pre>
	 * 
	 */

	public void getOn(String name)
	{
		names[findFirstEmpty()]	= name;
		System.out.println(name + " got on the bus.");
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This will find an empty seat for a student.
	 * Pre:
	 * none. 
	 * Post:
	 * An empty seat is either available or not.
	 * </pre>
	 * 
	 */

	public int findFirstEmpty()
	{
		for (int i=0; i <= 9; i++)
		{
			if (names[i] != null)
			{
				
			}
			else
			{
			return i;
			}
		}
		return 0;		
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This will print all elements of the array which are students.
	 * Pre:
	 * The array has to contain students. 
	 * Post:
	 * The array is printed.
	 * </pre>
	 * 
	 */

	public void print()
	{		
		for (int i = 0; i <= 9; i++)
		{
			if (names[i] != null)
			{						
				System.out.print(i + ", " + names[i]);
				System.out.println();
			}
		}		
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This will remove any student from the bus.
	 * Pre:
	 * There has to be a student present. 
	 * Post:
	 * Specified student is removed.
	 * </pre>
	 * 
	 */

	public void getOff(String name)
	{
		for (int i = 0; i <= 9; i++)
		{
			if (names[i] == name)
			{
				names[i] = null;
			}
		}
		
		System.out.println(name + " got off the bus.");
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This will swap two students from their seats.
	 * Pre:
	 * none. 
	 * Post:
	 * The students are swapped.
	 * </pre>
	 * 
	 */

	public void swap(String name1, String name2)
	{
		//data
		int x = 0;
		int y = 0;
		String swap1 = null;
		String swap2 = null;
		
		for (int i = 0; i <= 9; i++)
		{
			if (names[i] == name1)
			{
				x = i;
				swap1 = names[i];
			}
			else if(names[i] == name2) 
			{
				y = i;
				swap2 = names[i];						
			}			
		}		
		names[x] = swap2;
		names[y] = swap1;			
	}	
	
	/**
	 * <pre>
	 * Description: 
	 * This is the main method that follows the instructions
	 * given in the homework.
	 * </pre>
	 * 
	 */

	public static void main(String[] args)
	{
		Bus schoolbus = new Bus(10); //new java object is created
		
		schoolbus.getOn("joe"); 		
		schoolbus.getOn("jeff"); 		
		schoolbus.getOn("erica"); 	
		schoolbus.getOn("bob");
		
		System.out.println("\nAfter loading the kids, this is how the seating is arranged:");
		schoolbus.print();
				
		schoolbus.swap ("jeff", "bob");
		
		System.out.println("\nAfter swapping jeff and bob, this is how the seating is arranged:");
		schoolbus.print();
		
		System.out.println();
		schoolbus.getOff("erica");	
		schoolbus.getOff("bob");
		
		System.out.println("\nAfter bob left, this is how the seating is arranged:");
		schoolbus.print();
		
		System.out.println();
		schoolbus.getOn("nancy");
		
		System.out.println("\nAfter nancy came on, this is how the seating is arranged:");
		schoolbus.print();
					
	}
} //end of program
