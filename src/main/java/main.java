import data.dal.*;
import data.dto.UserDTO;

import java.io.IOException;
import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) throws IOException, IUserDAO.DALException {

        UserDTO user = new UserDTO();
        IUserDAO dao = new UserDAODisk();

// ---------------------------------------------------------------------------------------------------------------------
/*
        user.setUserId(0);
        user.setUserName("ADMIN");
        user.setIni("ADM");

        dao.createUser(user);
*/

        //dao.deleteUser(1);
        System.out.println(dao.getUserList());

    }
}
