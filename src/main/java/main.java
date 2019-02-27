import data.dal.IUserDAO;
import data.dal.UserDAOMySQL;
import data.dto.UserDTO;

public class main {
    public static void main(String[] args) {
        utils.SQLGenerator.generateTable();
        IUserDAO sqlstuff = new UserDAOMySQL();
        UserDTO user = new UserDTO();

        user.setUserId(11);
        user.setUserName("dummy");
        user.setPassword("12345");
        user.setIni("DD");
        user.setCpr("123456-7890");
        user.addRole("Admin");

        try {
            sqlstuff.createUser(user);
            sqlstuff.getUser(11);
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }
    }
}
