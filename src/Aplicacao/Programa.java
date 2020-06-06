package Aplicacao;

import java.util.Date;
import modelo.entidades.Departamento;
import modelo.entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Departamento objeto = new Departamento(1, "Livros");
		Funcionario funci = new Funcionario(10, "Jupi", "jupi@gmail.com", new Date(), 1000.0, objeto);
		
		System.out.println(objeto);
		System.out.println(funci);

	}

}
