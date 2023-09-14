import java.util.ArrayList;
import java.util.Collections;
public class Arr_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>al=new ArrayList<Integer>(10);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(5);
		al.add(4);
		Collections.sort(al);
		System.out.println("sorted arraylist");
		System.out.println(al);
		System.out.println("reversed arraylist");
		Collections.reverse(al);
		System.out.println(al);
	}

}
