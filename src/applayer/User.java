package applayer;

public class User {

    public boolean validUserCredentials(String sUserName, String sPassword)
    {
        if (sUserName.equals("123") && sPassword.equals("123"))
        {
            return true;
        }
        return false;
    }
}
