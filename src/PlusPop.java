import java.util.ArrayList;

/**
 * Created by bruno on 19/10/15.
 */
public class PlusPop {

    private ArrayList<User> users;
    private User userLoggedIn;

    public PlusPop() {
        users = new ArrayList<User>();
        userLoggedIn = null;
    }

    public void attachUser(User user) throws Exception {

        try {

            this.users.add(user);

        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }

    public void userLogin(User user) throws Exception {

        User usuario = findUsuario(user.getEmail());
        usuario.setOnline(true);
    }

    public void userLogout(User user) throws Exception {

        User usuario = findUsuario(user.getEmail());
        usuario.setOnline(false);

    }

    public ArrayList<User> getUsuarios() {
        return users;
    }


    public User findUsuario(String email) {
        for (User usuario : users) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }

    public String userDetails(String atributo, String email) throws Exception {

            User user = findUsuario(email);

            String retorno = "";

            if (atributo.equals("Nome")) {
                retorno = user.getNome();
            } else if (atributo.equals("Data de Nascimento")) {
                retorno = String.valueOf(user.getDataNasc());
            } else if (atributo.equals("Foto")) {
                retorno = user.getImagem();
            } else if (atributo.equals("Senha")) {
                throw new Exception("A senha dx usuarix eh protegida.");
            }

        return retorno;

    }
}
