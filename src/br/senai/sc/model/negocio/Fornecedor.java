package br.senai.sc.model.negocio;

/**  classe que representa o Fornecedor do software
 *
 * @version 1.0 31/07/13
 *
 * @author elivelton_sipriano
 */
public class Fornecedor extends PessoaJuridica {
    private String tipoProduto;

    public Fornecedor() {
    }
    

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
}
