package aplicacao;

import xadrez.PartidaXadrez;

public class ProgPrincipal {

	public static void main(String[] args) {
		
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		UI.printTabuleiro(partidaXadrez.getPeca());

	}

}
