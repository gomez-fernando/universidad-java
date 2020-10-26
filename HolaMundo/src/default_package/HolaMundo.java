package default_package;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Escribe el título: ");
		Scanner consola = new Scanner(System.in);
		var titulo = consola.nextLine();
		System.out.println("Escribe el autor: ");
		var autor = consola.nextLine();
		System.out.println("Título del libro: " + titulo + ", autor: " + autor);

	}

}
