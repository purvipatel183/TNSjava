
public class Override {

	public void getInterest() {
		System.out.println("7.0");
	}
}
 class SBI extends Override{
	public void getInterest() {
		System.out.println("6.8");
	}
}
class HDFC extends Override{
	public void getInterest() {
		System.out.println("6.9");
	}
}