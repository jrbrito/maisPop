import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bruno on 16/10/15.
 */
public class User {


    protected String email;
    protected String senha;
    protected Date dataNasc;
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

    public void setEmail(String email) throws Exception {

        Pattern padrao = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher verificador = padrao.matcher(email);

        if (verificador.find()) {

            this.email = email;

        } else {

            throw new Exception("Erro no cadastro de Usuarios. Formato de e-mail esta invalido.");
        }

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNasc() {

        return dataNasc;
    }

    public void setDataNasc(String dataNasc) throws Exception {

        DateFormat padrao = new SimpleDateFormat("dd/MM/yyyy");

        padrao.setLenient(false);

        String[] day = dataNasc.split("/");

        if (day[0].length() > 2) {

            throw new Exception("Erro no cadastro de Usuarios. Formato de data esta invalida.");

        } else if (Integer.parseInt(day[0]) > 31) {

            throw new Exception("Erro no cadastro de Usuarios. Data nao existe.");

        } else {

            this.dataNasc = padrao.parse(dataNasc);
        }
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }


}
