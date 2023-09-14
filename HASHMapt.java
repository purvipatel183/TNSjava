import java.util.*;
public class HASHMapt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Number> hm=new HashMap<String,Number>();
		hm.put("hii", 3);
		hm.put("Hello",5);
		hm.put("by",2);
		System.out.println(hm);
		Set hash=hm.entrySet();
		Iterator i=hash.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
	}

}
