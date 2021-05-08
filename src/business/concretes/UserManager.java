package business.concretes;

import business.abstracts.UserService;
import dataAccess.UserProcess;
import entities.concretes.User;

public class UserManager implements UserService {

    private UserProcess userProcess;

    private UserValidation userValidation;

    public UserManager(UserProcess userProcess) {
        this.userProcess = userProcess;
        userValidation= new UserValidation();
    }

    @Override
    public void register(User user) {
        if(!userValidation.isValidUserRegister(user)){
            return;
        }
        if(userProcess.register(user)){
            System.out.println("User is registered");
        }else{
            System.out.println("User already is exist");
        }
    }

    @Override
    public void login(User user) {
        if(userProcess.login(user)){
            System.out.println("User login in the system");
        }else{
            System.out.println("User not login,please check your password and email");
        }

    }

}
