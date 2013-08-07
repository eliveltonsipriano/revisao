
package br.senai.sc.percistencia;


import br.senai.sc.model.negocio.Produto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author elivelton_sipriano
 */
public class ProdutoDAO {
    
     public void adicionar(Produto p,List<Produto> produtos) {
       produtos.add(p);
        JOptionPane.showMessageDialog(null, "Produto " + " adicionado com sucesso.");
    }
    //metodo que lista todos os funcionarios 

    public void listar(List<Produto> produtos) {
        String msg = "";
        for (Produto p : produtos) {
            msg = msg + "\nNome:" + p.getNome()
                    + "\nMarca:"+p.getMarca()
                    +"\nPreço:"+p.getPreco();
             
          


        }
        JOptionPane.showMessageDialog(null, msg);

    }

    public void excluir(String nome, List<Produto> produtos) {

        Produto pRemove = null;
        for (Produto p : produtos) {
            if (p.getNome().equals(nome)) {
            } else {
                pRemove = p;
            }


        }
        produtos.remove(pRemove);
    }

    public void altera(String nome, List<Produto> produtos,Produto fAltera) {
        excluir(nome, produtos);
        adicionar(fAltera, produtos);
    }

    public Produto buscaProdutoByNome(String nome, List<Produto> produtos) {
        for ( Produto pBusca : produtos) {
            if (pBusca.getNome().equals(nome)) {
                return pBusca;
            }
        }
        return null;
    }
}

    

