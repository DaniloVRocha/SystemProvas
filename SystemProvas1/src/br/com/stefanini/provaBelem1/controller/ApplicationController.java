package br.com.stefanini.provaBelem1.controller;

import javax.swing.JOptionPane;

import br.com.stefanini.provaBelem1.entities.Usuario;

public class ApplicationController {

	public static void main(String[] args) {

		try {
			TelaController tCont = new TelaController();
			Usuario usuario = new Usuario(tCont.apresentacao());
			tCont.chamarComponentes(usuario.getNome());
			JOptionPane.showMessageDialog(null, "SystemProvas Encerrado");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
