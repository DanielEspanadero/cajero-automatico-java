package clases;

public class ClaseHija_Retiro extends ClasePadre_Abstracta {
	
	@Override
	public void Transacciones() {
		System.out.print("Cuanto deseas retirar: ");
		retiro();
	}

}
