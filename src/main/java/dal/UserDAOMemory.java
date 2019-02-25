package dal;

import dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UserDAOMemory implements IUserDAO {
    //TODO: implement this shit

    List<UserDTO> users;

    public UserDAOMemory() {
        users = new ArrayList<>();
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
