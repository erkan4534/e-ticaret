package dataAccess;

import core.RegisterAdapter;
import entities.concretes.User;

public class ExternalRegister implements UserDao{

    private RegisterAdapter registerAdapter;

    public ExternalRegister(RegisterAdapter registerAdapter) {
        this.registerAdapter = registerAdapter;
    }

    @Override
    public boolean register(User user) {

        if(registerAdapter.register(user)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean login(User user) {

        if(registerAdapter.login(user)){
            return true;
        }else{
            return false;
        }

    }
}
