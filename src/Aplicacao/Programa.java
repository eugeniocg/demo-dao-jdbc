package Aplicacao;


import java.util.Date;
import java.util.List;
import modelo.dao.FabricaDao;
import modelo.dao.FuncionarioDao;
import modelo.entidades.Departamento;
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

		System.out.println("\n====TESTE02 - Funcionario findBYDepartamento=====");
		Departamento departamento = new Departamento(2, null);
		List<Funcionario> lista = funciDao.findByDepartamento(departamento);
		for (Funcionario objeto : lista) {
			System.out.println(objeto);
		}
		
		System.out.println("\n====TESTE03 - Funcionario findAll=====");
		lista = funciDao.findAll();
		for (Funcionario objeto : lista) {
			System.out.println(objeto);
		}
		
		System.out.println("\n====TESTE04 - Funcionario insert=====");
		Funcionario novoFuncionario = new Funcionario(null, "João","joao@gmail.com", new Date(), 1000.0, departamento);
		funciDao.insert(novoFuncionario);
		System.out.println("Inserido novo Id: "+novoFuncionario.getId());

		System.out.println("\n====TESTE05 - Funcionario update=====");
		funci = funciDao.findById(12);
		funci.setNome("Chiquinho");
		funciDao.update(funci);
		funci.setEmail("chiquinho@gmail.com");
		funciDao.update(funci);
		System.out.println("Atualização Completada");
	}
}
