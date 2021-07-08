package br.com.stefanini.provaBelem1.entities;

import java.util.ArrayList;
import java.util.List;


public class Prova {

	
	private List<Pergunta> perguntas;
	private Double notaAluno;
	
	public Prova() {
		super();
	}

	public Prova(List<Pergunta> perguntas, Double notaAluno) {
		super();
		this.perguntas = perguntas;
		this.notaAluno = notaAluno;
	}

	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}

	public Double getNotaAluno() {
		return notaAluno;
	}

	public void setNotaAluno(Double notaAluno) {
		this.notaAluno = notaAluno;
	}
	
	public List<Pergunta> addLista(Pergunta pergunta){
		if(perguntas == null) {
			perguntas = new ArrayList<>();
		}
		perguntas.add(pergunta);
		return perguntas;
	}
	
}
