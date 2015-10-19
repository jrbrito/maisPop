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

    public void addUser(User user) throws ArrayIndexOutOfBoundsException {

        try {

            this.users.add(user);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
            e.printStackTrace();
        }

    }

}
