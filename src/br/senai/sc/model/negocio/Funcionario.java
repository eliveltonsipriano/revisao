package br.senai.sc.model.negocio;

/**
 * classe que representa os funcionarios do software
 *
 * @version 1.0 31/07/13
 * @author elivelton_sipriano
 */
public class Funcionario extends PessoaFisica {

    static int id_funcionario;
    private double salario;
    private String dataAmissao;
    private String ctps;
    private String cargo;
    private int codigo;

    public Funcionario() {
        id_funcionario++;
        codigo = id_funcionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAmissao() {
        return dataAmissao;
    }

    public void setDataAmissao(String dataAmissao) {
        this.dataAmissao = dataAmissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
