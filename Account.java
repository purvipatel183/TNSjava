package Day2;

public class Account {

	public static void main(String[] args) {
		Acc_Info ai=new Acc_Info();
		System.out.println(ai.getAcc());
		System.out.println(ai.getBal());
		ai.setAcc(12345456);
		ai.setBal(2345.87);
		System.out.println("note:"+ai.withDraw(1000)+"  is your current balance");
		System.out.println("note:"+ai.dePo(2000.20)+"  is your current balance");

	}

}
