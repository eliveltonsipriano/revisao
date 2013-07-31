/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import javax.swing.JOptionPane;

/**
 *
 * @author elivelton_sipriano
 */
public class JanelaPrincipal {

    public void mostraMenu(int opcao) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe  opção:" + "\n1 - Funcionário" + "\n1 - Cliente" + "\n1 - fornecedor" + "\n1 - Transportadora" + "\n1 - Sair")
        
        }
        
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
    }
}
