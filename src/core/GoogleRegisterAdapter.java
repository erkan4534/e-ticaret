package core;

import entities.concretes.User;

public class GoogleRegisterAdapter implements RegisterAdapter {

    public boolean register(User user) {
        GoogleRegisterApi googleRegisterApi = new GoogleRegisterApi();
        return googleRegisterApi.register(user);
    }

    public boolean login(User user) {
        GoogleRegisterApi googleRegisterApi = new GoogleRegisterApi();
        return googleRegisterApi.register(user);
    }
}
