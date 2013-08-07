package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.Produto;
import br.senai.sc.percistencia.FuncionarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class JanelaPrincipal {

    public static void main(String[] args) {    
        List<Funcionario>  funcionarios = new ArrayList<>();
        List<Produto>  produtos = new ArrayList<>();
        
               
//Vetor dinâmico para armazenar os  cadastrados.

        
        
        mostraMenu(funcionarios,produtos);
        




    }

    public static void mostraMenu( List<Funcionario> funcionarios, List<Produto>  produtos ) {
        JanelaFuncionario jf = new JanelaFuncionario();
        JanelaProduto jp = new  JanelaProduto();

        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe  opção:" + "\n1 - Funcionário" + "\n2 - Produto" + "\n3 - fornecedor" + "\n4 - Transportadora" + "\n5 - Sair"));


            switch (opcao) {
                case 1:
                    jf.menuFuncionario(funcionarios);
                    break;
                case 2:
                    jp.menuProduto(produtos);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inexistente");

            }
        } while (opcao != 0);



    }
}
