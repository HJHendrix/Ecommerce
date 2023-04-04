package ecommerce.model;

import java.util.ArrayList;

public class Usuario {
    private int idUsuario;
    private String nomeUsuario;
    private String emailUsuario;
    private int senhaUsuario;
    private String cpfUsuario;
    
    Endereco endereco = new Endereco();
    ArrayList<Endereco> listarEndereco = new ArrayList<>();

    public usuario(int idUsuario,String nomeUsuario,String emailUsuario,int senhaUsuario,String cpfUsuario){
        this.idUsuario=idUsuario;
        this.nomeUsuario=nomeUsuario;
        this.emailUsuario=emailUsuario;
        this.senhaUsuario=senhaUsuario;
        this.cpfUsuario=cpfUsuario;

    }

    public void cadastrarUsuario(usuario){
        this.usuario=usuario;
    }
    public void editarUsuario(usuario){
        this.usuario=usuario;
    }
    public void removerUsuario(usuario){
        this.usuario=null;
    }
    public void listarUsuario(usuario){
        return usuario;
    }
}
