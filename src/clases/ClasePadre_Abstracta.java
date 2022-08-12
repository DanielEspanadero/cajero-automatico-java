package clases;

import java.util.Scanner;

public class ClasePadre_Abstracta {

	protected int transacciones, retiro, deposito;
	private static int saldo;
	Scanner entrada = new Scanner(System.in);

	public void Operaciones() {
		int bandera = 0;
		int seleccion = 0;

		do {
			do {
				System.out.print("Por favor, seleccione una opcion:");
				System.out.print("	1. Consulta de saldo.");
				System.out.print("	2. Retiro de efectivo.");
				System.out.print("	3. Deposito de efectivo.");
				System.out.print("	4. Salir.");
				seleccion = entrada.nextInt();

				if (seleccion >= 1 && seleccion <= 4) {
					bandera = 1;
				} else {
					System.out.print("----------------------------------------------------");
					System.out.print("Opcion no disponible, vuelva a intentarlo por favor.");
					System.out.print("----------------------------------------------------");
				}
			} while (bandera == 0);
			
			if (seleccion == 1) {
				
			} else if (seleccion == 2) {
				
			} else if (seleccion == 3) {
				
			} else if (seleccion == 4) {
				System.out.println("-----------------------");
				System.out.println("Gracias, vuelva pronto!");
				System.out.println("-----------------------");
				
			}
		} while (bandera != 2);

	}
}
}
