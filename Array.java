import java.util.Scanner;

public class Array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] contrasenya = {3,1,4,1,5};
		System.out.println("Introdueix la contrasenya:");
		int[] values = new int[5];
		for(int i = 0; i < values.length; i++) {
			values[i] = sc.nextInt();
		}
		if(values[0]==contrasenya[0] && values[1]==contrasenya[1] && values[2]==contrasenya[2] && values[3]==contrasenya[3] && values[4]==contrasenya[4]){
			System.out.println("Contrasenya vàlida");
			System.out.println("Hola usuari");
		} else{
			System.out.println("Contrasenya no vàlida");
			System.out.println("Accès al programa denegat");
		}
	}
}
