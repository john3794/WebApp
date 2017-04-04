package AppLayer;

import DataLayer.*;

public class User {

    public boolean validUserCredentials(String sUserName, String sPassword)
    {
        /*Database db = new Database();
        return db.validLogin(sUserName, sPassword);*/


        if (sUserName.equals("123") && sPassword.equals("123"))
        {
            return true;
        }
        return false;


    }
}
