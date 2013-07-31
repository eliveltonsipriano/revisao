package br.senai.sc.model.negocio;

/**
 * classe que representa os clientes fisicos do software
 *
 * @version 1.0 31/07/13
 * @author elivelton_sipriano
 */
public class ClientePF extends PessoaFisica {

    private Double nrConta;
    private double LimiteCompra;
    private char categoria;
    private int qtVezesComprou;
    private double v1TotalGasto;

    public ClientePF() {
    }

    public Double getNrConta() {
        return nrConta;
    }

    public void setNrConta(Double nrConta) {
        this.nrConta = nrConta;
    }

    public double getLimiteCompra() {
        return LimiteCompra;
    }

    public void setLimiteCompra(double LimiteCompra) {
        this.LimiteCompra = LimiteCompra;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getQtVezesComprou() {
        return qtVezesComprou;
    }

    public void setQtVezesComprou(int qtVezesComprou) {
        this.qtVezesComprou = qtVezesComprou;
    }

    public double getV1TotalGasto() {
        return v1TotalGasto;
    }

    public void setV1TotalGasto(double v1TotalGasto) {
        this.v1TotalGasto = v1TotalGasto;
    }
}
