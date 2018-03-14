package questao01;

//Rafael Bertoldi Rossi e  Matheus Navarro Niewnow

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		Set<String> colecaoSet = new TreeSet<String>();
		String[] array;
		try (BufferedReader br = new BufferedReader(new FileReader("C:/temp/teste.txt"))) {
			String line = br.readLine();
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
						line = br.readLine();
						qtdLinhas++;
					} else
						line = br.readLine();
				} else
					break;

			}

			for (String s : colecaoSet) {
				System.out.println(s);
			}

		}

	}

}
