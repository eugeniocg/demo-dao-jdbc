package modelo.dao;

import db.DB;
import modelo.dao.impl.FuncionarioDaoJDBC;

public class FabricaDao {

	public static FuncionarioDao creataFuncionarioDao() {
		return new FuncionarioDaoJDBC(DB.conexao);
	}
}
