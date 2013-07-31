package br.senai.sc.percisttencia;

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
//Vetor dinâmico para armazenar os funcionarios cadastrados.

    private List<Funcionario> funcionarios = new ArrayList<>();
//Métodos para adicionar um funcionário no vetor de funcionários.

    public void adicionar(Funcionario f) {
        funcionarios.add(f);
        JOptionPane.showMessageDialog(null, "Funcionario" + "adicionado com sucesso.");
    }
}
