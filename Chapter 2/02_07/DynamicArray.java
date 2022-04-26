import java.util.ArrayList;

public class DynamicArray {
	public static void main(String[] args) {

		ArrayList<Integer> myarr = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			myarr.add(i);
		}
		System.out.println(myarr);
		myarr.add(2, 10);
		System.out.println(myarr);

	}
}