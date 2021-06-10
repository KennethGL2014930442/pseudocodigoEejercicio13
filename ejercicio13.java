import java.util.*;

public class ejercicio13{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int opcion;
		double num1, num2, suma, division;
		boolean salir = false;
		
		while (!salir){
			System.out.println("1- Sumar");
			System.out.println("2- Dividir");
			System.out.println("3- Salir");
			
			
			
			System.out.println("Ingrese la opcion que desee: ");
			opcion = scanner.nextInt();
			
			switch (opcion){
				case 1: System.out.println("Ingrese el numero 1: ");
						num1 = scanner.nextInt();
						System.out.println("Ingrese el numero 2: ");
						num2 = scanner.nextInt();
					
						suma = num1+num2;
						System.out.println("El resultado de la suma es: "+suma);
						break;
					
				case 2: System.out.println("Ingrese el numero 1: ");
						num1 = scanner.nextInt();
						System.out.println("Ingrese el numero 2: ");
						num2 = scanner.nextInt();
					
						if(num2 != 0){
						division = num1/num2;
						System.out.println("El resultado de la division es: "+division);
						}else{
							System.out.println("no se puede dividir entre 0.");
						}
						break;
				case 3: salir = true;
						break;
				default:
						System.out.println("Las opciones son entre 1 y 3");
			}		
		}
		
		System.out.println("Salio del menu");
	}
}