import java.util.*;
public class Vector_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> num=new Vector<>(5);
		num.add(2);
		num.add(3);
		num.add(6);
		num.add(7);
		num.add(9);
		System.out.println("EVEN numbers from vector");
		Enumeration<Integer> em = num.elements();
		   while(em.hasMoreElements()) {
			   int i=em.nextElement();
	        	 if(i%2==0) {
	        		 System.out.println(i);
	        	 }
	        }
	}

}
