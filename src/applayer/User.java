package applayer;

/**
 * Created by jonb on 13/03/17.
 */
public class User {

    public boolean validUserCredentials(String sUserName, String sPassword)
    {
        if (sUserName.equals("jonb@kea.dk") && sPassword.equals("123"))
        {
            return true;
        }
        return false;
    }
}
