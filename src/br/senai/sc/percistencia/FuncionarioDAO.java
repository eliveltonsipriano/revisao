package br.senai.sc.percistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * classe que guardas as informações referentes aos funcionarios.
 *
 * @version 1.0 31/07/13
 * @author elivelton_sipriano
 */
public class FuncionarioDAO {

    public void adicionar(Funcionario f, List<Funcionario> funcionarios) {
        funcionarios.add(f);
        JOptionPane.showMessageDialog(null, "Funcionario " + " adicionado com sucesso.");
    }
    //metodo que lista todos os funcionarios 

    public void listar(List<Funcionario> funcionarios) {
        String msg = "";
        for (Funcionario f : funcionarios) {
            msg = msg + "\nNome:" + f.getNome()
                    + "\nData de Nascimento:" + f.getDataNascimento()
                    + "\nRg:" + f.getRg()
                    + "\nCpf" + f.getCpf()
                    + "\nEndereço:" + f.getEndereco()
                    + "\nTelefone:" + f.getTelefone()
                    + "\nData cadastro:" + f.getDataCadastro()
                    + "\nSalario:" + f.getSalario()
                    + "\nData admissão;" + f.getDataAmissao()
                    + "\nCargo:" + f.getCargo()
                    + "\nId:" + f.getCodigo();
            JOptionPane.showMessageDialog(null, msg);



        }

    }

    public void excluir(String nome, List<Funcionario> funcionarios) {

        Funcionario fRemove = null;
        for (Funcionario f : funcionarios) {
            if (f.getNome().equals(nome)) {
                fRemove = f;
            }


        }
        funcionarios.remove(fRemove);
    }

    public void altera(String nome, List<Funcionario> funcionarios, Funcionario fAltera) {
        excluir(nome, funcionarios);
        adicionar(fAltera, funcionarios);
    }

    public Funcionario buscaFuncionarioByNome(String nome, List<Funcionario> funcionarios) {
        for (Funcionario fBusca : funcionarios) {
            if (fBusca.getNome().equals(nome)) {
                return fBusca;
            }
        }
        return null;
    }
}
