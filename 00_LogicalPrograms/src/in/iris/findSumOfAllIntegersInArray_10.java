package in.iris;

public class findSumOfAllIntegersInArray_10 {


	public static int findSumOfDigit() {
		int arr[] = {1,2,3,4,1};
		int sum = 0;
		int i;
		for(i=0;i<arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int sum = findSumOfAllIntegersInArray_10.findSumOfDigit();
		System.out.println(sum);
	}
}
