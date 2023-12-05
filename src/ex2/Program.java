package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = null;
		PrintWriter pw = null;
		try {
			sc = new Scanner(new File("input.txt"));
			pw = new PrintWriter(new File("output.txt"));
			Funcionario f = null;
			var funcionarios = new ArrayList<Funcionario>();
			String line = ""; //primeira linha
			do {
				line = sc.nextLine();
				String[] campos = line.split(",");
				String nome = campos[0];
			    Double salario = Double.parseDouble(campos[1]);
			    f = new Funcionario(nome, salario);
			    funcionarios.add(f);
			}while(sc.hasNext());
			
			Collections.sort(funcionarios);
			
			for (Funcionario funcionario : funcionarios) {
				pw.print(funcionario.getNome() + ", " + funcionario.getSalario() + "\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sc.close();
			pw.close();
		}

	}

}


