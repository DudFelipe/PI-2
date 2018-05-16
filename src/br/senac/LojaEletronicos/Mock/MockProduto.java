package br.senac.LojaEletronicos.Mock;

import br.senac.LojaEletronicos.Modelos.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giovanebarreira
 */
public class MockProduto {
    
    //Inteiro para controlar os ID dos produtos de forma sequencial
    private static int sequenciaIdProdutos = 0;
    
    //Lista que irá conter os produtos cadastrados na memória
    private static List<Produto> listaProdutos = new ArrayList<Produto>();
    
    //Inserindo um produto
    public static void inserirProduto(Produto produto) throws Exception {
        //Adiciona um ID e incrementa a sequencia
        produto.setIdProduto(sequenciaIdProdutos++);
        
        //Adiciona o produto na lista
        listaProdutos.add(produto);    
    }
    
    //Atualizar um produto
    
    public static void atualizarProduto(Produto produto) throws Exception {
        //Verifica se existe pelo menos um produto cadastrado
        if (produto != null && produto.getIdProduto() != null && listaProdutos.size() > 0){
        
            int contador = 0;
            boolean produtoAtualizado = false;
            
            //Enquanto o cliente ainda não tiver sido atualizado
            while(contador < listaProdutos.size() && !produtoAtualizado){
                
                //Armazena o cliente atual da lista
                Produto produtoLista = listaProdutos.get(contador);
                
                 //Verifica se esse cliente é o cliente que estamos buscando para atualizar, caso seja, atualiza todos os dados
                 
                if (produtoLista != null && produtoLista.getIdProduto() == produto.getIdProduto()) {
                   produtoLista.setNome(produto.getNome());
                   produtoLista.setFabricante(produto.getFabricante());
                   produtoLista.setModelo(produto.getModelo());
                   produtoLista.setPreco(produto.getPreco());
                   produtoLista.setQuantidade(produto.getQuantidade());
                   produtoLista.setDimensoes(produto.getDimensoes());
                   produtoLista.setObservacoes(produto.getObservacoes());

                   //Indica que o produto já foi atualizado para sair do loop
                   produtoAtualizado = true;
                }
                
                //Caso o produto não tenha sido encontrado, avança para o próximo
                contador++; 
            }
        }else{
            //Caso não exista nenhum produto, informa o usuário
            throw new Exception("Não há produtos para atualizar!");
        }
    }
    
    public static void excluirProduto(int id) throws Exception{
        if(listaProdutos.size() > 0){
            int contadorPosicao = 0;
            boolean produtoRemovido = false;
            
            while(contadorPosicao < listaProdutos.size() && !produtoRemovido){
                Produto produtoLista = listaProdutos.get(contadorPosicao);
                
                if(produtoLista != null && produtoLista.getIdProduto() == id){
                    listaProdutos.remove(contadorPosicao);
                    produtoRemovido = true;
                }
            }
        }else{
            throw new Exception ("Não há produtos para remover!");
                
        }
    }
        
        public static List<Produto> listarProdutos() throws Exception{
            return listaProdutos;
        }
        
         //Caso o tipo receba 0, a busca deve ser feita pelo nome do produto;
        
        public static List<Produto> procurar(String valor, int tipo) throws Exception{
            //Lista para armazenar os dados resultantes da busca
            List<Produto> listaProdutoResultado = new ArrayList<Produto>();
         
            //Caso exista algum item na lista
            if(valor != null && listaProdutos.size() > 0){
                //Contado para verificar se ainda há produtos na lista
                int contadorPosicao = 0;
                
                //caso existam produtos na lista
                while(contadorPosicao < listaProdutos.size()){
                    
                    //armazena o produto atual
                    Produto produtosLista = listaProdutos.get(contadorPosicao);
                    
                    if(tipo == 0 ){//caso o tipo da busca seja 0 (busca por nome)
                        if(produtosLista != null && produtosLista.getNome() != null){// verfiica se o produto nao esta null
                            if(produtosLista.getNome().contains(valor)){ // verifica se o nome do produto possui algo igual na String valor
                                listaProdutoResultado.add(produtosLista); // caso true, insere o produto na lista
                            }
                        }
                    }
                    if(tipo == 1){
                        if(produtosLista != null && produtosLista.getFabricante()!= null){// verfiica se o produto nao esta null
                            if(produtosLista.getFabricante().contains(valor)){ // verifica se o fabricante do produto possui algo igual na String valor
                                listaProdutoResultado.add(produtosLista); // caso true, insere o produto na lista
                            }
                        }
                    }
                    if(tipo == 2){
                        if(produtosLista != null && (!(Float.isNaN(produtosLista.getPreco())))){// verfiica se o produto nao esta null
                            if(produtosLista.getPreco() == Float.valueOf(valor) ){ // verifica se o preco do produto possui algo igual na String valor
                                listaProdutoResultado.add(produtosLista); // caso true, insere o produto na lista
                            }
                        }
                    }
                    contadorPosicao++; // passa para o proximo produto cadastrado
                }
        }else{ // Caso nao exista nenhum dado cadastrado, informar erro
                throw new Exception("Não há dados para pesquisa!");
            }
            
            for(int i = 0; i < listaProdutoResultado.size(); i++){
                System.out.println(listaProdutoResultado.get(i).getNome());
            }
            return listaProdutoResultado; // Retorna a lista com os clientes encontrados na busca
        }
        
        public static Produto obter(int id) throws Exception{
            if(listaProdutos.size() > 0){
                int contadorPosicao = 0;
                while(contadorPosicao < listaProdutos.size()){
                    Produto produtosLista = listaProdutos.get(contadorPosicao);
                    
                    if(produtosLista != null && produtosLista.getIdProduto() != null && produtosLista.getIdProduto() == id){
                       
                        return produtosLista;
                    }
                    contadorPosicao++;
                }
            }else{
                throw new Exception("Não há dados para pesquisa!");
            }
            return null;
        }
}
