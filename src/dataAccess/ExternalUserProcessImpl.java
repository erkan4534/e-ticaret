package dataAccess;

import core.RegisterAdapter;
import entities.concretes.User;

public class ExternalUserProcessImpl implements UserProcess {

    private RegisterAdapter registerAdapter;

    public ExternalUserProcessImpl(RegisterAdapter registerAdapter) {
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
