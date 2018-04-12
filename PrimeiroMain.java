package br.com.sls.monitoria.principal;

import javax.swing.JOptionPane;

import br.com.sls.monitoria.modelo.CartaoDeCredito;
import br.com.sls.monitoria.modelo.Pessoa;
import br.com.sls.monitoria.modelo.Produto;

public class PrimeiroMain {
	public static void main(String[] args) {
		// Declarando os objetos
		Produto livro = new Produto(1, "Livro de Java", 200.00);
		CartaoDeCredito cartaoDeCredito /*variavel do tipo cartão de credito*/ = new CartaoDeCredito("Ourocard", "Visa"); /*criando o cartão*/
		Pessoa pessoa = new Pessoa("Paula", "00022233345", cartaoDeCredito);
		//CartaoDeCredito CartaoDeDebito = new CartaoDeCredito ("Bradesco", "MasterCard");
		//CartaoDeCredito CartaoDeRefeicao = new CartaoDeCredito("Ticket"); 
		

		// Recuperando Modalidade de Pagamento
		int respostaTipoCompra = Integer
				.parseInt(JOptionPane.showInputDialog(" 1 - Funcao Crédito \n 2 - Funcao Débito"));

		// Recuperando Senha
		String senha = JOptionPane.showInputDialog("Digite sua senha");
		String mensagem = "";

		if (respostaTipoCompra == 1) {
			// Realizando compra no crédito
			mensagem = pessoa.getCartaoDeCredito().realizarCompraCredito(livro, senha);
		} else {
			// Realizando compra no débito
			mensagem = pessoa.getCartaoDeCredito().realizarCompraDebito(livro, senha);
		}

		JOptionPane.showMessageDialog(null, mensagem);
	}
}
