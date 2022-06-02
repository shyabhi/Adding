package Add;
import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		int x, y, sum;
		Scanner add = new Scanner(System.in);
		System.out.println("Enter first number");
		x = add.nextInt();
		
		System.out.println("Enter second Number");
		y = add.nextInt();
		
		sum = x+ y;
		System.out.println("Sum is: " + sum);

	}

}
