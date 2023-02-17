package com.test;

import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest extends Object {

	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}

	public static String convertJsonToJava(Object obj)  {

		String writeValueAsString = null;
		try {
			writeValueAsString = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return writeValueAsString;
	}
	public static void main(String[] args) throws Exception { 

		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(101,"Aachal","Dev");
		Employee e2 = new Employee(102,"Raja","Testing");
		Employee e3 = new Employee(104,"Ramesh","Of");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		//String  = convertJsonToJava(al);
		String data = mapper.writeValueAsString(al);
		System.out.println(data);

		mapper.writeValue(new File("C:\\Users\\HP\\Desktop\\data\\data.json"), al);


		//JSON to Java

		String json = "[{\"eno\":101,\"ename\":\"Aachal\",\"dept\":\"Dev\"},{\"eno\":102,\"ename\":\"Raja\",\"dept\":\"Testing\"},{\"eno\":104,\"ename\":\"Ramesh\",\"dept\":\"Of\"}]\r\n" + 
				"";
		ArrayList list = mapper.readValue(json, ArrayList.class);
		System.out.println(list.size());
		list.forEach(e->{
			System.out.println(e);
		});
		boolean b = list.contains(e1);
		Object object = list.get(0);
	}

}
