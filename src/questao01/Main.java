package questao01;

//Rafael Bertoldi Rossi e Matheus Navarro Niewnow

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		Set<String> colecaoSet = new TreeSet<String>();
		String[] array;
		try (BufferedReader br = new BufferedReader(new FileReader("C:/temp/teste.txt"))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
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
			}
			for (String s : colecaoSet) {
				System.out.println(s);
			}

		}

	}

}
