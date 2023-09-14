import java.util.*;
public class ArrDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> an= new ArrayDeque<>();
		an.addFirst("hii");
		an.add("Hello");
		an.add("good morning");
		an.add("how are you");
		an.addLast("bye");
		System.out.println("first element:"+an.getFirst());
		System.out.println("last one is :"+an.getLast());
		System.out.println(an);
		System.out.println("element remove is "+an.remove());
		
		System.out.println("elements by iterator ");
		Iterator<String> i=an.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println("last removed "+an.pollLast());

	}

}
