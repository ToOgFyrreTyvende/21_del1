import ui.TUI;
import data.dal.*;
import data.dto.UserDTO;

import java.io.IOException;
import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) throws IOException, IUserDAO.DALException {
    	utils.SQLGenerator.generateTable();
        TUI ui = new TUI();
        UserDTO user = new UserDTO();
        IUserDAO daoDisk = new UserDAODisk();
        IUserDAO daoMySQL = new UserDAOMySQL();

// ---------------------------------------------------------------------------------------------------------------------
        /* daoMySQL test
        user.setUserId(11);
        user.setUserName("dummy");
        user.setPassword("12345");
        user.setIni("DD");
        user.setCpr("123456-7890");
        user.addRole("Admin");
        
        try {
            daoMySQL.createUser(user);
            daoMySQL.getUser(11);
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }
        */
        /* daoDisk test
        user.setUserId(0);
        user.setUserName("ADMIN");
        user.setIni("ADM");

        daoDisk.createUser(user);
        */

        //daoDisk.deleteUser(1);
        System.out.println(daoDisk.getUserList());
        ui.showMenu();
    }
}