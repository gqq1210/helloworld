package program1;

public class TestSimpleCircle {

	public static void main(String[] args) {
		SsimpleCircle circle1=new SsimpleCircle();
		System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());
		
		SsimpleCircle circle2=new SsimpleCircle(25);
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		
		SsimpleCircle circle3=new SsimpleCircle(125);
		System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
		
		circle2.radius=100;
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
	}
}
	
class SsimpleCircle{
	double radius;
	SsimpleCircle(){
		radius=1;
	}
	
	SsimpleCircle(double newRadius){
		radius=newRadius;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	void setRadius(double newRadius) {
		radius=newRadius;
	}
}
