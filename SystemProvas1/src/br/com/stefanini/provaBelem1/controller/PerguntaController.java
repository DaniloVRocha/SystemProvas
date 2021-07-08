package br.com.stefanini.provaBelem1.controller;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.stefanini.provaBelem1.entities.Pergunta;

public class PerguntaController {

	public List<Boolean> lerPerguntas(List<Pergunta> perguntas, List<Boolean> respostas) {

		String respostaDoUsuario;
		Boolean respostaCerta;

		for (Pergunta p : perguntas) {
			respostaDoUsuario = JOptionPane.showInputDialog(null, p + " \n Resposta: ");

			if (respostaDoUsuario.toUpperCase().equals(p.getGabarito())) {
				JOptionPane.showMessageDialog(null, "Resposta Certa");
				respostaCerta = true;
			} else {
				JOptionPane.showMessageDialog(null, "Resposta Errada, a resposta certa é letra:" + p.getGabarito());
				respostaCerta = false;
			}

			respostas.add(respostaCerta);
		}
		return respostas;
	}
}
