import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GoogleRegisterAdapter;
import dataAccess.ExternalUserProcessImpl;
import dataAccess.InternalUserProcessImpl;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setId(1);
        user.setPassword("123");
        user.setName("Ali");
        user.setSurname("Kaya");
        user.setEmail("ali.kaya@gmail.com");

        UserService userService1 = new UserManager(new ExternalUserProcessImpl(new GoogleRegisterAdapter()));
        userService1.login(user);

        UserService userService2 = new UserManager(new InternalUserProcessImpl());
        userService2.login(user);

    }
}
