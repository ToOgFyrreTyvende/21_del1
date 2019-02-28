package data.dal;

import data.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UserDAOMemory implements IUserDAO {
    //TODO: implement this shit

    List<UserDTO> users;
    UserDTO user = new UserDTO();

    public UserDAOMemory() {
        users = new ArrayList<>();
    }

    @Override
    public UserDTO getUser(int userId) throws DALException {
        return user;
    }

    @Override
    public List<UserDTO> getUserList() throws DALException {
        return users;
    }

    @Override
    public void createUser(UserDTO user) throws DALException {
        users.add(user);
    }

    @Override
    public void updateUser(UserDTO user) throws DALException {
        int userID = user.getUserId();

        int i = 0;
        for (UserDTO upUser : users){
            if (upUser.getUserId() == userID){
                users.set(i,upUser);
            }
            i++;
        }
    }

    @Override
    public void deleteUser(int userId) throws DALException {
        users.remove(userId);
    }
}
