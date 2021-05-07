package business.concretes;

import business.abstracts.UserService;
import dataAccess.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

    private UserDao userDao;

    private UserValidation userValidation;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
        userValidation= new UserValidation();
    }

    @Override
    public void register(User user) {
        if(!userValidation.isValidUserRegister(user)){
            return;
        }
        if(userDao.register(user)){
            System.out.println("User is registered");
        }else{
            System.out.println("User already is exist");
        }
    }

    @Override
    public void login(User user) {
        if(userDao.login(user)){
            System.out.println("User login in the system");
        }else{
            System.out.println("User not login,please check your password and email");
        }

    }

}
