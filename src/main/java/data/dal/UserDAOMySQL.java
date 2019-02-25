package data.dal;

import data.dto.UserDTO;

import java.sql.*;
import java.util.List;

import static utils.SQLGenerator.createConnection;

public class UserDAOMySQL implements IUserDAO {
    //TODO: implement this shit

    @Override
    public UserDTO getUser(int userId) throws DALException {
        try{
            UserDTO user = new UserDTO();
            Connection c = createConnection();
            ResultSet rs = c.;
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
