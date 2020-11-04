import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix dos nombres enters:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if(num1 > num2) {
			System.out.println(num1 + " és més gran que " + num2 );
		} else if(num1 == num2) {
			System.out.println(num1 + " i " + num2 + " son iguals");
		} else {
			System.out.println(num2 + " és més gran que " + num1);
		}
	}
}
