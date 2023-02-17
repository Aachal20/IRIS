package in.iris;

public class RemoveElementFromArray {
	public static void main(String[] args) {
	
	int[] arr  = {25, 14, 56, 49};
	int removEle=10;
	
	for(int i=removEle;i<arr.length-1;i++) {
		arr[i]=arr[i+1];
		System.out.println(arr[i]);
	}
	
	}
}
