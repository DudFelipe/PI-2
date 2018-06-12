package br.senac.LojaEletronicos.Servico;

import br.senac.LojaEletronicos.BLL.ProdutoBLL;
import br.senac.LojaEletronicos.DAO.ProdutoDao;
import br.senac.LojaEletronicos.Modelos.Produto;
import java.util.List;
/**
 *
 * @author giovanebarreira
 */
public class ServicoProduto {
    public static List<String> casdastrarProduto(Produto produto){
        List<String> resposta = null;
        
        resposta = ProdutoBLL.validaProduto(produto);
        
        System.out.println("TESTE 01");
        if(resposta == null){
            System.out.println("TESTE 02");
            try{
                ProdutoDao.inserirProduto(produto);
            }catch(Exception e){
                e.printStackTrace();
                resposta.add("Ërro na fonte de dados!");
            }
        }
        return resposta;
    }
    
    public static List<String> atualizarProduto(Produto produto){
        List<String> resposta = null;
        
        resposta = ProdutoBLL.validaProduto(produto);
        
        if(resposta == null){
            try{
                ProdutoDao.atualizarProduto(produto);
            }catch(Exception e){
                e.printStackTrace();
                resposta.add("Erro na fonte de dados");
            }
        }
        return resposta;
    } 
    
     public static List<String> excluirProduto(Integer id) {
        List<String> resposta = null;

        try {
            ProdutoDao.excluirProduto(id);
        } catch (Exception e) {
            e.printStackTrace();
            resposta.add("Erro na fonte de dados");
        }
        return resposta;
    }
     
     //Caso o tipo receba 0, a busca deve ser feita por nome
    public static List<Produto> procurarProduto(String s, int tipo){
        List<Produto> listaResposta = null;
        
        try{
            if(s == null || s.equals("")) {
                listaResposta = ProdutoDao.listarProdutos();
            }else{
                listaResposta = ProdutoDao.procurar(s, tipo);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaResposta;
    }
    
    public static Produto obterProduto(Integer id) {
        Produto produtoResposta = null;

        try {
            produtoResposta = ProdutoDao.obter(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produtoResposta;
    }
}
