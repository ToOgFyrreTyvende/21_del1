package dal;

import dto.UserDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDAOMySQL implements IUserDAO {
    public Connection createConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            return DriverManager.getConnection(
                    "jdbc:mysql://" + System.getenv("DB_URL") + "/" + System.getenv("DB_USER"),
                    System.getenv("DB_USER"),System.getenv("DB_PASS"));
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    public UserDTO getUser(int userId) throws DALException {
        try{
            Connection c = createConnection();
            //.....
            c.close();
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
        return null;
    }

    @Override
    public List<UserDTO> getUserList() throws DALException {
        try{
            Connection c = createConnection();
            //.....
            c.close();
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
        return null;
    }

    @Override
    public void createUser(UserDTO user) throws DALException {
        try{
            Connection c = createConnection();
            //.....
            c.close();
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }    }

    @Override
    public void updateUser(UserDTO user) throws DALException {
        try{
            Connection c = createConnection();
            //.....
            c.close();
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }    }

    @Override
    public void deleteUser(int userId) throws DALException {
        try{
            Connection c = createConnection();
            //.....
            c.close();
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        }
    }
}
