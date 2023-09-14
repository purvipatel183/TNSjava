
public class Thre_inter implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println((i+"*"+(i+1))+"is "+(i*(i+1)));
		}
		
	}
}
