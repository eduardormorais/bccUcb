package br.ucb.managedBean;
import br.ucb.modelo.Aluno;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean(name = "alunoMB")
@RequestScoped

public class AlunoMB implements Serializable{
	private static final long serialVersionUID = 1L;
	private Aluno aluno;
	
	public AlunoMB() {
		this.aluno = new Aluno();
	}
	
	public String verificaSituacao() {
		this.aluno.setMedia();
		return "visao";
	}
}
