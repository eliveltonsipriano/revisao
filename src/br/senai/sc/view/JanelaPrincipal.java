package br.senai.sc.view;

import javax.swing.JOptionPane;

public class JanelaPrincipal {

    public static void main(String[] args) {
    }

    public void mostraMenu() {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe  opção:" + "\n1 - Funcionário" + "\n1 - Cliente" + "\n1 - fornecedor" + "\n1 - Transportadora" + "\n1 - Sair"));


            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inexistente");

            }
        } while (opcao != 0);



    }
}
