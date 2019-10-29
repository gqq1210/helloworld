package project9;

public class RegularPolygon {

	public static void main(String[] args) {
		RegularPolygon regular1=new RegularPolygon();
		RegularPolygon regular2=new RegularPolygon(6,4);
		RegularPolygon regular3=new RegularPolygon(10,4,5.6,7.8);
		System.out.println("regular1's perimeter and area:"+regular1.getPerimeter()+" , "+regular1.getArea());
		System.out.println("regular2's perimeter and area:"+regular2.getPerimeter()+" , "+regular2.getArea());
		System.out.println("regular3's perimeter and area:"+regular3.getPerimeter()+" , "+regular3.getArea());

	}
	private int n;
	private double side;
	private double x;
	private double y;
	
	public RegularPolygon(){
		n=3;
		side=1;
		x=0;
		y=0;
	}
	
	public RegularPolygon(int n,double side){
		this.n=n;
		this.side=side;
		this.x=0;
		this.y=0;
	}
	
	public RegularPolygon(int n,double side,double x,double y){
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}	
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n=n;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side=side;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x=x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y=y;
	}
	
	public double getPerimeter() {
		return side*n;
	}
	
	public double getArea() {
		return n*side*side/(4*Math.tan(Math.PI/n));
	}

}
