package core;

import entities.concretes.User;

public interface RegisterAdapter {

    public boolean register(User user);

    public boolean login(User user);
}
