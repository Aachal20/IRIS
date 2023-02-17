package in.iris;

public class RemoveCharcherFromString_09 {

	public static void main(String[] args) {
		
		String str = "abc ABC 123 abc";
		String strNew = str.replace("123","");
		System.out.println("Old String :: "+str);
		System.out.println("New String :: "+strNew);
	}

}
