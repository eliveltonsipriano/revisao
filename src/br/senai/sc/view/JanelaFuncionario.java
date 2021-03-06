/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.percistencia.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author elivelton_sipriano
 */
public class JanelaFuncionario {

    public void menuFuncionario(List<Funcionario> funcionarios) {
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
                    adicionaFuncionario(funcionarios);
                    break;
                case 2:
                    removeFuncionario(funcionarios);
                    break;
                case 3:
                    alteraFuncionario(funcionarios);
                    break;
                case 4:
                    break;
                case 5:
                    listaFuncionarios(funcionarios);

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção incorreta");

            }
        } while (opcao != 6);
    }

    void adicionaFuncionario(List<Funcionario> funcionarios) {
        Funcionario f = new Funcionario();
        f.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário"));
        f.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do funcionário"));
        f.setRg(JOptionPane.showInputDialog("Informe o numero do RG do funcionário"));
        f.setCpf(JOptionPane.showInputDialog("Informe o numero do cpf do funcionário"));
        f.setEndereco(JOptionPane.showInputDialog("Informe o endereço do funcionário"));
        f.setTelefone(JOptionPane.showInputDialog("Informe o telefone do funcionário"));
        f.setDataCadastro(JOptionPane.showInputDialog("Informe a data do cadastro do funcionário"));
        f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do funcionário")));
        f.setDataAmissao(JOptionPane.showInputDialog("Informe a data admissao do funcionário"));
        f.setCtps(JOptionPane.showInputDialog("Informe o numero do ctps do funcionário"));
        f.setCargo(JOptionPane.showInputDialog("Informe o cargo do funcionário"));
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.adicionar(f, funcionarios);
    }

    private void listaFuncionarios(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.listar(funcionarios);
    }

    private void removeFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionario a ser excluido");

        dao.excluir(nome, funcionarios);
    }

    private void alteraFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionario a ser alterado");

        Funcionario fAltera = new Funcionario();
        fAltera = dao.buscaFuncionarioByNome(nome, funcionarios);
        if (fAltera != null) {
            Funcionario f1 = new Funcionario();
            f1.setNome(JOptionPane.showInputDialog("Informe o nome d funcionario", fAltera.getNome()));
            f1.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do funcionário", fAltera.getDataNascimento()));
            f1.setRg(JOptionPane.showInputDialog("Informe o numero do RG do funcionário", fAltera.getRg()));
            f1.setCpf(JOptionPane.showInputDialog("Informe o numero do cpf do funcionário", fAltera.getCpf()));
            f1.setEndereco(JOptionPane.showInputDialog("Informe o endereço do funcionário", fAltera.getEndereco()));
            f1.setTelefone(JOptionPane.showInputDialog("Informe o telefone do funcionário", fAltera.getTelefone()));
            f1.setDataCadastro(JOptionPane.showInputDialog("Informe a data do cadastro do funcionário", fAltera.getDataCadastro()));
            f1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do funcionário", fAltera.getSalario())));
            f1.setDataAmissao(JOptionPane.showInputDialog("Informe a data admissao do funcionário", fAltera.getDataAmissao()));
            f1.setCtps(JOptionPane.showInputDialog("Informe o numero do ctps do funcionário", fAltera.getCtps()));
            f1.setCargo(JOptionPane.showInputDialog("Informe o cargo do funcionário", fAltera.getCargo()));
            dao.altera(nome, funcionarios, f1);
        } else {
            JOptionPane.showInternalMessageDialog(null, "Funcionario" + nome + "não existente");
        }
    }
}