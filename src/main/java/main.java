import data.dal.*;
import data.dto.UserDTO;

import java.io.IOException;
import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) throws IOException, IUserDAO.DALException {

        UserDTO user = new UserDTO();
        IUserDAO dao = new UserDAODisk();

// ---------------------------------------------------------------------------------------------------------------------

        user.setUserId(1);
        user.setUserName("Nicklas");
        user.setIni("NRD");

        //dao.createUser(user);


        //dao.deleteUser(1);
        dao.updateUser(user);
        System.out.println(dao.getUserList());

    }
}
