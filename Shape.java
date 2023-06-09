public interface Shape {
	public double getArea();
}
 class Rectangle implements Shape{
	double x,y;
	public Rectangle(double m,double n) {
		x=m;
		y=n;
	}
	 public double getArea() {
		 return x*y;
	}
}
 class Circle implements Shape{
	 double r;
	 public Circle(double n) {

		 r=n;
	 }
	 public double getArea() {
		 return Math.PI*r*r;
	 }
 }
 class Triangle implements Shape{
	 double b,h;
	 public Triangle(double m,double n) {
		 b=m;
		 h=n;
	 }
	 public double getArea() {
		 return 0.5*b*h;
	 }
 }