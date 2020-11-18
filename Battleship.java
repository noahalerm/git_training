import java.util.Scanner;

public class Battleship{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[][] battleship  = {{"0","0","x","x","x","0","0","0"},{"0","0","0","0","0","0","0","x"},{"x","x","x","x","0","0","0","x"},{"0","0","0","0","0","0","0","x"},{"0","0","x","0","0","x","x","0"},{"0","x","0","0","x","x","x","0"}};
		System.out.println("Introdueix les coordenades (x,y) de la casella a la que vols atacar:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(battleship[x][y].equals("x"))
			System.out.println("tocat");
		else
			System.out.println("aigua");
	}
}
