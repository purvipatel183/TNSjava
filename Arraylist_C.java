import java.util.*;
public class Arraylist_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> arr=new ArrayList<String>();
		arr.add("hii");
		arr.add("hello");
		System.out.println(arr);
		Iterator in=arr.iterator();
		while(in.hasNext()) {
		System.out.println(in.next());
	}
		arr.forEach((n)->System.out.println(n));
	}

}
