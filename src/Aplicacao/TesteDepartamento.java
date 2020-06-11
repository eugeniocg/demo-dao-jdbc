package Aplicacao;


import java.util.List;
import java.util.Scanner;
import modelo.dao.DepartamentoDao;
import modelo.dao.FabricaDao;
import modelo.entidades.Departamento;

public class TesteDepartamento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartamentoDao depDao = FabricaDao.createDepartamentoDao();
		Departamento dep = depDao.findById(2);
		
		System.out.println("======TESTE01 - Departamento FindById=========");
		System.out.println(dep);

		System.out.println("\n====TESTE02 - Departamento findAll=====");
		List<Departamento> lista = depDao.findAll();
		for (Departamento objeto : lista) {
			System.out.println(objeto);
		}
		
		System.out.println("\n====TESTE03 - Departamento insert=====");
		Departamento novoDepartamento = new Departamento(null, "Limpeza");
		depDao.insert(novoDepartamento);
		System.out.println("Inserido novo Id: "+novoDepartamento.getId());

		System.out.println("\n====TESTE04 - Departamento update=====");
		dep = depDao.findById(6);
		dep.setNome("Cozinha");
		depDao.update(dep);
		System.out.println("Codigo: "+dep.getId()+" Nome: "+dep.getNome()+ " -  Atualização Completada");
		
		System.out.println("\n====TESTE05 - Departamento delete=====");
		System.out.print("Informe o Código do Departamento: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		
		sc.close();
	}
}
