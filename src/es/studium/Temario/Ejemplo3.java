package es.studium.Temario;

public class Ejemplo3 {
	public static void main(String args[])
	{
		int valor=5, cero=0;
		int[] array = {1, 2, 3};
		try
		{
			try
			{
				valor = valor/cero; // Divisi�n por cero
				array[4]= 5; // Acceso a una posici�n no disponible
			}
			catch(ArithmeticException e)
			{
				System.out.println( "Divisi�n por cero" );
				throw e;
			}
			catch(Exception e)
			{
				System.out.println("Se ha producido un error:"+e.getMessage());
			}
		}
		catch(Exception e)
		{
			System.out.println( "Se ha producido otro error:"+ e.getMessage());
		}
	}
}
