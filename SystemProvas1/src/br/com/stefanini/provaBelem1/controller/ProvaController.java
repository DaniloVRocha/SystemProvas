package br.com.stefanini.provaBelem1.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.provaBelem1.entities.Pergunta;

public class ProvaController {

	List<Pergunta> perguntas = new ArrayList<>();
	List<Boolean> respostas;

	public int gerarProva() {
		respostas = new ArrayList<>();
		respostas = gerarPerguntasPreDefinidas();
		return calcularNota(respostas);
	}

	public List<Boolean> gerarPerguntasPreDefinidas() {
		List<Pergunta> perguntas = new ArrayList<>();
		List<Boolean> respostas = new ArrayList<>();

		Pergunta pergunta1 = new Pergunta(
				"\n Questão (1) - Um recurso muito utilizado em Java, bem como na maioria das linguagens orientadas a objeto, \n"
						+ "para “obrigar” a um determinado grupo de classes a ter métodos ou propriedades \n"
						+ "em comum para existir em um determinado contexto",
				"IDE", "Interface", "Herança", "Classe", "B");
		Pergunta pergunta2 = new Pergunta("\n Questão (2) - Atalho utilizado na IDE Eclipse para indentar o código: ",
				"Ctrl + Alt + Del", "Ctrl + Shift + F", "Ctrl + Shift + O", "Alt + Enter", "B");
		Pergunta pergunta3 = new Pergunta(
				"\n Questão (3) - O modificador de acesso menos restritivo de todos. Ele permite que qualquer outra parte da sua aplicação tenha acesso ao componente marcado",
				"private", "protected", "public", "default", "C");
		Pergunta pergunta4 = new Pergunta(
				"\n Questão (4) - Os membros das classes marcados com o modificador de acesso ________ serão acessíveis por classes e interfaces \n"
						+ "dentro do mesmo pacote e por classes derivadas mesmo que estejam em pacotes diferentes.",
				"protected", "private", "public", "default", "A");
		Pergunta pergunta5 = new Pergunta(
				"\n Questão (5)- Quando O metódo não tem retorno, qual tipo de retorno utilizamos? ", "return null",
				"String", "int", "void", "D");

		perguntas.add(pergunta1);
		perguntas.add(pergunta2);
		perguntas.add(pergunta3);
		perguntas.add(pergunta4);
		perguntas.add(pergunta5);

		PerguntaController perguntaController = new PerguntaController();
		respostas = perguntaController.lerPerguntas(perguntas, respostas);

		return respostas;
	}

	public int calcularNota(List<Boolean> respostas) {
		int nota = 0;
		for (Boolean resposta : respostas) {
			if (resposta) {
				nota++;
			}
		}
		return nota;
	}
}
