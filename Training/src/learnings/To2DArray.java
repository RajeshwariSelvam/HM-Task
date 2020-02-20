package learnings;

public class To2DArray {

	public static void main(String[] args) {

		String two_d_array_string = "{{346,1199,718,1240},{1068,1199,1858,1240},"
				+ "{2973,1199,2571,865},{5589,1199,2580,865},{345,2879,2580,865},"
				+ "{2973, 2879, 2571, 865},{5589, 2879, 2580, 865}}";
		//System.out.println(two_d_array_string);
		
	String[] arr = two_d_array_string.split(",");
		/*
		 * System.out.println("arr.length " + arr.length); for (int i = 0; i <
		 * arr.length; i++) {
		 * 
		 * System.out.print(" arr["+i+"] " + arr[i] +" " );
		 * 
		 * System.out.println();
		 * 
		 * }
		 */
	
	int k =0;
	
	String[][] val = new String[7][4];
	//System.out.println(val.length);
	for (int i = 0; i < 7; i++) {
		for (int j = 0; j < 4; j++) {
		val[i][j]	= arr[k++];
		}
	}	
	
	for (int i = 0; i < 7; i++) {
		for (int j = 0; j < 4; j++) {
		System.out.print(val[i][j] +" ");
		}
		System.out.println();
	}
	
	
	
	
	}

}
