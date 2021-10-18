
public class QuickSortArray {
	private int[] arr;
	private int size;
	private int nItems;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public QuickSortArray(int size) {
		this.size = size;
		this.arr = new int[this.size];
		this.nItems = 0;
	}
	
	
	/**
	 * Inserting values in the array
	 * @param value
	 */
	public void insertValue(int value) {
		this.arr[this.nItems] = value;
		this.nItems ++;
	}
	
	
	/**
	 * Checking if the array is empty
	 * @return
	 */
	public boolean isEmpty() {
		return this.nItems == 0;
	}
	
	
	/**
	 * Displaying values in the array
	 */
	public void displayValues() {
		System.out.println("Displaying array values");
		for(int value: this.arr) {
			System.out.println("Value => "+value);
		}
	}
	
	
	/**
	 * Quick sort algorithm
	 */
	public void quickSort() {
		recQuickSort(0, this.nItems-1);
	}
	
	public void recQuickSort(int left, int right)
	 {
		 if(right-left <= 0)
			 return;
		 else{
			 int pivot = this.arr[right];
			 int partition = partitionIt(left, right, pivot);
			 recQuickSort(left, partition-1);
			 recQuickSort(partition+1, right); 
		 }
	 } 
	
	public int partitionIt(int left, int right, int pivot)
	 {
		 int leftPtr = left-1; 
		 int rightPtr = right; 
		 while(true)
		 { 
			 while(this.arr[++leftPtr] < pivot)
				 ;
				 while(rightPtr > 0 && this.arr[--rightPtr] > pivot)
				 ; 
				 if(leftPtr >= rightPtr)
					 break; 
				 else 
					 swap(leftPtr, rightPtr);
		 } 
		 swap(leftPtr, right);
		 return leftPtr; 
	 } 
	
	public void swap(int dex1, int dex2)
	 {
		 int temp = this.arr[dex1];
		 this.arr[dex1] = this.arr[dex2];
		 this.arr[dex2] = temp; 
	 } 


}
