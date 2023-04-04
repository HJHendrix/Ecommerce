package ecommerce.model;

import java.util.ArrayList;

public class Produto {
    private int idProduto;
    private String nomeProduto;
    private float precoProduto;
    private int qtdEstoque;
    

    Fornecedor fornecedor = new Fornecedor();
    ArrayList<Fornecedor> listarFornecedor = new ArrayList<>();

    public produto (int idProduto,String nomeProduto,float precoProduto,int qtdEstoque){
        this.idProduto=idProduto;
        this.nomeProduto=nomeProduto;
        this.precoProduto=precoProduto;
        this.qtdEstoque=qtdEstoque;
    }
    public void cadastrarProduto(produto){
        this.produto=produto;
    }
    public void removerProduto(idProduto){
        this.idProduto=null;
    }
    public void listarProduto(produto) {
        return produto;
    }
}
