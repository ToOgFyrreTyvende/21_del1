package dal;

import dto.UserDTO;

import java.util.List;

public class UserDAODisk implements IUserDAO {
    //TODO: implement this shit

    public UserDAODisk() {
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
