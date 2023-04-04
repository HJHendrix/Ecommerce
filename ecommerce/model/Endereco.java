package ecommerce.model;

public class Endereco{
    private String id;
    private String logradouro;
    private String cidade;
    private String estado;
    private String bairro;
    private String cep;

    public endereco(String id,String logradouro,String cidade,String estado,
    String bairro,String cep){
        this.id=id;
        this.logradouro=logradouro;
        this.cidade=cidade;
        this.estado=estado;
        this.bairro=bairro;
        this.cep=cep;
    }

    public void cadastrarEndereco(endereco){
        this.endereco=endereco;
    }
    public void editarEndereco(endereco){
        this.endereco=endereco;
    }
    public void removerEndereco(endereco){
        this.endereco=null
    }
    public void listarEndereco(endereco){
        return endereco;
    }
}