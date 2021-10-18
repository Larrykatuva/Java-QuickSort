
public class QuickSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSortArray qs = new QuickSortArray(5);
		
		qs.insertValue(34);
		qs.insertValue(12);
		qs.insertValue(90);
		qs.insertValue(10);
		qs.insertValue(51);
		
		qs.displayValues();
		
		System.out.println("\n**********After sorting*************\n");
		qs.quickSort();
		qs.displayValues();
	}

}
