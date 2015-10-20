import java.io.IOException;
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

}
