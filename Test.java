
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Christopher Thompson");
		System.out.println("PROGRAMMING ASSIGNMENT 4 - SET");
		System.out.println();
		
		//Variables
		Scanner scan = new Scanner(System.in);
		String userIn = "start";
		Set linkedList = new Set();   // establish new linkedList data set
		
		//apply Set Class methods based on user input
		while (userIn != null) {
			
			System.out.print("Enter command: ");
			userIn = scan.nextLine();
			
			if (userIn.contains("add")) {
				linkedList.addValue(userIn,linkedList);
				
			}else if (userIn.contains("del")) {
				linkedList.deleteValue(userIn,linkedList);
				
			}else if (userIn.contains("exists")) {
				linkedList.existsValue(userIn,linkedList);
			}
					    
		}	
					
		scan.close();
	}

}
