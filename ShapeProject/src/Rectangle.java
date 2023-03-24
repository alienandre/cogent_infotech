
public class Rectangle {
	private int length;
	private int breadth;
	

	public Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getBreadth() {
		return this.breadth;
	}
	
	public void getArea() {
		int area = this.getBreadth() * this.getLength();
		System.out.println("The area of the rectangle is "+ area);
	}
	
	public void display() {
		System.out.println("The length of the rectangle is " + this.getLength());
		System.out.println("The breadth of the rectangle is " + this.getBreadth());
		this.getArea();
	}
	
	
	
}
