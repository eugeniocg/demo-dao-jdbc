package Aplicacao;

import modelo.dao.FabricaDao;
import modelo.dao.FuncionarioDao;
import modelo.entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
	
//	Departamento objeto = new Departamento(1, "Livros"); 
//	Funcionario funci =new Funcionario(10, "Jupi", "jupi@gmail.com", new Date(), 1000.0, objeto);
//	System.out.println(objeto);
//	System.out.println(funci);

	
	FuncionarioDao funciDao = FabricaDao.creataFuncionarioDao();
 	Funcionario funci = funciDao.findById(2);
 	System.out.println("========TESTE01 - Funcionário FindById=========");
 	System.out.println(funci);

	}
}
