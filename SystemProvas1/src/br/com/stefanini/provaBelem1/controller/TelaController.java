package br.com.stefanini.provaBelem1.controller;



import javax.swing.JOptionPane;



public class TelaController {
	private Integer opcao;

	public String apresentacao() {
		String nome = JOptionPane.showInputDialog(null, "Bem Vindo, Digite seu Nome:");
		return nome;
	}

	public void chamarComponentes(String nome) {
		String menuPrincipal =  "========//==============// ========== // ================\n"
				+"Bem Vindo, " + nome + "! \n "
				+ "========//==============// ========== // ================ \n"
				+"Selecione uma opção para continuar: \n "
				+ "1 - Responder a prova \n "
				+ "2 - Finalizar SystemProvas \n ";
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal +" Insira uma opção:"));
		switch(opcao) {
		case 1:
			
			ProvaController pCont = new ProvaController();
			JOptionPane.showMessageDialog(null,"Seu desempenho final é : "  + pCont.gerarProva() + "/5");
			
			break;
		case 2:
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Desculpe, Opção invalida");
			break;
		}
		}while(opcao != 3);
 }
}


