package dataAccess;

import entities.concretes.User;

public interface UserDao {
    boolean register(User user);
    boolean login(User user);
}
