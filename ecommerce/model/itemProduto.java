package ecommerce.model;

import java.util.ArrayList;

public class itemProduto {
    private int idItensProduto;
    private int quantidade;
    
    Produto produto = new Produto();
    ArrayList<Produto> listarProduto = new ArrayList<>();

    public itemProduto(int idItensProduto,int quantidade){
        this.idItensProduto=idItensProduto;
        this.quantidade=quantidade;

    }
    public void cadastrarItemProduto(itemProduto){
        this.itemProduto=itemProduto;
    }
}
