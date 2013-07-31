package br.senai.sc.model.negocio;

/**
 * classe que representa as transportadoras do software
 *
 * @version 1.0 31/07/13
 * @author elivelton_sipriano
 */
public class Transportadora extends PessoaJuridica {

    private String tipoTransporte;
    private double precoFrete;

    public Transportadora() {
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }
}
