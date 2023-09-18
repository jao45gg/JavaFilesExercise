package Application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho com nome do arquivo .csv");
		String path = sc.nextLine();

		File file = new File(path);
		new File(file.getParent() + "\\out").mkdir();

		try (BufferedReader br = new BufferedReader(new FileReader(file));
				BufferedWriter bw = new BufferedWriter(new FileWriter(file.getParent() + "\\out\\summary.txt"))) {

			ArrayList<String> arr = new ArrayList<String>();
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				arr.add(line);
				line = br.readLine();
			}

			for (String a : arr) {
				System.out.println(a);
			}
			
			bw.write("teste");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
