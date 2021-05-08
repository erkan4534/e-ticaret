package dataAccess;

import entities.concretes.User;

public interface UserProcess {
    boolean register(User user);
    boolean login(User user);
}
