
public class Thre_join  {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("Thread join");
		final Thread t1=new Thread() {
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println(i);
				}
			}
		};
		final Thread t2=new Thread() {
			@Override
			public void run() {
				try{
					t1.join(5000);
					for(int i=11;i<=20;i++) {
						System.out.println(i);
					}
				}
				catch(InterruptedException e){
				    e.printStackTrace();
			}
				
			}
		};
		t2.start();
		t1.start();
	
	}

}
