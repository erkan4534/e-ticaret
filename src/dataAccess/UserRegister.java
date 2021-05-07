package dataAccess;

import entities.concretes.User;

public class UserRegister implements UserDao{

    @Override
    public boolean register(User user) {

        System.out.println("User added in the system");

        return true;
    }

    @Override
    public boolean login(User user) {

        return true;
    }
}
