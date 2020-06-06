package modelo.dao;

import java.util.List;
import modelo.entidades.Departamento;

public interface DepartamentoDao {

	void inser(Departamento objeto);
	void update(Departamento objeto);
	void deleteById(Integer id);
	Departamento findById(Integer id);
	List<Departamento> findAll();
}
