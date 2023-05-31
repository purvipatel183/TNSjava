import java.util.Scanner;
public class Ternary_greater {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number a:");
		a=sc.nextInt();
		System.out.print("enter number b:");
		b=sc.nextInt();
		c=(a>b)?a:b;
		System.out.println("greater is "+c);

	}

}
