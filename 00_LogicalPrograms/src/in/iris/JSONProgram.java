package in.iris;

import java.io.File;
import java.util.Map;

public class JSONProgram {

	public static void main(String[] args) {

		//create instance of the ObjectMapper class to map JSON data  
		ObjectMapper mapper = new ObjectMapper();  
		// create instance of the File class   
		File fileObj = new File("C:\\Users\\rastogi ji\\OneDrive\\Desktop\\Sample.json");  
		// use try-catch block to convert JSON data into Map  
		try {  
			// read JSON data from file using fileObj and map it using ObjectMapper and TypeReference classes  
			Map<String, Object> userData = mapper.readValue(  
					fileObj, new TypeReference<Map<String, Object>>() {  
					});   
			// print all key-value pairs   
			System.out.println("Name : " + userData.get("Name"));  
			System.out.println("Mobile : " + userData.get("Mobile"));  
			System.out.println("Designation : " + userData.get("Designation"));  
			System.out.println("Pet : " + userData.get("Pet"));  
			System.out.println("Address : " + userData.get("Address"));   
		} catch (Exception e) {  
			// show error message  
			e.printStackTrace();  
		}   
	}  
}  


