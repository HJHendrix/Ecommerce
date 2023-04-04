package ecommerce.model;

public class Fornecedor{
    private int idFornecedor;
    private String nomeFornecedor;
    private String cnpjFornecedor;
    
    public fornecedor(int idFornecedor, String nomeFornecedor, String cnpjFornecedor){
        this.idFornecedor=idFornecedor;
        this.nomeFornecedor=nomeFornecedor;
        this.cnpjFornecedor=cnpjFornecedor;
    }
    public void cadastraFornecedor(fornecedor){
        this.fornecedor=fornecedor;
    }
    public void listarFornecedor(fornecedor){
        return fornecedor;
    }
}
