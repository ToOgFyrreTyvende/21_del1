package dal;

import dto.UserDTO;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAODisk implements IUserDAO {

    List<UserDTO> user_list = new ArrayList<>();


    public UserDAODisk() throws IOException {
    }

    public void open_file(){

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

        user_list.add(new UserDTO());

        try{

            FileOutputStream fos = new FileOutputStream("src\\main\\resources\\disk.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user_list);

            oos.close();
            fos.close();


        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }

    @Override
    public void updateUser(UserDTO user) throws DALException {

    }

    @Override
    public void deleteUser(int userId) throws DALException {

    }
}
