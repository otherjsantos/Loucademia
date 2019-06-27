package br.com.softblue.loucademia.interfaces.aluno.web;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.softblue.loucademia.application.service.AlunoService;
import br.com.softblue.loucademia.domain.aluno.Aluno;

@Named
@RequestScoped
public class AlunoBean implements Serializable{
	
	@EJB
	private AlunoService alunoService;

	private Aluno aluno = new Aluno();
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public String gravar() {
		alunoService.creatOrUpdate(aluno);
		return null;
	}
	
}
