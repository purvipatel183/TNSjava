package Day2;

public class Product_Detail {
	String name;
	double price;
	int quantity ;
	static int totalSold;
	Product_Detail(String n,double p,int q,int t){
		name=n;
		price=p;
		quantity=q;
		totalSold=t;
	}
	void sell(int q) {
		quantity-=q;
		totalSold+=1;
	}
	static int getTotalSold() {
		return totalSold;
	}

	public static void main(String[] args) {
		Product_Detail p1=new Product_Detail("biscuit ",20.00,1000,0);
		p1.sell(100);
		p1.sell(300);
		p1.sell(400);
		System.out.println("Biscuit has total sell :"+getTotalSold());

	}

}
