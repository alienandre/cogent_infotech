import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Rectangle[] rectangles = new Rectangle[3];
		Rectangle test;
		
		for(int i=0; i<3; i++) {
			test = new Rectangle();
			System.out.println("What is the length of ur rectangle? ");
			test.setLength(in.nextInt());
			System.out.println("What is the breadth of ur rectangle? ");
			test.setBreadth(in.nextInt());
			rectangles[i] = test;
		}
		
		for(int i=0; i<3; i++) {
			rectangles[i].display();
		}

	}

}
