package es.studium.Temario;

public class Ejemplo1
{
	public static void main (String args[])
	{
		int i = 0;
		String vectorS [] = {"Hola mundo 1", "Hola mundo 2", "Hola mundo 3"};
		while (i < 4 )
		{
			try {
				System.out.println(vectorS[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
			Error err = new Error(e);
			System.out.println("Se ha producido el error:" + err);
			}
			i++;
		}
	}
}
