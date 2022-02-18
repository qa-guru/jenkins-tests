package tests.owner;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class OwnerTests {
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @Test
    void loginTest() {
        String login = config.login();
        String password = config.password();

        System.out.println("Login: " + login);
        System.out.println("Password: " + password);

//        String message = "I logged in as " + login + " with password " + password;
        String message = format("I logged in as %s with password %s", login, password);
        System.out.println(message);
    }
}
