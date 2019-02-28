package data.dal;

import data.dto.UserDTO;

import java.sql.*;
import java.util.List;

import static utils.SQLTools.createConnection;

public class UserDAOMySQL implements IUserDAO {
    //TODO: implement this shit

    @Override
    public UserDTO getUser(int userId) throws DALException {
        Connection c = createConnection();
        UserDTO user = new UserDTO();
        ResultSet rs = null;
        try{
            Statement stmt = c.createStatement();
            rs = stmt.executeQuery("select * from 21_d1_users where userid =" + userId);
            if(rs.first()){
                user.setUserId(userId);
                user.setUserName(rs.getString(2));
                user.setIni(rs.getString(3));
                user.addRole(rs.getString(4));
            }
            c.close();
        } catch (NullPointerException N){
            throw new NullPointerException("Looks like it went bad, nullPointExeption");
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        } finally {
            if (rs == null) {
                System.out.println("doesn't seem like there exist a user with that userID");
            } else {
                System.out.println("You successfully got the user you were looking for");
            }
        }
        return user;
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
        Connection c = createConnection();
        int rs = 0;
        try {
            Statement stmt = c.createStatement();
            rs = stmt.executeUpdate("insert into 21_d1_users values('" + user.getUserId() + "','" + user.getUserName() + "','" + user.getIni() + "','" + user.getRoles().get(0) + "')");
            c.close();
        } catch (NullPointerException N){
            throw new NullPointerException("Looks like it went bad, nullPointExeption");
        } catch (SQLException de) {
            throw new DALException(de.getMessage());
        }   finally {
            if (rs == 0) {
                System.out.println("Doesn't seem like you created your user");
            } else {
                System.out.println("You successfully created a user");
            }
        }
    }

    @Override
    public void updateUser(UserDTO user) throws DALException {
        Connection c = createConnection();
        int rs = 0;
        try {
            Statement stmt = c.createStatement();
            rs = stmt.executeUpdate("update from 21_d1_users set userName ='"+user.getUserName()+"', ini = '"+user.getIni()+"', roles = '"+user.getRoles().get(0)+"' where userId ="+user.getUserId());
            c.close();
        }catch (NullPointerException N){
            throw new NullPointerException("Looks like it went bad, nullPointExeption");
        }catch (SQLException e) {
            throw new DALException(e.getMessage());
        } finally {
            if (rs == 0) {
                System.out.println("doesn't seem like there is a user to update");
            } else {
                System.out.println("You have successfully updated your user");
            }
        }
    }

    @Override
    public void deleteUser(int userId) throws DALException {
        Connection c = createConnection();
        int rs = 0;
        try{
            Statement stmt = c.createStatement();
            rs = stmt.executeUpdate("delete from users where userId = " + userId);
            c.close();
        } catch (NullPointerException N){
            throw new NullPointerException("Looks like it went bad, nullPointExeption");
        } catch (SQLException e) {
            throw new DALException(e.getMessage());
        } finally {
            if (rs == 0) {
                System.out.println("doesn't seem like there is a user to update");
            } else {
                System.out.println("You have successfully deleted a user");
            }
        }
    }
}
