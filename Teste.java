import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Digite o número que você deseja verificar se é primo: ");
		Scanner scanner = new Scanner(System.in);
		System.out.println(checkPrime(scanner.nextInt()));

	}

	
	public static boolean checkPrime(int val) {
		boolean resultado;
		int contador = 0;
		for(int i = 1; i <= val; i++) {
			if(val%i == 0)
				contador++;
		}
		
		if (contador == 2)
			resultado = true;
		else 
			resultado = false;
		
		return resultado;
	}
}
