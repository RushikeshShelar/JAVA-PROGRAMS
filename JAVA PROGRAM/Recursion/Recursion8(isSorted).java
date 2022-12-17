public class Main {
	public static boolean isSorted(int arr[],int idx){
	    if(idx == arr.length-1){
	        return true;
	    }
	    
	    if(arr[idx] >= arr[idx+1]){
	        //array is unsorted 
	        return false;
	    }
	    else{
	        return isSorted(arr,idx+1);
	    }
	}
	
	public static void main(String[] args) {
		int array[ ] = { 1,2,3,4,5};
	System.out.println(isSorted(array,0));
		
	}
}