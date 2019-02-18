package dal;

import dto.UserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public class MySQLDAO implements IUserDAO {
    private Connection con;
    private Statement s;

    public MySQLDAO() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(
                    "jdbc:mysql://" + System.getenv("DB_URL") + "/" + System.getenv("DB_USER"),
                    System.getenv("DB_USER"),System.getenv("DB_PASS"));
            s = con.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public UserDTO getUser(int userId) throws DALException {
        return null;
    }

    @Override
    public List<UserDTO> getUserList() throws DALException {
        return null;
    }

    @Override
    public void createUser(UserDTO user) throws DALException {

    }

    @Override
    public void updateUser(UserDTO user) throws DALException {

    }

    @Override
    public void deleteUser(int userId) throws DALException {

    }
}
