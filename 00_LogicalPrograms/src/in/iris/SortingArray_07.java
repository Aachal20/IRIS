package in.iris;
public class SortingArray_07 {    
    public static void main(String[] args) {        
            
        //Initialize array     
        int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
            
         
        System.out.println(" original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
          
        System.out.println("After Sorting: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    