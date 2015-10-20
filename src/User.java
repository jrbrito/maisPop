/**
 * Created by bruno on 16/10/15.
 */
public class User {


    protected String email;
    protected String senha;
    protected String dataNasc;
    protected String imagem;
    protected String nome;
    protected boolean online;

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {

        if (nome == null || nome.isEmpty() || nome.trim().isEmpty()) {

             throw new Exception("Erro no cadastro de Usuarios. Nome dx usuarix nao pode ser vazio.");

        } else {

            this.nome = nome;

        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }


}
