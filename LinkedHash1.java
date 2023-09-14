import java.util.*;
public class LinkedHash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <Number> lhs1=new LinkedHashSet<>();
		lhs1.add(1);
		lhs1.add(3);
		lhs1.add(5);
		LinkedHashSet <Number> lhs2=new LinkedHashSet<>();
		lhs2.add(1);
		lhs2.add(2);
		lhs2.add(4);
		Iterator i=lhs1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(lhs1.removeAll(lhs2));
		System.out.println(lhs1+":lhs1 after compare");
		System.out.println(lhs2+": lhs2");
	}

}
