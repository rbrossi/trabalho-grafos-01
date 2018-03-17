package questao01;

//Rafael Bertoldi Rossi e  Matheus Navarro Niewnow

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Console {

	public static void main(String[] args) throws IOException {
		Set<String> colecaoSet = new TreeSet<String>();
		String[] array;

		Scanner sc = new Scanner(System.in);

		/*
		 * while (sc.hasNext()){ String token = sc.next().toLowerCase();
		 * 
		 * token = token.replaceAll("\\*", ""); line = line.replaceAll("\\(*",
		 * ""); line = line.replaceAll("\\$", ""); line = line.replaceAll("\\#",
		 * ""); line = line.replaceAll("\\.", ""); line = line.replaceAll("\\:",
		 * ""); line = line.replaceAll("\"", ""); array = line.split(" "); line
		 * = line.replaceAll("\n", "");
		 * 
		 * colecaoSet.add(token); }
		 */

		String line = sc.nextLine();
		int qtdLinhas = 0;
		while ((line != null)) {
			if (qtdLinhas <= 10000) {
				if (line.length() <= 200) {
					line = line.toLowerCase();
					line = line.trim();
					line = line.replaceAll("\\*", "");
					line = line.replaceAll("\\(*", "");
					line = line.replaceAll("\\$", "");
					line = line.replaceAll("\\#", "");
					line = line.replaceAll("\\.", "");
					line = line.replaceAll("\\:", "");
					line = line.replaceAll("\"", "");
					array = line.split(" ");
					line = line.replaceAll("\n", "");
					for (String s : array) {
						colecaoSet.add(s);
					}
					line = sc.nextLine();
					qtdLinhas++;
				} else
					line = sc.nextLine();
			} else
				break;

		}

		for (String s : colecaoSet) {
			System.out.println(s);
		}

	}

}
