package Question2;

import java.util.ArrayList;
import java.util.HashMap;

public class Mobile {
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
//	public String addMobile(String company, String model) {
//		mobiles.put("apple", null)
//	}
}



/* 

● Create a class Mobile with the following field:
HashMap<String,ArrayList<String>> mobiles = new HashMap<>();

● Implement the following methods inside the Mobile class:
public String addMobile(String company, String model)
● This method will take a string as a company name and its model as an argument.
● Ex: "apple", "Iphone13"

● add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
● if the company name already exists then their model should be added to the existing list.
● This method should return a message "Mobile added successfully" after adding a mobile.
public List<String> getModels(String company)throws InvalidMobileException
This method return the list of all the models of the supplied company
If we supply any invalid company name then it should throw a checked exception
● Inside the main method of the Mobile class perform the following task:
➔ Call the addMobile method by adding some mobiles with their details
➔ Call the getModels method and print the list of the models of the supplied company.
★ Note: Application should be terminated normally.


*/