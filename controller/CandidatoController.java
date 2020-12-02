package controller;

import java.util.ArrayList;
import java.util.List;
import dao.CandidatoDao;
import model.Candidato;


public class CandidatoController {

	public int cadastrar(String cpf, String nome, String cargo ) {
		Candidato c=new Candidato(cpf, nome, cargo);
		CandidatoDao cDao=new CandidatoDao();
		return(cDao.create(c));
		
	}
	
	public List<Candidato> consultar(){
		List<Candidato> lista = new ArrayList<>();
		CandidatoDao cDao = new CandidatoDao();
		lista = cDao.read();
		return lista;
	}
	
	//criar um objeto do produto	
	//criar metodo de consulta
	//método cadastrar
	//método consultar
	
	
}
