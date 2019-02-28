import functionality.IUserFunctionality;
import functionality.UserFunctionality;
import ui.TUI;
import data.dal.*;
import data.dto.UserDTO;

import java.io.IOException;
import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) throws IOException, IUserDAO.DALException {

        //utils.SQLTools.generateTable();
        //IUserDAO daoDisk = new UserDAODisk();
        IUserDAO daoMySQL = new UserDAOMySQL();
        IUserFunctionality userFunc = new UserFunctionality(daoMySQL);
        TUI ui = new TUI(userFunc);

        ui.showMenu();
    }
}