
public class Constructor {
	int year;
	String name;
	String address;
	public Constructor(int n,String nm,String add) {
		year=n;
		name=nm;
		address=add;
	}
	public void display() {
		System.out.println(name+"\t"+year+"\t \t"+address);
	}
}
