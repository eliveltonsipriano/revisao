/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import br.senai.sc.model.negocio.Produto;

import br.senai.sc.percistencia.ProdutoDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author elivelton_sipriano
 */
public class JanelaProduto {

    public void menuProduto(List<Produto> produtos) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada:"
                    + "\n1 - Inserir"
                    + "\n2 - Excluir"
                    + "\n3 - Alterar"
                    + "\n4 - Buscar"
                    + "\n5 - Listar"
                    + "\n6 - Sair"));
            switch (opcao) {
                case 1:
                    adicionaProduto(produtos);
                    break;
                case 2:
                    removeProduto(produtos);
                    break;
                case 3:
                    alteraProduto(produtos);
                    break;
                case 4:
                    break;
                case 5:
                    listaProduto(produtos);

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção incorreta");

            }
        } while (opcao != 6);
    }

    void adicionaProduto(List<Produto> produtos) {
        Produto p = new Produto();
        p.setNome(JOptionPane.showInputDialog("Informe o nome do Produto"));
        p.setMarca(JOptionPane.showInputDialog("Informe a marca do produto"));

        ProdutoDAO dao = new ProdutoDAO();
        dao.adicionar(p, produtos);
    }

    private void listaProduto(List<Produto> produtos) {
        ProdutoDAO dao = new ProdutoDAO();
        dao.listar(produtos);
    }

    private void removeProduto(List<Produto> produtos) {
        ProdutoDAO dao = new ProdutoDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do produto a ser excluido");

        dao.excluir(nome, produtos);
    }

    private void alteraProduto(List<Produto> produtos) {
        ProdutoDAO dao = new ProdutoDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do produto a ser alterado");

        Produto pAltera = new Produto();
        pAltera = dao.buscaProdutoByNome(nome, produtos);
        if (pAltera != null) {
            pAltera.setNome(JOptionPane.showInputDialog("Informe o nome do Produto", pAltera.getNome()));

        } else {
            JOptionPane.showInternalMessageDialog(null, "Produto" + nome + "não existente");
        }
    }
}
