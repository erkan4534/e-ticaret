import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GoogleRegisterAdapter;
import dataAccess.ExternalRegister;
import dataAccess.UserRegister;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setId(1);
        user.setPassword("123");
        user.setName("Ali");
        user.setSurname("Kaya");
        user.setEmail("ali.kaya@gmail.com");

        UserService userService = new UserManager(new ExternalRegister(new GoogleRegisterAdapter()));
        userService.login(user);

    }
}
